package DoublyLinkedList;

import Iterator.MyIterator;
import java.util.*;

import ArrayList.Student;

public class Test {

	public static void main(String args[]) {
		DoublyLinkedList<String> toDoList = new DoublyLinkedList<String>();
		toDoList.addLast("Learn English");
		toDoList.addLast("Discus with Team");
		toDoList.addLast("Find Job");
		toDoList.addLast("A");
		toDoList.addLast("B");
		toDoList.addLast("C");

		DoublyLinkedList<Integer> listInteger = new DoublyLinkedList<>();
		listInteger.addLast(1);
		listInteger.addLast(8);
		listInteger.addLast(2);

		DoublyLinkedList<Student> listStudent = new DoublyLinkedList<>();
		listStudent.addLast(new Student("Chiến", 8));
		listStudent.addLast(new Student("Long", 10));
		listStudent.addLast(new Student("Hoàng", 7));

		System.out.println(toDoList.sort());
		listInteger = listInteger.sort();
		System.out.println(listInteger);
		System.out.println(listStudent.sort());
		

//		MyIterator<String> iter = toDoList.iterator();

//		while (iter.hasNext()) {
//			String value = iter.next();
//			System.out.println(value);
//		}
////		System.out.println(toDoList);
//		String value = iter.prev();
//		System.out.println(value);
//		iter.remove();
//		System.out.println(toDoList);

	}
}
