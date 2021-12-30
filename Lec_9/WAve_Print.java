package Lec_9;

public class WAve_Print {
	public static void main(String[] args) {
		int[][]tri_tatt = { {11, 12 ,13 ,14},
							{21, 22, 23 ,24},
							{31, 32 ,33 ,34},
							{41, 42, 43, 44}};
		wave(tri_tatt);
	}
	public static void wave(int[][] tri_tatt) {
		for(int c =0;c<tri_tatt[0].length;c++) {
			for(int r =0;r<tri_tatt.length;r++) {
				int row_top = r;
				if(c%2==1) {
					row_top=tri_tatt.length-r-1;
				}
				System.out.print(tri_tatt[row_top][c]+" ");
			}
			System.out.println();
		}
	}
}
