package johnston.generic.basic.clazz;

import java.util.Deque;
import java.util.LinkedList;

public class MyStackFastImpl<E> implements MyStack<E> {
  // private E[] array = new E[2];
  private Deque<E> deque = new LinkedList<>();

  public E pop() {
    return deque.pollFirst();
  }

  @Override
  public void push(E e) {
    deque.offerFirst((E)e);
  }

  public int size() {
    return deque.size();
  }

  public boolean isEmpty() {
    return deque.isEmpty();
  }
}
