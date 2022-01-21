package johnston.generic.wildcard.shapes;

public class Rectangle extends Shape {
  private int id = 0;

  public Rectangle(int id) {
    this.id = id;
  }

  @Override
  public void draw() {
    System.out.println("Rectangle " + id);
  }
}
