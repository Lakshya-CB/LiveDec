package Lec_3;

public class Pat_2 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		
		int nst = 1;
		
		while (row <= n) {

//			rule 2
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

//			
			row++;
			System.out.println();
			nst++;

		}
	}
}
