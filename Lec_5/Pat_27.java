package Lec_5;

public class Pat_27 {
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
				cst++;

				if (cst > nst / 2 + 1) {
					c_num--;

				} else {
					c_num++;
				}

			}

			System.out.println("\n"); // going to the next line!!
			row++;
			////////////////////////

			nst = nst + 2;
			nsp = nsp - 1;

		}

	}
}
