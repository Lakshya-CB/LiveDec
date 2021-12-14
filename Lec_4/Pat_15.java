package Lec_4;

public class Pat_15 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = n;
		int nsp = 0;
		while (row <= 2 * n - 1) {
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

//			Prep for the next row~~~~
			System.out.println();
			row++;
			if (row > n) {
				nst++;
				nsp = nsp - 2;
			} else {
				nsp = nsp + 2;
				nst--;
			}
		}
	}
}
