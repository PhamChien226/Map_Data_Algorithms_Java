package tuan1;

import java.util.ArrayList;

public class Student {
	private String tenSV, maSV;
	private double[] diem3mon = new double [3];
	
	public Student(String tenSV, String maSV, double[]diem3mon) {
		this.tenSV = tenSV;
		this.maSV = maSV;
		this.diem3mon = diem3mon;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public double diemTB() {
		double trungBinh = 0;
		double tong = 0;
		for(int i = 0;i<diem3mon.length;i++) {
			tong += diem3mon[i];
		}
		trungBinh = tong /3;
		return trungBinh;
	}
	public static String diemTBCaoNhat(ArrayList<Student> listSV) {
		String ketQua ="";
		double max = listSV.get(0).diemTB();
	
		for(int i = 0;i<listSV.size();i++) {
			if(listSV.get(i).diemTB()>=max) {
				max = listSV.get(i).diemTB();
				ketQua = "Sinh vien: '"+listSV.get(i).getTenSV()+"' co diem TB cao nhat: "+max;
			}
		}
		return ketQua;
	}
	public void hienThi() {
		System.out.println("  - Ten sinh vien: "+tenSV);
		System.out.println("  - Ma sinh vien: "+maSV);
		System.out.println("  - Diem mon 1: "+diem3mon[0]);
		System.out.println("  - Diem mon 2: "+diem3mon[1]);
		System.out.println("  - Diem mon 3: "+diem3mon[2]);
		System.out.println("  - Diem TB = "+diemTB());
	}

	public static void main(String[] args) {
		//sv1
		System.out.println("Thong tin sinh vien 1");
		double[]diem3mon_sv1 = {6,5.5,7,};
		Student sv1 = new Student("Huynh Van A", "13170005", diem3mon_sv1);
		sv1.hienThi();
		System.out.println("__");
		//sv2
		System.out.println("Thong tin sinh vien 2");
		double[]diem3mon_sv2 = {7.4,5,6,};
		Student sv2 = new Student("Nguyen Thanh B", "13170013", diem3mon_sv2);
		sv2.hienThi();
		System.out.println("__");
		//sv3
		System.out.println("Thong tin sinh vien 3");
		double[]diem3mon_sv3 = {4,6,5.2,};
		Student sv3 = new Student("Tran Minh C", "13170221", diem3mon_sv3);
		sv3.hienThi();
		System.out.println("__");
		//sv4
		System.out.println("Thong tin sinh vien 4");
		double[]diem3mon_sv4 = {6,7,5.2,};
		Student sv4 = new Student("Le Van D", "13170022", diem3mon_sv4);
		sv4.hienThi();
		System.out.println("__");
		//sv5
		System.out.println("Thong tin sinh vien 5");
		double[]diem3mon_sv5 = {6,4,5,5.6,};
		Student sv5 = new Student("Trinh Cao E", "13170105", diem3mon_sv5);
		sv5.hienThi();
			
		ArrayList<Student> listSV = new ArrayList<>();
		listSV.add(sv1);
		listSV.add(sv2);
		listSV.add(sv3);
		listSV.add(sv4);
		listSV.add(sv5);
		System.out.println(diemTBCaoNhat(listSV));
	}

}
