package Lec_23;

import java.util.Arrays;

public class QuickSort2 {
	public static void main(String[] args) {
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
		while (true) {
			while (arr[left] < pivot) {
				left++;
			}

			while (arr[right] > pivot) {
				right--;
			}
//		System.out.println(left + "  , " + right + " __ " + pivot);

			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			} else {
				break;
			}
		}
		quick(arr, s, right);

		quick(arr, left, e);

	}
}
