package johnston.generic.wildcard.basic;

import java.util.ArrayList;
import java.util.List;

public class DataOutput {
  public static void printData(List<?> list) {
    System.out.println("Data: " + list.toString());
  }

  public static void main(String[] args) {
    List<String> strList = new ArrayList<>();
    strList.add("a");
    strList.add("b");
    strList.add("c");
    printData(strList);

    List<Integer> intList = new ArrayList<>();
    intList.add(1);
    intList.add(2);
    intList.add(3);
    printData(intList);

    List<?> dataList = new ArrayList<>();
    // Cannot write data on a wildcard type except "null"
    // dataList.add(1);
    // dataList.add("a");
    dataList.add(null);
    dataList = strList;
    printData(dataList);

    // Any generic types of ArrayList can assign to Wildcard decoration variable
    dataList = new ArrayList<Integer>();
    // Cannot add elements
    // dataList.add(1);
    dataList = new ArrayList<String>();
  }
}
