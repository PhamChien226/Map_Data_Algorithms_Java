package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import Map.MethodOfMap;

public class Test_HashMap {
	public static void main(String[] args) {
		MethodOfMap test = new MethodOfMap();
		Map<String, String> listPhoneBook = new HashMap<String, String>();
		
		//10 so
		listPhoneBook.put(new String("0901234562"), "Võ Duy Tân");
		listPhoneBook.put(new String("0911356894"), "Võ Duy Tân");
		listPhoneBook.put(new String("0939867534"), "Võ Duy Tân");
		
		//viettel 03
		listPhoneBook.put(new String("01623293712"), "Nguyễn Đức Hoàng");
		listPhoneBook.put(new String("01639371234"), "Nguyễn Đức Hoàng");
		listPhoneBook.put(new String("01649371235"), "Nguyễn Đức Hoàng");
		listPhoneBook.put(new String("01659371232"), "Nguyễn Đức Hoàng");
		listPhoneBook.put(new String("01669371235"), "Nguyễn Đức Hoàng");
		listPhoneBook.put(new String("01637937123"), "Nguyễn Đức Hoàng");
		listPhoneBook.put(new String("01682937123"), "Nguyễn Đức Hoàng");
		listPhoneBook.put(new String("01692937123"), "Nguyễn Đức Hoàng");
		
		//mobifone 07
		listPhoneBook.put(new String("01208691732"), "Nguyễn Thành Đức");
		listPhoneBook.put(new String("01216917322"), "Nguyễn Thành Đức");
		listPhoneBook.put(new String("01266917322"), "Nguyễn Thành Đức");
		listPhoneBook.put(new String("01286917322"), "Nguyễn Thành Đức");
		
		//vinaphone 08
		listPhoneBook.put(new String("01231356894"), "La Hoàng Long");
		listPhoneBook.put(new String("01243568942"), "La Hoàng Long");
		listPhoneBook.put(new String("01253568942"), "La Hoàng Long");
		listPhoneBook.put(new String("01273568942"), "La Hoàng Long");
		
		//vietnammobile 05
		listPhoneBook.put(new String("01862686832"), "Hoàng Huy");
		listPhoneBook.put(new String("01882686832"), "Hoàng Huy");
		
		//Gmobile 05
		listPhoneBook.put(new String("01999867534"), "Lê Tấn Phát");
		
		System.out.println("//---------- Câu 1 ----------//");
		System.out.println("Hiện thị danh sách với Iterator\n");
		test.disPlayWithIterator(listPhoneBook);
		
		System.out.println("\n\n//---------- Câu 2 ----------//");
		System.out.println("Xóa sản phầm với key");
		test.remove(listPhoneBook, "01266917322");
		System.out.println("Nguyễn Thành Đức 0866917322 đã bị xóa\n");
		test.disPlayWithIterator(listPhoneBook);
		
		System.out.println("\n\n//---------- Câu 3 ----------//");
		System.out.println("Chuyển đổi sđt 11 số thành 10 số\n");
		listPhoneBook =  test.get10NumberPhone(listPhoneBook);
		test.disPlayWithoutIterator(listPhoneBook);

	}
}
