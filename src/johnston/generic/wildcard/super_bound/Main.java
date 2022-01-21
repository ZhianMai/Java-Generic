package johnston.generic.wildcard.super_bound;

import johnston.generic.wildcard.shapes.Rectangle;
import johnston.generic.wildcard.shapes.Shape;
import johnston.generic.wildcard.shapes.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<? super Shape> listA = new ArrayList<>();
    listA.add(new Square(1));
    listA.add(new Rectangle(2));
    printShape(listA);
  }

  public static void printShape(List<? super Shape> list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i).toString());
    }
  }
}
