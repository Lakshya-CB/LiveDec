package Lec_5;

public class Pat_23 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nsp = n - 1;
		int nst = 1;
		int c_num = 1;
		while (row <= n) {
//	Rule
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}
			c_num = 1;
			int cst = 1;
			while (cst <= nst) {
				System.out.print(c_num + "\t");// Tabular spaces!
				c_num++;
				cst++;
			}
			
			System.out.println("\n"); // going to the next line!!
			row++;
			////////////////////////
			
			nst = nst + 2;
			nsp = nsp - 1;

		}

	}
}
