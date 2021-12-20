package Lec_5;

public class Pat_18 {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int nsp = n / 2;
		int nst = 1;
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

			row++;
			System.out.println();

			if (row >= n / 2+2) {
				nsp++;
				nst = nst - 2;
				
			} else {
				nsp--;
				nst = nst + 2;
				
			}
			
		}
	}
}
