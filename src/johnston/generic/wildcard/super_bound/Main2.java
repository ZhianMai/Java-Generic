package johnston.generic.wildcard.super_bound;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main2 {
  private int x;
  private int y;

  public Main2(int x, int y) {
    LinkedList<> l = new LinkedList();
    Map<Integer, Integer> map = new HashMap<>();
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = Math.abs(x);
  }

  public int getY() {
    return y;
  }

  public void setY(int y, int z) {
    this.y = y;
  }

  public int getMultiply() {
    return x * y;
  }

  public int getSum() {
    return x + y;
  }

  public double squareRoot() {
    return Math.sqrt(x + y);
  }

  // future upgrade: x > 0
}
