package tuan1;

import java.util.Arrays;
import java.util.Scanner;

// bai 1
public class MyArray {
	private int array[];
	
	
	
	
	public MyArray() {
		
	}
	public void setUp() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap do dai mang: ");
		int n = sc.nextInt();
		array = new int[n];
		System.out.println("Gan gia tri cho mang: ");
		for(int i = 0;i<n;i++) {
			System.out.print("array[ "+i+" ]= ");
			int e = sc.nextInt();
			array[i]= e;
		}
		System.out.println(Arrays.toString(array));
	}
	
	public int tinhTong() {
		int tong = 0;
		for(int i = 0;i<array.length;i++) {
			tong += array[i];
		}
		return tong;
	}
	public void timGiaTri_va_ViTri_cuaMin() {
		int min = array[0];
		int index = 0;
		for(int i = 0;i<array.length;i++) {
			if(array[i]<=min) {
				min = array[i];
				index = i;
			}
		}
		System.out.println("Gia tri nho nhat la: "+min+" nam o vi tri array[ "+index+" ]");
	}
	public void timGiaTri_va_ViTri_cuaMax() {
		int max = array[0];
		int index = 0;
		for(int i = 0;i<array.length;i++) {
			if(array[i]>=max) {
				max = array[i];
				index = i;
			}
		}
		System.out.println("Gia tri lon nhat la: "+max+" nam o vi tri array[ "+index+" ]");
	}
	public void timPhanTuAmDauTien() {
		boolean c = false;
		int i = 0;
		int value = 0;
		int index = 0;
		while(true) {
			if(c==true || i==array.length) {
				break;
			}
			if(array[i]<0) {
				value = array[i];
				index = i;
				c = true;
			}
			i++;
		}
		if(c==true) {
			System.out.println("Gia tri am dau tien la: "+value+" nam o vi tri array[ "+index+" ]");
		}else {
			System.out.println("Khong tim thay phan tu am nao.");
		}
	}

	public static void main(String[] args) {
		
		MyArray myArray = new MyArray();
		myArray.setUp();
		System.out.println("Tong mang la: "+myArray.tinhTong());
		myArray.timGiaTri_va_ViTri_cuaMin();
		myArray.timGiaTri_va_ViTri_cuaMax();
		myArray.timPhanTuAmDauTien();
	}

}
