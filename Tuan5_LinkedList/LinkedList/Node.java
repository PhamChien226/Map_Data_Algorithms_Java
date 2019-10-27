package LinkedList;

public class Node<E> {
	private E elements;// luu tru phantu
	private Node<E> next;// tro den phan tu tiep theo trong list
	
	public Node(E e, Node<E> node) {
		this.elements = e;
		this.next = node;
	}

	public E getElements() throws IllegalStateException {
		if(next == null) // dang la trailer khong chua elements
			throw new IllegalStateException("Posison no longer valid");
		else
		return elements;
	}

	public void setElements(E elements) {
		this.elements = elements;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	public String toString() {
		return this.elements + " ";
	}
	
	
	
}
