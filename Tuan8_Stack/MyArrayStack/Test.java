package MyArrayStack;

import java.util.Stack;

import MyLinkedStack.MyLinkedStack;

public class Test {
	public static void main(String args[]) {

//		MyArrayStack<String> toDoList = new MyArrayStack<String>();
		Stack<String> toDoList = new Stack<String>();
		toDoList.push("Learn English");
		toDoList.push("Reseach Document");
		toDoList.push("Create Plan");

		System.out.println(toDoList.size());
		System.out.println(toDoList.isEmpty());
//		System.out.println(toDoList.top());
		System.out.println(toDoList.pop());
//		System.out.println(toDoList.top());
		System.out.println(toDoList.size());

		System.out.println(toDoList);
//		System.out.println(toDoList.toStringwithPop());
		
		
	}
}
