package Lec_20;

import java.util.Scanner;

public class Sudoku_Solver {
	public static void main(String[] args) {
		int[][] board = new int[9][9];
		Scanner scn = new Scanner(System.in);
		int waste = scn.nextInt();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = scn.nextInt();
			}
		}
		System.out.println("_________________");
//		disp(board);
		sudoku(0, 0, board);
	}

	public static void sudoku(int r, int c, int[][] board) {
		if (c == board[0].length) {
			r++;
			c = 0;
		}
		if (r == board.length) {
			disp(board);
			return;
		}

		if (board[r][c] != 0) {
			sudoku(r, c + 1, board);
		} else {
			for (int i = 1; i <= 9; i++) {
				if (isSafe(board, r, c, i)) {
					board[r][c] = i;
					sudoku(r, c + 1, board);
					board[r][c] = 0;
				}
			}
		}
	}

	private static boolean isSafe(int[][] board, int r, int c, int i) {
		// TODO Auto-generated method stub
//		same row!!
		for(int col = 0;col<9;col++) {
			if(board[r][col]==i) {
				return false;
			}
		}
//		same col
		for(int row = 0;row<9;row++) {
			if(board[row][c]==i) {
				return false;
			}
		}
//		boxing logic!!
		int boxr = r/3;
		int boxc = c/3;
		for(int rr = boxr*3;rr<boxr*3+3;rr++ ) {
			for(int cc = boxc*3;cc<boxc*3+3;cc++ ) {
				if(board[rr][cc]==i) {
					return false;
				}
			}
		}
		return true;
	}

	public static void disp(int[][] arr) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==============================");
	}
}
