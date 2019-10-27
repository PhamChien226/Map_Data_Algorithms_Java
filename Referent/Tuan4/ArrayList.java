package tuan4;

public class ArrayList<E extends Comparable<E>> {
	public static final int capacity = 20; // do dai mac dinh;
	private E[] data;
	private int size = 0;

	public ArrayList() {
		this(capacity);
	}

	public ArrayList(int capacity) {
		data = (E[]) new Comparable[capacity];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if (i < 0 || i >= n)
			throw new IndexOutOfBoundsException("Illegal index: " + i);

	}

	public String toString() {
		String s = "[";
		int i = 0;
		while (true) {
			if (i == size) {
				break;
			}
			s += data[i].toString();
			i++;
			if (i < size) {
				s += ", ";
			}
		}
		return s + "]";
	}

	public void add(int i, E e) throws IndexOutOfBoundsException, IllegalStateException {
		checkIndex(i, size + 1);
		if (size == data.length) {
			throw new IllegalStateException("Array is full");
		}
		for (int k = size - 1; k >= i; k--)
			data[k + 1] = data[k];

		data[i] = e;
		size++;
	}

	public void add(E e) throws IndexOutOfBoundsException, IllegalStateException {
		add(size, e);
	}

	public void remove(int i) throws IndexOutOfBoundsException, IllegalStateException {
		checkIndex(i, size);
		if (i < size + 1) {
			data[i] = null;
			for (int k = i; k < size; k++) {
				data[k] = data[k + 1];
			}
		}
		size = size - 1;
	}

	public void remove(E e) throws IndexOutOfBoundsException, IllegalStateException {

		int i = 0;
		while (i < size) {
			if (data[i] == e) {
				data[i] = null;
				for (int k = i; k < size; k++) {
					data[k] = data[k + 1];
				}
				break;
			}

			i++;
		}
		size--;
	}

	public int search(E e) {
		int result = 0;
		for (int i = 0; i < size; i++) {
			if (data[i] == e) {
				result = i;
			}
		}
		return result;
	}

	public void selectionSort() {
		int j = 0;
		while (j < size - 1) {
			E min = data[j];
			int n = j;
			E temp;
			for (int i = j; i < size; i++) {
				if (data[i].compareTo(min) == 1) {
					min = data[i];
					n = i;
				}
			}
			temp = data[j];
			data[j] = min;
			data[n] = temp;
			j++;
		}
	}

	public static void main(String[] args) {
		ArrayList<Student> listStudent = new ArrayList<>();
		// tao Student
		Student s1 = new Student("Nguyen Van A", 6.8);
		Student s2 = new Student("Huynh Manh B", 5.5);
		Student s3 = new Student("Doan Van C", 7.1);
		Student s4 = new Student("Nguyen Thanh D", 6.3);
		Student s5 = new Student("Tran Hong E", 7.4);
		
		// THEM
		listStudent.add(s1);
		listStudent.add(s2);
		listStudent.add(1, s4);
		listStudent.add(s5);
		listStudent.add(3, s3);
		System.out.println("Danh sach ban dau ");
		System.out.println(listStudent);
		// TIM
		System.out.print("Tim kiem: ");
		System.out.println(s3+ " nam o vi tri: "+listStudent.search(s3));
		// Sap xep
		System.out.println("Sau khi sap xep theo diem TB: ");
		listStudent.selectionSort();
		System.out.println(listStudent);
		
		// Xoa
		System.out.print("Xoa :"+s1);
		listStudent.remove(s1);
		System.out.println("Danh sach sau khi xoa:");
		System.out.println(listStudent);
	}
}
