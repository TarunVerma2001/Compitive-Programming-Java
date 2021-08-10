package Algoriths.Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class nQueen {

	public static boolean isSafe(ArrayList<ArrayList<Integer>> arr, int x, int y, int n) {
		for(int row = 0;row<x;row++) {
			if(arr.get(row).get(y) == 1) {
				return false;
			}
		}
		int row = x;
		int col = y;						//function for traking the available space
		while(row >= 0 && col >= 0) {
			if(arr.get(row).get(col) == 1) {
				return false;
			}
			row--;
			col--;
		}
		
		row = x;
		col = y;
		while(row >= 0 && col < n) {
			if(arr.get(row).get(col) == 1) {
				return false;
			}
			row--;
			col++;
		}
		
		return true;
		
	}
	
	public static boolean NQueen(ArrayList<ArrayList<Integer>> arr, int x, int n) {
		if(x >= n) {		//base condition
			return true;   //we have placed n Queens 
		}
		
		for(int col =0;col < n;col++) {
			if(isSafe(arr, x, col, n)) {
				arr.get(x).set(col, 1);
				
				if(NQueen(arr, x+1, n)) {
					return true;
				}
				
				arr.get(x).set(col, 0);    //backtracking
			}
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0;i<n;i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int j =0;j<n;j++) {
				temp.add(0);
			}
			arr.add(temp);
		}
		
		if(NQueen(arr, 0, n)) {
			for(int i = 0;i<n;i++) {
				for(int j = 0;j<n;j++) {
					System.out.print(arr.get(i).get(j) + " ");
				}System.out.println();
			}
		}
	}
	
	
}
