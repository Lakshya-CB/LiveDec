package Lec_38;

import java.util.Arrays;

public class Min_Steps_1 {
	public static void main(String[] args) {
		int n =13;
		System.out.println(Steps(n));
		System.out.println(StepsTD(n, new int[n+2]));
		System.out.println(StepsBU(n));
		
	}

	public static int Steps(int n) {

		if (n == 1) {
			return 0;
		}
		if (n % 2 == 0) {
			return Steps(n / 2) + 1;
		} else {
			int sp1 = Steps(n + 1);
			int sp2 = Steps(n - 1);

			return Math.min(sp1, sp2) + 1;

		}

	}

	public static int StepsTD(int n, int[] dp) {

		if (n == 1) {
			return 0;
		}
		if (dp[n] != 0) {
			return dp[n];
		}
		if (n % 2 == 0) {

			dp[n] = StepsTD(n / 2, dp) + 1;
			return dp[n];
		} else {
			int sp1 = StepsTD(n + 1, dp);
			int sp2 = StepsTD(n - 1, dp);

			dp[n] = Math.min(sp1, sp2) + 1;
			return Math.min(sp1, sp2) + 1;

		}

	}

	public static int StepsBU(int num) {
		int dp [] = new int[num+2];
		
		for (int n = 2; n <= num; n++) {
//			dp[n]!!
			if (n % 2 == 0) {
				dp[n] = dp[n / 2] + 1;
			} else {
				int sp1 = dp[(n + 1)/2]+1;
				int sp2 = dp[n - 1];
				dp[n] = Math.min(sp1, sp2) + 1;
			}
		}
		System.out.println(Arrays.toString(dp));
		return dp[num];
	}
}
