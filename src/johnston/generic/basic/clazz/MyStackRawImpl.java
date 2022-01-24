package johnston.generic.basic.clazz;

import java.lang.reflect.Array;

public class MyStackRawImpl<E> implements MyStack<E> {
  // Cannot do this:
  // private E[] array = new E[2];
  private E[] array;
  private int cap = 2;
  private int size = 0;
  Class<E> clazz;

  public MyStackRawImpl(Class<E> clazz) {
    this.clazz = clazz;
    // Using Java reflection
    array = (E[]) Array.newInstance(clazz, cap);
  }

  @Override
  public void push(E e) {
    if (size == cap) {
      cap *= 2;
      E[] newArr = (E[]) Array.newInstance(this.clazz, cap);

      for (int i = 0; i < size; i++) {
        newArr[i] = array[i];
        array[i] = null;
      }

      array = newArr;
    }

    array[size++] = e;
  }

  @Override
  public E pop() {
    if (size == 0) {
      return null;
    }

    E temp = array[--size];
    array[size] = null;
    return temp;
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public boolean isEmpty() {
    return this.size() == 0;
  }
}
