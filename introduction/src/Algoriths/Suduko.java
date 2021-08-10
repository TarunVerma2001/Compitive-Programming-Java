package Algoriths;

public class Suduko {
	static int n = 9;

	public static boolean isSafe(int arr[][], int num, int row, int col) {
		
		for(int i = 0;i<=8;i++) {
			if(arr[row][i] == num)
				return false;
		}
		for(int i = 0;i<=8;i++) {
			if(arr[i][col] == num)
				return false;
		}
		int startRow = row - row % 3;
		int startCol = col - col % 3;
		
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				if(arr[i + startRow][j+startCol] == num) {
					return false;
				}
			}
		}
		return true;
		
	}
	public static boolean solveGrid(int arr[][], int row, int col) {
		if(row == n-1 && col == n-1) {
			return true;
		}
		
		if(col == n) {
			row ++;
			col = 0;
		}
		
		if(arr[row][col] != 0) {
			return solveGrid(arr, row, col+1);
		}
		
		for(int num = 1;num <10;num++) {
			if(isSafe(arr, num, row, col)) {
				arr[row][col] = num;
				if(solveGrid(arr, row, col+1)) {
					return true;
				}
			}
			arr[row][col] = 0;
			
		}
		return false;
		
	}
	public static void printSuduko(int arr[][]) {
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int arr[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
		                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
		                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
		                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
		                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
		                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
		                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
		                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
		                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		if(solveGrid(arr, 0, 0)) {
			printSuduko(arr);
		} else {
			System.out.println("no solution exist");
		}
	}
}
