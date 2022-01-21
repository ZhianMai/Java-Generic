package johnston.generic.basic.clazz;

public class Main {
  public static void main(String[] args) {
    MyStack<String> stackA = new MyStackFastImpl<>();
    stackA.push("One");
    stackA.push("Two");
    stackA.push("Three");

    System.out.println(stackA.pop());
    System.out.println(stackA.pop());
    System.out.println(stackA.pop());

    MyStack<Integer> stackB = new MyStackRawImpl<>(Integer.class);
    int size = 10;

    for (int i = 0; i < size; i++) {
      stackB.push(i);
    }

    for (int i = 0; i < size; i++) {
      System.out.print(stackB.pop() + ",");
    }
  }
}
