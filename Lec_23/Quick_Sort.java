package Lec_23;

import java.util.Arrays;

public class Quick_Sort {
	public static void main(String[] args) {
//		int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };
//		int[] arr = { 10, 20, 30, 70, 25, 100, 90, 5 };
//		int[] arr = { 50, 40, 30, 20, 10, 1 };
		int[] arr = { 50, 80, 30, 60, 70 };
		System.out.println(Arrays.toString(arr));
		System.out.println("*****************");
		quick(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quick(int[] arr, int s, int e) {
		if (s >= e) {
			return;
		}
		int pivot = arr[(s + e) / 2]; // mid par hein hein

		int left = s;
		int right = e;
		while (left < right) {
			while (arr[left] < pivot) {
				left++;
			}

			while (arr[right] > pivot) {
				right--;
			}
//			System.out.println(left + "  , " + right + " __ " + pivot);

//		chyap!
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
//				left++;
//				right--;
//				System.out.println(Arrays.toString(arr));
//				System.out.println("=============");
			}
		}
		quick(arr, s, right - 1);
		if (left != s)
			quick(arr, left, e);
		else
			quick(arr, left+1, e);

	}
}
