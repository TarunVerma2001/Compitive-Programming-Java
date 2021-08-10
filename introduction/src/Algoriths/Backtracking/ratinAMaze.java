package Algoriths.Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class ratinAMaze {

	public static boolean isSafe(ArrayList<ArrayList<Integer>> arr, int x, int y, int n) {
		
		
		if(x < n && y < n && arr.get(x).get(y) == 1) {
			return true;
		}
		return false;
		
	}
	
	public static boolean ratinMaze(ArrayList<ArrayList<Integer>> arr, int x, int y, int n, ArrayList<ArrayList<Integer>> solArr) {
		
		if(x == n-1 && y == n-1) {
			solArr.get(x).set(y, 1);
			return true;
		}
		
		if(isSafe(arr, x, y, n)) {
			solArr.get(x).set(y, 1);
			if(ratinMaze(arr, x+1, y, n, solArr)) {
				return true;
			}
			if(ratinMaze(arr, x, y+1, n, solArr)) {
				return true;
			}
			solArr.get(x).set(y, 0);	//backtracking
			return false;
			
		}
//		System.out.println(solArr);
		return false;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>> ();
		for(int i =0;i<n;i++) {
			ArrayList<Integer> arrtemp = new ArrayList<Integer>();
			for(int j =0;j<n;j++) {
				arrtemp.add(0);
			}
			arr.add(arrtemp);
		}
		for(int i = 0;i<n;i++) {
			for(int j =0;j<n;j++) {
				int temp = sc.nextInt();
				arr.get(i).set(j, temp);
			}
		}
		ArrayList<ArrayList<Integer>> solArr = new ArrayList<ArrayList<Integer>> ();
		for(int i =0;i<n;i++) {
			ArrayList<Integer> arrtemp = new ArrayList<Integer>();
			for(int j =0;j<n;j++) {
				arrtemp.add(0);
			}
			solArr.add(arrtemp);
		}
		boolean temp1 = ratinMaze(arr, 0, 0, n, solArr);
		System.out.println(temp1);
		if(ratinMaze(arr, 0, 0, n, solArr) == true) {	
			
			for(int i = 0;i<n;i++) {
				for(int j = 0;j<n;j++) {
					System.out.print(solArr.get(i).get(j) + " ");
				}
				System.out.println();
			}
//			System.out.println(solArr);
		}
		
		
	}
	
}
