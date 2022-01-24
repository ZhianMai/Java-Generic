package johnston.generic.wildcard.extend_bound;

import johnston.generic.wildcard.shapes.Circle;
import johnston.generic.wildcard.shapes.Shape;
import johnston.generic.wildcard.shapes.Square;

import java.util.ArrayList;
import java.util.List;

// Notice: this code is for demo purpose, so it does not follow general
// software engineering rules or principles.
public class BasicExtend {
  // It declares a generic type E which extends Shape, and the E
  // can reuse within its scope.
  public static <E extends Shape> void drawShape(E e) {
    List<E> aList = new ArrayList<>();
    aList.add(e);
    drawHelper(aList);
  }

  // Wildcard is like anonymous class which declares and init only once.
  public static void drawHelper(List<? extends Shape> list) {
    // Tell the compiler that the elements in the list extends Shape, so
    // they can use .draw()
    list.get(0).draw();
    // list.add(null);
  }

  public static void main(String[] args) {
    Shape circle = new Circle(1);
    drawShape(circle);

    Square square = new Square(1);
    drawShape(square);
  }
}
