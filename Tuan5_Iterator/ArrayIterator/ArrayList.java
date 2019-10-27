package ArrayIterator;

import java.util.Locale.Category;

public class ArrayList<E> {
	private int CAPACITY = 20;
	private E[] data;
	private int size;// kich thuoc toi da cua mang
	private int count=0;//so phan tu co trong mang
	
	//default
	public ArrayList() {
		this.data = (E[]) new Object[CAPACITY];
		this.size = CAPACITY;
//		this.count++;
	}
	
	public ArrayList(int size) {
		this.data = (E[]) new Object[size];
		this.size = size;
//		this.count++;//moi khi new mot phan tu thi tang count len
	}
	
	public void add(E elemments) {
		data[count] = elemments;
		count++;//them mot phan tu thi tang count len
	}
	
	public Iterator iterator() {
		return new ArrayIterator(this.data,this.count);
	}

}
