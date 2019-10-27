package tuan2;

public class DeQuy {
	public int demN(int n) {
		if(n/10==0) {
			return 1;
		}
		return 1+demN(n/10);
	}
	public int tongN(int n) {
		if(n%10==0) {
			return 0;
		}
		int a = n%10;
		return a+tongN(n/10);
	}
	
	public int tongSoLeN(int n) {
		if(n %10 == 0) {
			return 0;
		}
		int a = 0;
		int temp = n%10;
		if(temp%2 != 0) {
			a = n%10;
		}
		return a+tongSoLeN(n/10);
	}
	public int S(int n) {
		if(n %10 == 0) {
			return 1;
		}
		int a = n%10;
		return a*S(n/10);
	}
	public double sum(int n) {
		if (n == 1)
			return 1;
		else {
			return (double) 1 / n + sum(n - 1);
		}

	}
	public boolean kTDoiXung(int[] array, int n) {
		if(array[array.length - n]!= array[n - 1]) return false;
		 if ((array.length - n == n -1)|| (array.length - 1 > n -1 )) return true;
			return kTDoiXung(array, n - 1);
		
}

	public static void main(String[] args) {
		int n = 31245987;
		int array[] = {1,3,2,1};
		int array_m[] = {1,2,3,2,1};
		DeQuy dq = new DeQuy();
		System.out.println("n = "+n);
		System.out.println("So chu so n: "+dq.demN(n));
		System.out.println("Tong cac chu so n: "+dq.tongN(n));
		System.out.println("Tong cac chu so le n: "+dq.tongSoLeN(n));
		System.out.println("Tich S = 1*2*..*n: "+dq.S(n));
		System.out.println("Tich S = f(n) : "+dq.sum(dq.demN(n)));
		System.out.println("Kiem tra doi xung : "+dq.kTDoiXung(array, array.length));
		System.out.println("Kiem tra doi xung : "+dq.kTDoiXung(array_m, array_m.length));
	}

}
