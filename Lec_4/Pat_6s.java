package Lec_4;

import java.util.Scanner;

public class Pat_6s {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int n = 5;//sc.nextInt();
		int row = 1;
		int nst = n;
		int nsp = 0;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println(" ");
			row++;
			nsp = nsp + 2;
			nst--;
		}

	}
}
