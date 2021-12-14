package Lec_4;

public class Pat_7 {
	public static void main(String[] args) {
		int n = 15;
		int nst = n;
//	Rule 1
		int row = 1;
		while (row <= n) {
//		Rule 2, work in each row!!
			int cst = 1; // cst is current star!!
			while (cst <= nst) { // nst is number of start in each row!!
				if (cst == 1 ||cst == n|| row==1||row==n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				cst++;
			}

//		This is the prep for the next row!!
			row++;
			System.out.println();
		}
	}
}
