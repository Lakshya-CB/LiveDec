package Lec_10;

public class Spiral_print {
	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 } };

		int min_r = 0;
		int max_r = arr.length - 1;
		int min_c = 0;
		int max_c = arr[0].length - 1;
		int toe = arr.length * arr[0].length;
		int count = 0;
		while (min_r <= max_r && min_c <= max_c) {
			for (int c = min_c; c <= max_c && count < toe; c++) {
				System.out.print(arr[min_r][c] + " ");
				count++;
			}
			System.out.println();
			for (int r = min_r + 1; r <= max_r && count < toe; r++) {
				System.out.print(arr[r][max_c] + " ");
				count++;
			}
			System.out.println();
			for (int c = max_c - 1; c >= min_c && count < toe; c--) {
				System.out.print(arr[max_r][c] + " ");
				count++;
			}
			System.out.println();
			for (int r = max_r - 1; r >= min_r + 1 && count < toe; r--) {
				System.out.print(arr[r][min_c] + " ");
				count++;
			}
			System.out.println();

			min_r++;
			min_c++;
			max_r--;
			max_c--;
		}
	}
}
