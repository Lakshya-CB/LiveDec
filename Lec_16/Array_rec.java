package Lec_16;

import java.util.Arrays;

public class Array_rec {
	public static void main(String[] args) {
		int[] arr = { 99, 21, -90, 21, 100, 21, 149, 2 };
//		print(arr,0);
//		printRev(arr, 0);
//		System.out.println();
//		System.out.println(max(arr, 0));
//		System.out.println(FirstOcc(arr, 21, 0));
		System.out.println(Arrays.toString(AllOcc(arr, 21, 0, 0)));

	}

	public static void print(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
		System.out.print(arr[idx] + " ");
		print(arr, idx + 1);
	}

	public static void printRev(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
		printRev(arr, idx + 1);
		System.out.print(arr[idx] + " ");
	}

	public static int max(int[] arr, int idx) {
		if (idx == arr.length) {
			return Integer.MIN_VALUE;
		}
		int sp = max(arr, idx + 1);
		return Math.max(arr[idx], sp);
	}

	public static int FirstOcc(int[] arr, int ali, int idx) {
		if (idx == arr.length) {
			return -1;
		}
		int sp = FirstOcc(arr, ali, idx + 1);
		if (arr[idx] == ali) {
			return idx;
		}
		return sp;
	}

	public static int LastOcc(int[] arr, int ali, int idx) {
		if (idx == arr.length) {
			return -1;
		}
		int sp = LastOcc(arr, ali, idx + 1);
		if (arr[idx] == ali && sp == -1) {
			return idx;
		}
		return sp;
	}

	public static int[] AllOcc(int[] arr, int ali, int idx, int count) {
		if (idx == arr.length) {
			return new int[count];
		}

		if (arr[idx] == ali) {
			int ans[] = AllOcc(arr, ali, idx + 1, count + 1);
			ans[count] = idx;
			return ans;

		} else {
			int ans[] = AllOcc(arr, ali, idx + 1, count);
			return ans;
		}
	}
}
