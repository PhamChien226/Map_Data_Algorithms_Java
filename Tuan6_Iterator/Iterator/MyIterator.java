package Iterator;
/*
 * duyet danh sach tu dau den cuoi
 * hien thuc ham remove cua ham eterator
 * di nguoc ve tu cuoi di ve
 * prev() va hasPrev()
 */

import DoublyLinkedList.DoublyLinkedList;

public interface MyIterator<E> {

	public boolean hasNext();
	public E next();
	public boolean hasPrev();
	public E prev();
	public void remove();
	
//	public void sort();
	//ket hop sap xep selection Sort
}
