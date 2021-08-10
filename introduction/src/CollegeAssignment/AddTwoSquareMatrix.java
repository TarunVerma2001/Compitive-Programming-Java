package CollegeAssignment;

import java.util.Scanner;

public class AddTwoSquareMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size of the Matrix : ");
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int arr2[][] = new int[n][n];
		System.out.println("Enter matrix 1 : ");
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter matrix 2 : ");
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		int arr3[][] = new int[n][n];
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				arr3[i][j] = arr[i][j] + arr2[i][j];
			}
		}
		System.out.println("Sum of Matrices is : ");
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}

	}

}
