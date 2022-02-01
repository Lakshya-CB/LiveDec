package Lec_20;

public class Blocked_path {
	public static void main(String[] args) {
		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		maze(0, 0, 3, 3, maze, "", new boolean [maze.length][maze[0].length]);
	}

	public static void maze(int r, int c, int destr, int destc, int[][] board, String path, boolean [][] isVisited) {
		if(r==destr && c==destc) {
			System.out.println(path);
			return;
		}
		if (r < 0 || c < 0 || r == board.length || c == board[0].length||board[r][c]==1||isVisited[r][c]) {
			return ;
		}
//		System.out.println(path);
		isVisited[r][c]= true;
		maze(r - 1, c, destr, destc, board, path + "U",isVisited);
		maze(r + 1, c, destr, destc, board, path + "D",isVisited);
		maze(r, c - 1, destr, destc, board, path + "L",isVisited);
		maze(r, c + 1, destr, destc, board, path + "R",isVisited);
		isVisited[r][c]= false;
	}
}
