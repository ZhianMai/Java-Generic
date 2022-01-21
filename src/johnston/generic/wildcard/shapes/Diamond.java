package johnston.generic.wildcard.shapes;

public class Diamond extends Shape {
  private int id = 0;

  public Diamond(int id) {
    this.id = id;
  }

  @Override
  public void draw() {
    System.out.println("Diamond " + id);
  }
}
