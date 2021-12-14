package Lec_4;

public class Pat_13 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = 1;
		while (row <= 2 * n - 1) {

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

//			Prep for the next row~~~~
			System.out.println();
			row++;
			if (row >= n) {
				nst--;
			} else {
				nst++;
			}
		}
	}
}
