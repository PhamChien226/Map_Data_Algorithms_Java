package DoublyLinkedList;

import Iterator.DoublyLinkedListIterator;
import Iterator.MyIterator;
import LinkedList.LinkedList;

public class DoublyLinkedList<E> {
	private Node<E> header;// con tro dau
	private Node<E> trailer; // con tro cuoi
	private int size = 0;// so phan tu hien co trong danh sach

	public DoublyLinkedList() {
		trailer = new Node<>(null, null,header);// tao trailer null
		header = new Node<>(null, trailer,null);// tao header tro den trailer
	}

	public Node<E> getHeader() {
		return header;
	}

	public Node<E> getTrailer() {
		return trailer;
	}

	public int getSize() {
		return size;
	}

	// kiem tra danh sach rong
	public boolean isEmpty() {
		return size == 0;
	}

	// add elements in position first
	public void addFirst(E e) {
		// de add mot phan tu thi
		// new node, gan next cua no la next cua header
		// gan next cua header vao phan tu nay
		Node<E> newest = new Node<>(e, header.getNext(),header);
		header.setNext(newest);
		trailer.setPrev(newest);
	}

	public void addLast(E e) {
		// de add mot phan tu vao cuoi thi
		// new mot node co next la trailer
		// duyet de tim phan tu cuoi va gan next vao phan tu nay
		// duyet bang cach new node va tim next co phai trailer hay khong
		Node<E> newest = new Node<>(e, trailer,null);
		// phan tu trung gian de duyet, khoi la la phan tu dau tien cua mang
		Node<E> p = header;
		// neu getnext la trailer thi duyet xong
		while (p.getNext() != trailer) {
			p = p.getNext();
		}
		// ket qua o day se la phan tu cuoi cua mang
		p.setNext(newest);//set next 
		newest.setPrev(p);//set prev
		trailer.setPrev(newest);
	}

//		public void addAfter(E e, Node node) {
//			//de them mot phan tu sau mot phan tu 
//			// thi ta setnext vao trailer 
//			//
//			Node<E> newest = new Node<>(e,node)
//		}
//	public addBetween(E)

	public String toString() {
		// co mot danh sach la 1 2 3
		// muon in ra 1 2 3
		// muon in mot danh sach thi phai in tungg phan tu cua danh sach
		// muon in tung phan tu trong danh sach thi phai dung phan tu do goi toString
		// dau tien duyet danh sach, khong lay phan tu header va trailer
		// tao ra mot String de luu tru
		// duyet tung phan tu va goi ham toString cho den khi next là trailer
		String str = "";
		Node<E> p = header;
		while (p.getNext() != trailer) {
			// them dau phay
			// khi chay den phan tu cuoi thi se khong chay ham nay
			if (str != "") {
				str += ", ";
			}
			p = p.getNext();
			str += p.toString();
		}

		return "[" + str + "]";
	}
	
	public MyIterator<E> iterator(){
		return new DoublyLinkedListIterator<E>(header, trailer, size);
	}

	public DoublyLinkedList<E> sort() {
		DoublyLinkedList<E> listSorted = new DoublyLinkedList<>();
		MyIterator<E> iter = this.iterator();
		listSorted = iter.sort();

		return listSorted;
	}

}
