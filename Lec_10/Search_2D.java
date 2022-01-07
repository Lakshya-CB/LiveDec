package Lec_10;

public class Search_2D {
	public static void main(String[] args) {
		int mat[][] = { { 10, 20, 30, 40 }, 
						{ 15, 25, 35, 45 }, 
						{ 27, 28, 37, 48 }, 
						{ 29, 33, 39, 50 } };
		int r = 0;
		int c = mat[0].length - 1;
		int ali = 1;
		while (c >= 0 && r < mat.length) {
			System.out.println(mat[r][c]+ "  __  "+ali);
			if (mat[r][c] == ali) {
				System.out.println("Ali mil gya " + r + "," + c);
				return;
			} else if (mat[r][c] > ali) {
				c--;
			} else {
				r++;
			}

		}

	}
}
