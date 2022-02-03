package Lec_22;

import java.util.Arrays;

public class Merge_sort {
	public static void main(String[] args) {
//		int[] arr1 = { 10, 30, 50, 80, 100, 500 };
//		int[] arr2 = { 5, 15, 35, 55, 120 };
//		System.out.println(Arrays.toString(merge(arr1, arr2)));
		int[] arr = { 50,40,30,20,10 };
		System.out.println(Arrays.toString(sort(arr, 0, arr.length - 1)));
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		int idx1 = 0;
		int idx2 = 0;

		int i = 0;
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] < arr2[idx2]) {
				ans[i] = arr1[idx1];
				idx1++;
				i++;
			} else {
				ans[i] = arr2[idx2];
				idx2++;
				i++;
			}

		}
		while (idx1 < arr1.length) {
			ans[i] = arr1[idx1];
			idx1++;
			i++;
		}
		while (idx2 < arr2.length) {
			ans[i] = arr2[idx2];
			idx2++;
			i++;
		}
		return ans;

	}

	public static int[] sort(int[] arr, int s, int e) {
		if(s==e) {
			int[] ans= new int[1];
			ans[0] = arr[s];
			return ans;
		}
		int mid = (s + e) / 2;
		int[] left = sort(arr, s, mid);
		int[] right = sort(arr, mid + 1, e);

		return merge(left, right);
	}
}
