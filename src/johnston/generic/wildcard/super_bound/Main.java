package johnston.generic.wildcard.super_bound;

import johnston.generic.wildcard.shapes.Circle;
import johnston.generic.wildcard.shapes.Rectangle;
import johnston.generic.wildcard.shapes.Shape;
import johnston.generic.wildcard.shapes.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // listA can be: List<Object>, List<Shape>, or List<Rectangle>
    List<? super Rectangle> listA;
    // listA= new ArrayList<Shape>();
    listA = new ArrayList<Object>();
    // listA = new ArrayList<Rectangle>()

    // The element e added to listA should satisfy:
    // can adding e to List<Object>,
    // can adding e to List<Shape>,
    // and can adding e to List<Rectangle>
    Shape circle = new Circle(3);
    listA.add(null); // yes
    // listA.add(new Object()); // fail
    // listA.add(circle); // fail
    listA.add(new Rectangle(1)); // yes
    listA.add(new Square(2)); // yes
  }

  public static void printShape(List<? super Shape> list) {
    for (int i = 0; i < list.size(); i++) {
      // Cannot call list.get(i).draw(), they're all cast to Object type
      // System.out.println(list.get(i).draw());
      System.out.println(list.get(i).toString());
    }
  }
}

