package Lec_5;

public class Pat_19 {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int nst = n / 2 + 1;
		int nsp = -1;// jadu
		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}

			cst = 1;
			if(row==1||row==n)
				cst=2;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			System.out.println();
			row++;
			if (row > n / 2 + 1) {
				nsp = nsp - 2;
				nst++;
			} else {
				nsp = nsp + 2;
				nst = nst - 1;
			}
		}
	}
}
