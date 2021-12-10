package Lec_3;

public class Pat_6 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		
		int nsp = 0; 
		int nst = n;
				
		while (row <= n) {

			int csp =1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst =1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			
			row++;
			System.out.println();
			nsp = nsp +2;
			nst--;
		}
		System.out.println(cst);
	}
	int n11=5;
}
