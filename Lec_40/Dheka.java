package Lec_40;

public class Dheka {
	public static void main(String[] args) {
		int[] daru = { 2, 3, 5, 1, 4, 3 };
		System.out.println(solve(0, daru.length - 1, daru));
		System.out.println(solve(0, daru.length - 1, daru, new Integer[daru.length][daru.length]));
		System.out.println(solve(daru));
	}

//	public static int solve(int s, int e, int day, int[] daru) {
//		if (s == e) {
//			return day * daru[s];
//		}
//		int sp1 = day * daru[s] + solve(s + 1, e, day + 1, daru);
//		int sp2 = day * daru[e] + solve(s, e - 1, day + 1, daru);
//		return Math.max(sp1, sp2);
//	}
	public static int solve(int s, int e, int[] daru) {
		int total_daru = daru.length;
		int bachi_daru = e - s + 1;
		int day = total_daru - bachi_daru + 1;

		if (s == e) {
			return day * daru[s];
		}
		int sp1 = day * daru[s] + solve(s + 1, e, daru);
		int sp2 = day * daru[e] + solve(s, e - 1, daru);
		return Math.max(sp1, sp2);
	}

	public static int solve(int s, int e, int[] daru, Integer[][] dp) {
		int total_daru = daru.length;
		int bachi_daru = e - s + 1;
		int day = total_daru - bachi_daru + 1;

		if (s == e) {
			return day * daru[s];
		}
		if(dp[s][e]!=null) {
			return dp[s][e]; 
		}
		int sp1 = day * daru[s] + solve(s + 1, e, daru);
		int sp2 = day * daru[e] + solve(s, e - 1, daru);
		dp[s][e] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}
	public static int solve(int[] daru) {
		int[][] dp = new int [daru.length][daru.length];
		for(int s = daru.length-1;s>=0;s--) {
			for(int e =0;e<daru.length;e++) {
				if(s>e) {
					continue;
				}
//				day!!
				
				int total_daru = daru.length;
				int bachi_daru = e - s + 1;
				int day = total_daru - bachi_daru + 1;
				
//				create solution of dp[s][e]

				if (s == e) {
					dp[s][e] = day * daru[s];
					continue;
				}
				
				int sp1 = day * daru[s] + dp[s + 1][e];
				int sp2 = day * daru[e] + dp[s][e - 1];
				dp[s][e] = Math.max(sp1, sp2);
				
			}
		}
		return dp[0][daru.length-1];
	}
}
