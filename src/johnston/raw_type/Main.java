package johnston.raw_type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List rawList = new ArrayList();
    // List<Object> rawList =...
    rawList.add(new Object());
    rawList.add((Object)("abc"));
    rawList.add((Object)(new Integer(666)));

    System.out.println(rawList.get(1));
    System.out.println(rawList.get(2));

    // Need type cast
    String str = (String)rawList.get(1);
    Integer num = (Integer)rawList.get(2);
    // Runtime ClassCastException
    // String str2 = (String)rawList.get(2);
  }
}
