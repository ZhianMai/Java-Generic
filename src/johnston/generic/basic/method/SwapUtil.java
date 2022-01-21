package johnston.generic.basic.method;

public class SwapUtil {
  public static <E> void arraySwap(E[] arr, int i, int j) {
    E temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static <E> E testReturn(E e) {
    if (e == null) {
      return null;
    }
    return e;
  }
}
