package Lec_7;

public class Basic_Array {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 10, 2, 2, 99, 1 };
//		int max = Max(arr1);
//		System.out.println(max);
//		System.out.println(find(arr1, 990));
		disp(arr1);
		rev(arr1);
		disp(arr1);
		
		
	}

	public static int Max(int[] arr) {
		int max = arr[0];
//		max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int find(int[] arr, int ali) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ali) {
				return i;
			}
		}
		return -1;
		
	}

	public static void rev(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
//			swap index on start and end!!
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
	}
	public static void disp(int[]arr) {
		for(int i : arr) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
}
