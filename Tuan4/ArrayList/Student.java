package ArrayList;

public class Student implements Comparable<Student> {
	String hoTen;
	double diemTB;

	public Student(String hoTen, double diemTB) {
		super();
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	@Override
	public int compareTo(Student o) {
		if (this.diemTB > o.diemTB) {
			return 1;
		} else if (this.diemTB < o.diemTB) {
			return -1;
		} else
			return 0;
	}

	@Override
	public String toString() {
		return "Ho va ten: " + hoTen + ", Diem TB: " + diemTB;
	}

}
