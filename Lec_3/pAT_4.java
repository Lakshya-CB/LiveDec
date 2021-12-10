package Lec_3;

public class pAT_4 {
	public static void main(String[] args) {
		int n = 9;

		int nst = 1;
		int nsp = n - 1;

		int row = 1;
		while (row <= n) {
//			Rule2 
//			Print " " nsp times
			int csp = 1; // csp is current space!!
			while (csp <= nsp) { // num of space in each row!
				System.out.print("  ");
				csp++;
			}
//			 Print "*" nst times!!
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			row++;
			System.out.println();
			nsp--;
			nst++;
		}
	}
}
