package Lec_9;

public class input_2D_array {
	public static void main(String[] args) {

		int[][] arr = new int[4][5];
//		arr[0]= new int[99];
//		int[] arr_magic = new int[909];
//		arr_magic = new int[9090];
				
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				arr[r][c] = r * 10 + c;
			}
		}

		for (int[] row : arr) {
			for (int ali : row) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}
	}
}
