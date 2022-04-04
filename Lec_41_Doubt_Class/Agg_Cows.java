package Lec_41;

import java.util.Arrays;
import java.util.Scanner;

public class Agg_Cows {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int S = scn.nextInt();
		int C = scn.nextInt();
		
		int[] barns = new int[S];
		for (int i = 0; i < S; i++) {
			barns[i] = scn.nextInt();
		}
		Arrays.sort(barns);
//		for (int d = 1; d <= barns[S - 1] - barns[0]; d++) {
//			System.out.println(check(d, C, barns) + " , " + d);
//
//		}
		int s = 1;
		int e = barns[S - 1] - barns[0];
		int ans = 1;
		while(s<=e) {
			int d=(s+e)/2;
			if(check(d, C, barns)) {
				s=d+1;
				ans=d;
			}else {
				e = d-1;
			}
		}
		System.out.println(ans);
		
	}

	public static boolean check(int d, int C, int[] barns) {
		int curr_cow = 1;
		int prev_idx = 0;
		for (int i = 1; i < barns.length; i++) {
			if (barns[i] - barns[prev_idx] >= d) {
				curr_cow++;
				prev_idx = i;
			}
		}
		return curr_cow >= C;
	}
}
