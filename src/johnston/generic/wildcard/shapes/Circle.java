package johnston.generic.wildcard.shapes;

public class Circle extends Shape {
  private int id = 0;

  public Circle (int id) {
    this.id = id;
  }

  @Override
  public void draw() {
    System.out.println("Circle " + id);
  }
}
