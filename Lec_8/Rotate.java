package Lec_8;

public class Rotate {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
//		rotate(arr, 3);
		rotate_badiya(arr, 2);
	}

	
	public static void rotate(int[] arr, int r) {

		r= r%arr.length; // this will work for borh left shift anf right shift!!
		if(r<0) {
			r=r+arr.length;
		}
		for (int rot = 0; rot < r; rot++) {
			int var = arr[arr.length - 1];
//		Logic of 1 rotation?!
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
//			disp(arr);
			}
			arr[0] = var;
			
		}
		disp(arr);
	}
	public static void rev(int[] arr,int s, int e) {
		int start = s;
		int end = e;
		while(start<end) {
//			swap index on start and end!!
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
	}	
	public static void rotate_badiya(int [] arr, int r) {
		r= r%arr.length; // this will work for borh left shift anf right shift!!
		if(r<0) {
			r=r+arr.length;
		}
//		Step 1 
//		Part A
		rev(arr, 0, arr.length-1-r);
//		Part B
		rev(arr, arr.length-r, arr.length-1);
		
//		Step 2
		rev(arr, 0, arr.length-1);
		disp(arr);
		
	}
	
	public static void disp(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
