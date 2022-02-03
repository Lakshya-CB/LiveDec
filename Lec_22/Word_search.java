package Lec_22;

public class Word_search {
	static boolean sol = false;

	public boolean exist(char[][] board, String word) {
		sol = false;
		boolean[][] bulboard = new boolean[board.length][board[0].length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				char ch = word.charAt(0);
				if (ch == board[i][j]) {
					stringexist(board, word, bulboard, i, j);
					if (sol)
						return sol;
				}
			}
		}
		return sol;
	}

	public static void stringexist(char[][] board, String word, boolean[][] bulboard, int r, int c) {
		if (word.length() == 0) {
			sol = true;
			return;
		}
		if (r == board.length || c == board[0].length || r < 0 || c < 0 || board[r][c] != word.charAt(0))
			return;
		
		if (!bulboard[r][c]) {
			bulboard[r][c] = true;
			stringexist(board, word.substring(1), bulboard, r - 1, c);
			stringexist(board, word.substring(1), bulboard, r + 1, c);
			stringexist(board, word.substring(1), bulboard, r, c - 1);
			stringexist(board, word.substring(1), bulboard, r, c + 1);
			bulboard[r][c] = false;
		}
	}
}
