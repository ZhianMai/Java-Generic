package johnston.generic.type_erasure;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("Demo of generic type earsure using ArrayList<>: \n");

    List rawList = new ArrayList();
    System.out.println("Type of raw type: " + rawList.getClass());
    List<Integer> intList = new ArrayList<>();
    System.out.println("Type of Integer type: " + intList.getClass());
    List<String> strList = new ArrayList<String>();
    System.out.println("Type of String type: " + strList.getClass());
  }
}
