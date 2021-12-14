package Lec_4;

public class pAT_9 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nsp = n - 1;
		int nst = 1;
		while (row <= n) {
//		Rule
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {
				if (cst % 2 == 0) {
					System.out.print("! ");
				} else {
					System.out.print("* ");
				}
				cst++;
			}

			System.out.println();
			row++;
			nst = nst + 2;
			nsp = nsp - 1;
		}
	}
}
