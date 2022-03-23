package Lec_38;

public class Fibo {
	public static void main(String[] args) {
		int n = 10000000;
//		System.out.println(FibTD(n, new int[n+1]));
		System.out.println(FibBU(n));
	}

	public static int Fib(int n) {
//		Unique Sub problems !! : 0 to n = O(n) , but complexity is 2^n 

		if (n <= 1) {
			return n;
		}

		int sp1 = Fib(n - 1);
		int sp2 = Fib(n - 2);

		return sp1 + sp2;
	}

	public static int FibTD(int n, int[] dp) {
		// Unique Sub problems !! : 0 to n = O(n) , but complexity is 2^n

		if (n <= 1) {
			return n;
		}
		if (dp[n] != 0) {
			return dp[n];
		}

		int sp1 = FibTD(n - 1, dp);
		int sp2 = FibTD(n - 2, dp);

		dp[n] = sp1 + sp2; // Memorization~~

		return sp1 + sp2;
	}
	public static int FibBU(int num) {
		int[] dp = new int[num+1];
		dp[1]= 1;
		for(int n=2;n<=num;n++) {
//			dp[n]
			int sp1 = dp[n - 1];
			int sp2 = dp[n - 2];

			dp[n] = sp1 + sp2; // Memorization~~

		}
		return dp[num];
	}
}
