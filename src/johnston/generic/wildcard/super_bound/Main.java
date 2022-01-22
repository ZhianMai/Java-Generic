package johnston.generic.wildcard.super_bound;

import johnston.generic.wildcard.shapes.Rectangle;
import johnston.generic.wildcard.shapes.Shape;
import johnston.generic.wildcard.shapes.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<? super Shape> listA = new ArrayList<>();
    addShape(listA, new Square(1));
    addShape(listA, new Rectangle(2));
    printShape(listA);
  }

  public static void addShape(List<? super Shape> list, Shape a) {
    list.add(a);
  }

  public static void printShape(List<? super Shape> list) {
    for (int i = 0; i < list.size(); i++) {
      // Cannot call list.get(i).draw(), they're all cast to Object type
      System.out.println(list.get(i).toString());
    }
  }
}
