package ArrayIterator;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(5);
		myList.add(6);
		myList.add(7);
		myList.add(8);
		
		Iterator<Integer> iter = myList.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		
		
	}

}
