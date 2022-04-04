package Lec_41;

import java.util.Scanner;

public class Biotonic {
	public static void main(String[] args) {
//		int[] arr = { 1, 11 ,2 ,10 ,4 ,5, 2 ,1 };
		Scanner scn = new Scanner(System.in);
		int TT = scn.nextInt();

		for (int t = 0; t < TT; t++) {
			int S = scn.nextInt();
			int[] arr = new int[S];
			for (int i = 0; i < S; i++) {
				arr[i] = scn.nextInt();
			}
			System.out.println(solveTD(-1, 0, true, arr, new int[arr.length + 1][arr.length + 1],
					new int[arr.length + 1][arr.length + 1]));

		}

//		System.out.println(solve(-1, 0, true, arr));

	}

	public static int solve(int prev_idx, int curr, boolean inc, int[] arr) {
		if (curr == arr.length) {
			return 0;
		}

		int sp1 = solve(prev_idx, curr + 1, inc, arr); // not selected!!

//		case when increasing, it can inc and dec!!!!
		int sp2 = 0;
		if (prev_idx == -1 || (arr[prev_idx] < arr[curr] && inc)) {
			sp2 = 1 + solve(curr, curr + 1, true, arr);
		}

//		case when decreasing only decrease!!
		int sp3 = 0;
		if (prev_idx == -1 || arr[prev_idx] > arr[curr]) {
			sp3 = 1 + solve(curr, curr + 1, false, arr);
		}

		return Math.max(sp1, Math.max(sp2, sp3));
	}

	public static int solveTD(int prev_idx, int curr, boolean inc, int[] arr, int[][] dp_T, int[][] dp_F) {
		if (curr == arr.length) {
			return 0;
		}
		if (inc && dp_T[curr][prev_idx + 1] != 0) {
			return dp_T[curr][prev_idx + 1];
		} else if (!inc && dp_F[curr][prev_idx + 1] != 0) {
			return dp_F[curr][prev_idx + 1];
		}

		int sp1 = solveTD(prev_idx, curr + 1, inc, arr, dp_T, dp_F); // not selected!!

//		case when increasing, it can inc and dec!!!!
		int sp2 = 0;
		if (prev_idx == -1 || (arr[prev_idx] < arr[curr] && inc)) {
			sp2 = 1 + solveTD(curr, curr + 1, true, arr, dp_T, dp_F);
		}

//		case when decreasing only decrease!!
		int sp3 = 0;
		if (prev_idx == -1 || arr[prev_idx] > arr[curr]) {
			sp3 = 1 + solveTD(curr, curr + 1, false, arr, dp_T, dp_F);
		}

		if (inc) {
			dp_T[curr][prev_idx + 1] = Math.max(sp1, Math.max(sp2, sp3));
		} else {
			dp_F[curr][prev_idx + 1] = Math.max(sp1, Math.max(sp2, sp3));
		}
		return Math.max(sp1, Math.max(sp2, sp3));
	}
}
