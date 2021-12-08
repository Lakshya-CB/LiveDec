package Lec_2;

import java.util.Scanner;

public class Natural_sum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int n = 1;
		int ans = 0;
		while (n <= num) {
			ans = ans + n;
//			System.out.println(n);
			n = n + 1;
		}
		System.out.println(ans);
	}
}
