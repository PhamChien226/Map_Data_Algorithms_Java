package ArrayIterator;

public class ArrayIterator<E> implements Iterator {
	E[] items;// ArrayList duyet
	int size;// kich thuoc ArrayList
	int count = 0;// vi tri hien tai trong ArrayList
	E current;// phan tu hien tai dang check

	//minh can mot bien de xac thuc vi tri phan tu cuoi cung trong mang
	//chung ta size, co data
	//cu cho current la vi tri cua phan tu hien tai
	//count la so phan tu co trong mang
	public ArrayIterator(E[] items, int size) {
		this.items = items;
		this.size = size;//so phan tu co trong mang
		current= items[count];
	}

	@Override
	public boolean hasNext() {
		return count < size;
	}

	@Override
	public E next() {
		count++;
		current = items[count];
		return items[count-1];
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
