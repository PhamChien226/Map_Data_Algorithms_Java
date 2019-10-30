package Example;

import MyArrayStack.MyArrayStack;
import MyStack.MyStack;

public class ConvertToBinary {
	
	//convert dec-> binary use Stack
	/*
	 * input : 10
	 * output : 1010
	 * 
	 * public int convertToBinaryuseStack(int decNumber)
	 * 
	 * 10%2 = 0
	 * 5%2 = 1
	 * 2%2 =0
	 * 1%2 =1
	 * 
	 * lưu giá trị vào Stack. sử dụng hàm push
	 * hiển thi ra gọi ham tostring()
	 * 
	 */
	public int convertToBinaryUseStack(int decNumber) {
		MyArrayStack<Integer> stack = new MyArrayStack<>();
		String binNumber = "" ;
		
		//covert to binary
		while(decNumber > 0) {
			stack.push(decNumber % 2);
			decNumber = decNumber / 2;
		}
		//get binary
		while(!stack.isEmpty()) {
			binNumber += stack.pop();
		}
		
		
		return Integer.parseInt(binNumber);
	}

}
