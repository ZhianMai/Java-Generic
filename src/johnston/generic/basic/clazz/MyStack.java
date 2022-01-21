package johnston.generic.basic.clazz;

public interface MyStack<E> {
  public void push(E e);
  public E pop();
  public int size();
  public boolean isEmpty();
}
