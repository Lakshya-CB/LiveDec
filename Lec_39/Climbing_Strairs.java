package Lec_39;

public class Climbing_Strairs {
//https://leetcode.com/problems/climbing-stairs/
	public static void main(String[] args) {

	}

	public int climbStairs(int n) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		int sp1 = climbStairs(n - 1);
		int sp2 = climbStairs(n - 2);
		return sp1 + sp2;
	}

	public int climbStairsTD(int n, int[] dp) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		if (dp[n] != 0) {
			return dp[n];
		}
		int sp1 = climbStairsTD(n - 1, dp);
		int sp2 = climbStairsTD(n - 2, dp);
		dp[n] = sp1 + sp2;
		return sp1 + sp2;
	}

	public int climbStairsBU(int num) {
		int[] dp = new int[num + 1];
		dp[0] = 1;
		for (int n = 1; n <= num; n++) {
//			dp[n]
			int sp1 = dp[n - 1];

			int sp2 = 0;
			if (n - 2 >= 0) {
				sp2 = dp[n - 2];
			}
			dp[n] = sp1 + sp2;
		}
		return dp[num];
	}

	public int climbStairsBUSE(int num) {
		int sp1 = 1;
		int sp2 = 0;

		for (int n = 1; n <= num; n++) {
//		dp[n]
			int curr = sp1 + sp2; // Memorization~~
			sp2 = sp1;
			sp1 = curr;
		}
		return sp1;
	}
}
