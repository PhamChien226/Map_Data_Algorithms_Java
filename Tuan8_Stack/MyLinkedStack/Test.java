package MyLinkedStack;

import ArrayList.Student;
import DoublyLinkedList.DoublyLinkedList;

public class Test {

	/*
	 * chuyển số thập phân -> nhị phân sử dụng Stack
	 */
	public static void main(String args[]) {

		MyLinkedStack<Student> toDoList = new MyLinkedStack<Student>();
//		toDoList.push("Learn English");
//		toDoList.push("Reseach Document");
//		toDoList.push("Create Plan");

		toDoList.push(new Student("Chiến", 8));
		toDoList.push(new Student("Long", 10));
		toDoList.push(new Student("Hoàng", 7));
		
//		System.out.println(toDoList.size());
//		System.out.println(toDoList.isEmpty());
//		System.out.println(toDoList.top());
		System.out.println("pop run");
		System.out.println(toDoList.pop());
		
		System.out.println(toDoList.top());
		System.out.println(toDoList.size());
		
//		System.out.println(toDoList.toString());
		System.out.println(toDoList.toStringwithPop());
		
	}
}
