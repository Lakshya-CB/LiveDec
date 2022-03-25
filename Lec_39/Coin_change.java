package Lec_39;

import java.util.Scanner;

public class Coin_change {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int len = scn.nextInt();
		int[] coins = new int[len];

		for (int i = 0; i < len; i++) {
			coins[i] = scn.nextInt();
		}
		System.out.println(CoinTDBUSE(A, coins));

	}

	public static int Coin(int A, int idx, int[] coins) {
//		2^(A+coins.len)'
//		Range of A = 0 to A;
//		Range of idx = 0 to coins.length

		if (A == 0) {
			return 1;
		}
		if (A < 0 || idx == coins.length) {
			return 0;
		}
		int sp1 = Coin(A - coins[idx], idx, coins);
		int sp2 = Coin(A, idx + 1, coins);
		return sp1 + sp2;
	}

	public static int CoinTD(int A, int idx, int[] coins, Integer[][] dp) {
//		2^(A+coins.len)'
//		Range of A = 0 to A;
//		Range of idx = 0 to coins.length

		if (A == 0) {
			return 1;
		}
		if (A < 0 || idx == coins.length) {
			return 0;
		}
//		if(dp[A][idx]!=0) { // When  0 is a valid solution this fails!!
////			fix this, fill the array with a value that is not possible!!
////			use Integer [][] dp!!
//			return dp[A][idx];
//		}
		if (dp[A][idx] != null) {
			return dp[A][idx];
		}
		int sp1 = CoinTD(A - coins[idx], idx, coins, dp);
		int sp2 = CoinTD(A, idx + 1, coins, dp);
		dp[A][idx] = sp1 + sp2;

		return sp1 + sp2;
	}

	public static int CoinTDBU(int Amount, int[] coins) {
		int[][] dp = new int[Amount + 1][coins.length + 1];
		// coins.length+1 to handle the cases of
		// if ( idx == coins.length) {return 0;}
		for (int A = 0; A <= Amount; A++) {
			for (int idx = coins.length - 1; idx >= 0; idx--) {

				if (A == 0) {
					dp[A][idx] = 1;
					continue;
				}

//				dp[A][idx]!!
				int sp1 = 0;
				if (A - coins[idx] >= 0) {
					sp1 = dp[A - coins[idx]][idx];
				}
				int sp2 = dp[A][idx + 1];
				dp[A][idx] = sp1 + sp2;

			}
		}
		return dp[Amount][0];

	}

	public static int CoinTDBUSE(int Amount, int[] coins) {
//		int[][] dp = new int[Amount+1][coins.length + 1];
		int[] right_idx = new int[Amount+1];
		
		for (int idx = coins.length - 1; idx >= 0; idx--) {
			int[] curr_idx = new int[Amount+1];
			
			for (int A = 0; A <= Amount; A++) {
				if (A == 0) {
					curr_idx[A] = 1;
					continue;
				}
				int sp1 = 0;
				if (A - coins[idx] >= 0) {
					sp1 = curr_idx[A - coins[idx]];
				}
				int sp2 = right_idx[A];
				curr_idx[A] = sp1 + sp2;
			}
			right_idx = curr_idx;
		}
		return right_idx[Amount];

	}

}
