package Lec_3;

public class Pat_1 {
	public static void main(String[] args) {
		int n = 5;
		int nst = n;
//		Rule 1
		int row = 1;
		while (row <= n) {
//			Rule 2, work in each row!!
			int cst = 1; // cst is current star!!
			while (cst <= nst) { // nst is number of start in each row!!
				System.out.print("*");
				cst++;
			}

//			This is the prep for the next row!!
			row++;
			System.out.println();
		}
	}
}
