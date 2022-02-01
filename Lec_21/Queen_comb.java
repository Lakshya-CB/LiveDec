package Lec_21;

public class Queen_comb {
	public static void main(String[] args) {
		Qcomb_wrt_box2D(0, 0, 3, 4, 3, "", new boolean[3][4]);
	}

	public static void Qcomb_wrt_box2D(int curr_r, int curr_c, int total_r, int total_c, int toSelect, String ans,
			boolean[][] board) {
		if (toSelect == 0) {
			System.out.println(ans);
			return;
		}
//		Moving to the next row logic!!
		if (curr_c == total_c) {
			curr_r++;
			curr_c = 0;
		}

//		-ve BC
		if (curr_r == total_r) {
			return;
		}
		if (isSafe(board, curr_r, curr_c)) {
			board[curr_r][curr_c] = true;
			Qcomb_wrt_box2D(curr_r, curr_c + 1, total_r, total_c, toSelect - 1,
					ans + "Q{" + curr_r + "," + curr_c + "}", board); // Bede
		}
		board[curr_r][curr_c] = false; // ??
		Qcomb_wrt_box2D(curr_r, curr_c + 1, total_r, total_c, toSelect, ans, board); // Na Bede

	}

	public static boolean isSafe(boolean[][] board, int r, int c) {
//	check col!!
		for (int rr = 0; rr < r; rr++) {
			if (board[rr][c]) {
				return false;
			}
		}
//		check row
		for (int cc = 0; cc < c; cc++) {
			if (board[r][cc]) {
				return false;
			}
		}

// Left up
		int rr1 = r;
		int cc1 = c;
		while (rr1 >= 0 && cc1 >= 0) {
			if (board[rr1][cc1]) {
				return false;
			}
			rr1--;
			cc1--;
		}
		// right up
		int rr2 = r;
		int cc2 = c;
		while (rr2 >= 0 && cc2 < board[0].length) {
			if (board[rr2][cc2]) {
				return false;
			}
			rr2--;
			cc2++;
		}
		return true;
	}
}
