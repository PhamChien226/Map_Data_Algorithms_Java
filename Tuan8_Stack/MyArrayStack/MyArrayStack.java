package MyArrayStack;

import java.util.ArrayList;
import java.util.LinkedList;

import MyStack.MyStack;

public class MyArrayStack<E> implements MyStack<E> {
	private ArrayList<E> list = new ArrayList<E>();

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void push(E e) {
		list.add(0, e);
	}

	@Override
	public E top() {
		
		return list.get(0);
	}

	@Override
	public E pop() {
		E ElementsOfTop = list.get(0);
		list.remove(0);
		return ElementsOfTop;
	}
	
	public String toString() {
		return list.toString();
	}

	
//	public String toStringwithPop() {
//		String allElementsOfList = "";
//		MyArrayStack<E> listClone = new MyArrayStack<E>();
//		listClone = (MyArrayStack<E>) list.clone();
//		
//		while(!listClone.isEmpty()) {
////			if(allElementsOfList != "") {
////				allElementsOfList += ", ";
////			}
//			
//			allElementsOfList += listClone.pop();
//			
//		}
//		return allElementsOfList;
//		
//	}

}
