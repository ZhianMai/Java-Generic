package johnston.generic.wildcard.extend_bound;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterfaceExtend {
  public static <E extends List> void printData(E e) {
    System.out.println("Data: " + e.toString());
  }

  public static void main(String[] args) {
    ArrayList<Integer> intList = new ArrayList<>();
    intList.add(1);
    intList.add(2);
    intList.add(3);
    printData(intList);

    LinkedList<String> strList = new LinkedList<>();
    strList.add("a");
    strList.add("b");
    strList.add("c");
    printData(strList);
  }
}
