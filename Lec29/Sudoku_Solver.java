package Lec29;

public class Sudoku_Solver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		Print(grid, 0, 0);
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static boolean Print(int[][] grid, int row, int col) {
		if (col == 9) {
			col = 0;
			row++;
		}
		if (row == 9) {
			return true;
		}

		if (grid[row][col] != 0) {
			return Print(grid, row, col + 1);

		} else {
			for (int val = 1; val <= 9; val++) {
				if (issafe(grid, row, col, val)) {
					grid[row][col] = val;
					boolean ans = Print(grid, row, col + 1);
					if (ans) {
						return true;
					}
					grid[row][col] = 0;
				}
			}
		}
		return false;

	}

	public static boolean issafe(int[][] grid, int row, int col, int val) {
		// TODO Auto-generated method stub
		// row
		for (int c = 0; c < grid.length; c++) {
			if (grid[row][c] == val) {
				return false;
			}

		}
		// col
		for (int r = 0; r < grid.length; r++) {
			if (grid[r][col] == val) {
				return false;
			}

		}
		row = row - row % 3;
		col = col - col % 3;
		for (int r = row; r < row + 3; r++) {
			for (int c = col; c < col + 3; c++) {
				if (grid[r][c] == val) {
					return false;
				}
			}
		}
		return true;

	}
}
