package johnston.generic.wildcard.basic;

import johnston.generic.wildcard.shapes.Square;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MixedType {
  public static void main(String[] args) {
    Map<String, Integer> strToInt = new HashMap<String, Integer>();
    Map<String, ?> strToAny = new HashMap<String, Integer>();
    strToAny = strToInt;

    Set<Map<String, Integer>> mapSet = new HashSet<>();
    // Not allowed here. Set<Map<String, ?>> can contain Map<String, String>,
    // Map<String, Character>, Map<String, Integer>... so mapSet cannot assign to
    // this wildcard type
    // Set<Map<String, ?>> wiredSet = mapSet;


    Set<Integer> set = new HashSet<>();
    set.add(1);
    print(set);
  }

  private static <E extends Comparable> void print(Set<E> set) {
    for (E e : set) {
      System.out.print(e + ",");
    }
  }
}

