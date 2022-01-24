package johnston.generic.basic.method;

public class Main implements Comparable {
  @Override
  public int compareTo(Object o) {
    return 0;
  }

  public final void finalMethod() {
    System.out.println("This is a final method");
  }

  public void otherMethod() {
    System.out.println("This is not a final method");
  }

  public static void main(String[] args) {
    String[] strArray = new String[2];
    strArray[0] = "a";
    strArray[1] = "b";
    System.out.println("Before swapping String[]: " + strArray[0] + "-" + strArray[1]);
    SwapUtil.arraySwap(strArray, 0, 1);
    System.out.println("After swapping String[]: " +
        SwapUtil.testReturn(strArray[0]) + "-" + strArray[1]);

    int[][] intArray = new int[2][1];
    intArray[0][0] = 1;
    intArray[1][0] = 2;
    System.out.println("\nBefore swapping int[][]: " + intArray[0][0] + "-" + intArray[1][0]);
    SwapUtil.arraySwap(intArray, 0, 1);
    System.out.println("After swapping int[][]: " + intArray[0][0] + "-" + intArray[1][0]);

    Integer[] intArr = new Integer[2];
    intArr[0]  = 1;
    intArr[1] = 2;
    SwapUtil.arraySwap(intArr, 0, 1);
  }
}
