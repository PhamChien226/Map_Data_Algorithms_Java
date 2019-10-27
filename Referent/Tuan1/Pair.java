package tuan1;

import java.util.ArrayList;

public class Pair<A, B>  {
	A first;
	B second;
	public Pair(A a, B b) {
		this.first = a;
		this.second = b;
	}
	public A getFirst() {
		return first;
	}
	public B getSecond() {
		return second;
	}
	public void hienThi_1() {
		System.out.println("Ten: "+first+"	Diem: "+second);	
	}
	public void hienThi_2() {
		System.out.println("Kenh so: "+first+"	 "+second);	
	}
	public  static String timNguoiChoiCaoNhat(ArrayList<Pair<String, Integer>> list) {
		String ketQua ="";
		int max = list.get(0).second;
	
		for(int i = 0;i<list.size();i++) {
			if(list.get(i).second > max) {
				max = list.get(i).second;
				ketQua = "'"+list.get(i).first+"' co diem cao nhat: "+max;
			}
		}
		return ketQua;
	}
	
	public static void main(String[] args) {
		
// p1 p2

		Pair<String, Integer> p1=new Pair<>("Duy", 400);
		Pair<String, Integer> p2=new Pair<>("Dat", 420);
		Pair<String, Integer> p3=new Pair<>("Duong", 440);
		Pair<String, Integer> p4=new Pair<>("An ", 410);
		Pair<String, Integer> p5=new Pair<>("Bao", 380);
		System.out.println("BANG XEP HANG TOP 5");
		p1.hienThi_1();
		p2.hienThi_1();
		p3.hienThi_1();
		p4.hienThi_1();
		p5.hienThi_1();
		ArrayList<Pair<String, Integer>> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		System.out.println(timNguoiChoiCaoNhat(list));
		
		for(int i = 0;i<10;i++) {
			System.out.println("");
		}
		Pair<Integer, String> p6=new Pair<>(1, "VTV1");
		Pair<Integer, String> p7=new Pair<>(11, "VTC11");
		Pair<Integer, String> p8=new Pair<>(3, "VTC3");
		p6.hienThi_2();
		p7.hienThi_2();
		p8.hienThi_2();
		
	}
}