package septemberLongChallenge;

import java.util.*;

public class ADAMAT {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			
			int n = sc.nextInt();
			int mat[][] = new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j = 0;j<n;j++) {
					mat[i][j] = sc.nextInt();
				}
			}
//			for(int i=0;i<n;i++) {
//				for(int j =0;j<n;j++) {
//					System.out.print(mat[i][j] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println(mat.length);
			int temp = n-1;
			int result = 0;
//			System.out.println("temp" + temp);
			for(int i = temp -1 ;i>=0;i--) {
				if(mat[i][temp] > mat[temp][i]) {
					result++;
					mat = transpose(mat, temp + 1);
				}
			}
			for(int j = temp; j>0 ; j--) {
				if(mat[0][j] > mat[j][0]) {
					result++;
					mat = transpose(mat, j + 1);
				}
			}
//			for(int i=0;i<n;i++) {
//				for(int j =0;j<n;j++) {
//					System.out.print(mat[i][j] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println("result : " + result);
			System.out.println(result);
			t--;
		}

	}
	public static int[][] transpose(int a[][], int temp){
		
		int arr[][] = new int[a.length][a.length];
		
		for(int i=0;i<a.length;i++) {
			for(int j =0;j<a.length;j++) {
				arr[i][j] = a[i][j];
			}
		}
		for(int i=0;i<temp;i++) {
			for(int j =0;j<temp;j++) {
				arr[i][j] = a[j][i];
			}
		}
		
		return arr;
	}
}
