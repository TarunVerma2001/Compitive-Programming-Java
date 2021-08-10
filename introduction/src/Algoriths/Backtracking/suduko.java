package Algoriths.Backtracking;

public class suduko {
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
	public static boolean solve(int arr[][]) {
		int row = -1;
		int col = -1;
		boolean isEmpty = true;
		for(int i = 0;i<9;i++) {
			for(int j = 0;j<9;j++) {
				if(arr[i][j] == 0) {
					row = i;
					col = j;
					isEmpty = false;
					break;
				}
			}
			if(!isEmpty) {
				break;
			}
		}
		if(isEmpty) {
			return true;
		}
		for(int num = 1;num <=9;num ++) {
			if(isSafe(arr, num, row, col)) {
				arr[row][col] = num;
				if(solve(arr)) {
					return true;
				} else {
					arr[row][col] = 0;	//backtracking
				}
			}
		}
		return false;
		
	}
	public static void printSuduko(int arr[][]) {
		for(int i = 0;i<9;i++) {
			for(int j = 0;j<9;j++) {
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
		if(solve(arr)) {
			printSuduko(arr);
		} else {
			System.out.println("no solution exist");
		}
	}
}