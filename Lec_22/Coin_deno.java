package Lec_22;

import java.util.Arrays;

public class Coin_deno {
	public static void main(String[] args) {
		int[] coins = { 1, 2, 3, 1 };
		Arrays.sort(coins);
		System.out.println(Arrays.toString(coins));
		coin_t3(coins, 4, 0, "", false);
	}

//	Infinite supply and combination and unique !!
	public static void coin_t1(int[] coins, int amount, int idx, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		if (amount < 0 || idx == coins.length) {

			return;
		}
//		Amount mein add ho!!
		coin_t1(coins, amount - coins[idx], idx, ans + coins[idx] + " ");
		coin_t1(coins, amount, idx + 1, ans);
	}

//	finite supply and combination and unique!!
	public static void coin_t2(int[] coins, int amount, int idx, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		if (amount < 0 || idx == coins.length) {

			return;
		}
//		Amount mein add ho!!
		coin_t2(coins, amount - coins[idx], idx + 1, ans + coins[idx] + " ");
//		Amount mein add nahi karna!!
		coin_t2(coins, amount, idx + 1, ans);
	}

//	finite supply and combination and DUPLICATES !!
	public static void coin_t3(int[] coins, int amount, int idx, String ans, boolean call) {
//		System.out.println(ans + ":"+amount);
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		if (amount < 0 || idx == coins.length) {
			return;
		}
//		Amount mein add ho!!
		if (idx > 0 && coins[idx] == coins[idx - 1] && call) {
			coin_t3(coins, amount - coins[idx], idx + 1, ans + coins[idx] + " ", true);
		} else if (idx==0||coins[idx] != coins[idx - 1]) {
			coin_t3(coins, amount - coins[idx], idx + 1, ans + coins[idx] + " ", true);
		}
//		Amount mein add nahi karna!!
		coin_t3(coins, amount, idx + 1, ans, false);
	}
}
