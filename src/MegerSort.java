
public class MegerSort {
	public static void merge_Sort(int[] arr, int left, int right) {	//left = 0, right = arr.length-1
		if(left < right) {
				int mid = (left + right)/2;	   // phần tử chính giữa mảng
				merge_Sort(arr, left, mid);    // đệ qui chia nhỏ mảng bên trái
				merge_Sort(arr, mid+1, right); // đệ qui chia nhỏ mảng bên phải
				merge(arr, left, mid, right);  // khởi tạo method merge để gộp các mảng con đã chia
			}
	}
	public static void merge(int[] arr, int left, int mid, int right) {
		
//		int[] temp = new int[left - right +1]; // khởi tạo mảng phụ temp
		// chỗ này là right - left nha
		int[] temp = new int[right - left +1]; // khởi tạo mảng phụ temp
		int i = left;	// i = phần tử đầu tiên của mảng bên trái  
		int j = mid +1;	// j = phần tử đầu tiên của mảng bên phải
		
		for(int k =0; k < right -left; k++) {	// duyệt các phần tử của mảng phụ temp
			if( arr[i] < arr[j] ) {
				temp[k] = arr[j];
				j++;
			}else{ // arr[i] >= arr[j]
				temp[k] = arr[i];
				i++;
			}
			// thêm các phần tử còn lại-(còn sót) của mảng bên phải vào mảng phụ temp
			if(j == right+1 ) {  // right+1 : vì TRƯỚC ĐÓ  i++
				while( i <= mid ) {
					k++;
					temp[k] = arr[i];
					i++;
				}
				break;
			}
			if(i == mid+1 ) {
				while( j <= right ) {
					k++;
					temp[k] = arr[j];
					j++;
				}
				break;
			}
		}
		// Chuyển các phần tử từ mảng phụ temp sang mảng chính arr ban đầu và in mảng chính ra
		
//		for( int k =0; k < right - left; k++) {
		//chỗ này là k <= right - left nha
		for( int k =0; k <= right - left; k++) {
			arr[left +k] = temp[k];
//			delete temp;
//			System.out.println( temp[k] );
		}
	}
	
	public static void disPlay(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] array = {27, 38, 43, 52, 9, 82, 10,62};
		
		System.out.println("Array is unSorted: ");
		disPlay(array);
		
		merge_Sort(array, 0, 7);
		
		System.out.println("Array is Sorted: ");
		disPlay(array);
	}
}
