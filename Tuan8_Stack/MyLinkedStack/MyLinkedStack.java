package MyLinkedStack;

import java.util.LinkedList;

import MyStack.MyStack;

public class MyLinkedStack<E> implements MyStack<E> {
	private LinkedList<E> list = new LinkedList<E>();

	@Override
	public int size() {
		
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

	@Override
	public void push(E e) {
		list.addFirst(e);
	}

	//xac dinh gia tri vi tri dinh Stack
	/*
	 * B1: lay vi tri dinh, header.next()
	 * B2: lay gia tri
	 * B3: return gia tri
	 * 
	 */
	@Override
	public E top() {
//		E top = list.getFirst();
		E top = list.element();
		return top ;
	}
	
	//lấy phần tử ở đỉnh ra khỏi Stack
	@Override
	public E pop() {
		E top = list.element();
		list.remove(0);
		return top;
	}
	
	//toString dung pop
	public String toString() {
		return list.toString();
		
	}
	
	/*
	 * B1: tao mot bien luu
	 * goi ham pop() va in ra gia tri được trả về
	 * cho đến khi list rỗng
	 * => phải clone
	 * B2: clone()
	 * B3: duyệt với isEmpty()
	 * B4: thêm vào str
	 * return String
	 */
	public String toStringwithPop() {
		String allElementsOfList = "";
		LinkedList<E> listClone = new LinkedList<E>();
		listClone = (LinkedList<E>) list.clone();
		
		while(!listClone.isEmpty()) {
			if(allElementsOfList != "") {
				allElementsOfList += ", ";
			}
			
			allElementsOfList += listClone.pop();
			
		}
		return "[" + allElementsOfList + "]";
		
	}
	
	
	
	
}
