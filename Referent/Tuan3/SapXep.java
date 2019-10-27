package Tuan3;



public class SapXep {
	public void chenTrucTiep(int[] ar) {
		int value = 0;
		int indexPost = 0;
		for (int i = 1; i < ar.length; i++) {
			value = ar[i];
			indexPost = i;
			while (indexPost > 0 && ar[indexPost - 1] > value) {
				ar[indexPost] = ar[indexPost - 1];
				indexPost = indexPost - 1;
			}
			ar[indexPost] = value;
		}
		for (int k = 0; k < ar.length; k++)
			System.out.print(ar[k] + "\t");

	}

	public void chonTrucTiep(int[] ar) {
		int temp = 0;
		int min = 0;
		for (int i = 0; i < ar.length - 1; i++) {
			min = i;
			//
			for (int j = i; j < ar.length; j++)
				if (ar[j] < ar[min])
					min = j;
			if (ar[i] > ar[min]) {
				temp = ar[i];
				ar[i] = ar[min];
				ar[min] = temp;
			}

		}
		for (int k = 0; k < ar.length; k++)
			System.out.print(ar[k] + "\t");

	}

	public void doiChoTrucTiep(int[] ar) {
		int temp = 0;
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}

		}
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + "\t");

	}

	public void noiBot(int[] ar) {
		int temp = 0;
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = ar.length - 1; j > i; j--) {
				if (ar[j] < ar[j - 1]) {
					temp = ar[j - 1];
					ar[j - 1] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (int k = 0; k < ar.length; k++)
			System.out.print(ar[k] + "\t");

	}



	public static void main(String[] args) {
		SapXep sapXep = new SapXep();
		System.out.println("Chen truc tiep: ");
		int[] ar = { 13, 3, 0, 29, 7 };
		sapXep.chenTrucTiep(ar);
		System.out.println("\n");
		System.out.println("Chon truc tiep:  ");
		int[] ar1 = { 3, 3, 14, 21, 7, 7 };
		sapXep.chonTrucTiep(ar1);
		System.out.println("\n");
		int[] ar2 = { 3, 11, 2, 1, 7, 9 };
		System.out.println("Doi cho truc tiep: ");
		sapXep.doiChoTrucTiep(ar2);
		System.out.println("\n");
		System.out.println("Noi bot: ");
		int[] ar3 = { 1, 1, 23, 19, 3 };
		sapXep.noiBot(ar3);
		
		
		
	}
}
