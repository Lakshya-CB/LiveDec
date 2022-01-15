package Lrc_14;

import java.util.ArrayList;
import java.util.Collections;

public class Intersec_AL {
	public static void main(String[] args) {
//		int[] arr1 = { 5, 7, 10, 10, 10, 20, 30, 30, 50, 60, 60, 80 };
//		int[] arr2 = { 10, 10, 15, 20, 30, 30, 30, 60, 70, 80, 80, 90 };
//		System.out.println(Inter(arr1, arr2));
		int[] arr1 = { 9, 8, 7, 5 };
		int[] arr2 = { 9, 6, 7 };
		System.out.println(Add(arr1, arr2));

	}

	public static ArrayList<Integer> Inter(int[] arr1, int[] arr2) {
		int idx1 = 0;
		int idx2 = 0;
		ArrayList<Integer> AL = new ArrayList<>();

		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] == arr2[idx2]) {
				AL.add(arr1[idx1]);
				idx1++;
				idx2++;
			} else if (arr1[idx1] > arr2[idx2]) {
				idx2++;
			} else {
				idx1++;
			}
		}
		return AL;

	}

	public static ArrayList<Integer> Add(int[] arr1, int[] arr2) {
		int idx1 = arr1.length - 1;
		int idx2 = arr2.length - 1;
		int carr = 0;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		while (idx1 >= 0 || idx2 >= 0||carr>0) {
//			int sum = arr1[idx1]+arr2[idx2]+carr;

			int sum = carr;
			if (idx1 >= 0) {
				sum = sum + arr1[idx1];
			}
			if (idx2 >= 0) {
				sum = sum + arr2[idx2];
			}
			int digit = sum % 10;
			carr = sum / 10;
			ans.add( digit);
			idx1--;
			idx2--;
			

		}
//		System.out.println(ans);
		Collections.reverse(ans);
		return ans;
	}
}
