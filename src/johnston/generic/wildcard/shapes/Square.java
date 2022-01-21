package johnston.generic.wildcard.shapes;

public class Square extends Rectangle {
  public Square(int id) {
    super(id);
  }

  @Override
  public void draw() {
    System.out.print("(Square)");
    super.draw();
  }
}
