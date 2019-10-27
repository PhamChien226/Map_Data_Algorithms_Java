package Iterator;

import DoublyLinkedList.DoublyLinkedList;
import DoublyLinkedList.Node;

public class DoublyLinkedListIterator<E> implements MyIterator<E> {
	private Node header;
	private Node trailer;
	private Node NodeCurrent;
	private int size;

	public DoublyLinkedListIterator(Node header, Node trailer, int size) {
		this.header = header;
		this.trailer = trailer;
		this.size = size;
		this.NodeCurrent = header;
	}
	
	public boolean isEmpty() {
//		if(header.getNext() =)
		return header.getNext() ==  trailer;
	}

	@Override
	public boolean hasNext() {
		if (NodeCurrent.getNext() == trailer) {
			NodeCurrent = trailer;
		}
		return NodeCurrent.getNext() != null;
	}

	@Override
	public E next() {
		E next;
//		if(current == header) {
//			current = current.getNext();
//		}
		NodeCurrent = NodeCurrent.getNext();
		next = (E) NodeCurrent.getElements();

		return next;
	}

	@Override
	public boolean hasPrev() {
		return NodeCurrent.getPrev() != null;
	}

	@Override
	public E prev() {
		E prev;
//		if(current == trailer) {
//			current = current.getPrev();
//		}
		NodeCurrent = NodeCurrent.getPrev();
		prev = (E) NodeCurrent.getElements();

		return prev;
	}

	@Override
	public void remove() {
		Node<E> prev = NodeCurrent.getPrev();
		Node<E> next = NodeCurrent.getNext();

		prev.setNext(next);
		next.setPrev(prev);

		NodeCurrent.setNext(null);
		NodeCurrent.setPrev(null);
		NodeCurrent.setElements(null);
		NodeCurrent = prev;
	}
	
	public void remove(E e)  {
//		DoublyLinkedList<E> list = new DoublyLinkedList<>();
		while(hasNext()) {
			NodeCurrent = NodeCurrent.getNext();
			if(NodeCurrent.getElements() == e) {
				Node<E> prev = NodeCurrent.getPrev();
				Node<E> next = NodeCurrent.getNext();

				prev.setNext(next);
				next.setPrev(prev);

				NodeCurrent.setNext(null);
				NodeCurrent.setPrev(null);
				NodeCurrent.setElements(null);
			}
		}
		NodeCurrent = header;
	}

	public DoublyLinkedList<E> sort() {
		DoublyLinkedList<E> listSorted = new DoublyLinkedList<>();
		
		//Selection Sort
		E max = null;
		//chọn phần tử trong list và thêm vào list mới
		while (hasNext()) {
			//khoi tao max là giá trị đầu tiên trong list
			max = (E) header.getNext().getElements();
			
			// find max
			//duyệt từ khi NodeCurrent là header cho đến khi NodeCurrent là phần tử cuối
			while (hasNext()) {
				//NodeCurrent là biến lặp ( tượng tự i trong for)
				NodeCurrent = NodeCurrent.getNext();
				E valueElemetnsCurrrent = (E) NodeCurrent.getElements();

				// check E has implements Comparable?
				if (valueElemetnsCurrrent instanceof Comparable<?>) {
					// "<" sap xep tăng dần
					if (((Comparable) valueElemetnsCurrrent).compareTo(max) < 0) {
						max = valueElemetnsCurrrent;
					}
				}
				else {
					// tạo một exception trong trường hợp lớp không implements Comparable
				}
			}
			//sửa hasNext() lại là true
			NodeCurrent = header;
			//dời phần tử từ list cũ sang list mới
			listSorted.addLast(max);
			remove(max);
		}
		return listSorted;
	}
}
