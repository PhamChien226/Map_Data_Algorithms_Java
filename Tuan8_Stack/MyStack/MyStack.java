package MyStack;

public interface MyStack<E> {
	public int size();

	public boolean isEmpty();

	public void push(E e);

	public E top();

	public E pop();
	

}
