package Algoriths.dp;

import java.util.*;


public class LCS {
	
	//recursive method
	public static int lcs(int i, int j, String s1, String s2) {
		
		//Base Case
		if(i >= s1.length() || j >= s2.length()) {
			return 0;
		}
		if(s1.charAt(i) == s2.charAt(j)) {
			return (1 + lcs(i+1, j+1, s1, s2));
		}
		else {
			int left = lcs(i+1, j, s1, s2);
			int right = lcs(i, j+1, s1, s2);
			return Math.max(left, right);
		}
	}
//	dp method
	
	public static int lcs(int i, int j, String s1, String s2, ArrayList<ArrayList<Integer>> dp) {
		// Base case
		if(i >= s1.length() || j >= s2.length()) {
			return 0;
		}
		
		// if State is visited previously
		if(dp.get(i).get(j) != -1) {
			return dp.get(i).get(j);
		}
		if(s1.charAt(i) == s2.charAt(j)) {
			return 1 + lcs(i+1, j+1, s1, s2, dp);
		} else{
			int left = lcs(i+1, j, s1, s2, dp);
			int right = lcs(i, j+1, s1, s2, dp);
			dp.get(i).set(j, Math.max(left, right));
			return dp.get(i).get(j);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s1 = new String();
		String s2 = new String();
		s1 = sc.next();
		s2 = sc.next();
		int n = s1.length();
		int m = s2.length();
		ArrayList<ArrayList<Integer>> dp = new ArrayList<ArrayList<Integer>>();
		for(int i = 0;i<n;i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int j = 0;j<m;j++) {
				temp.add(-1);
			}
			dp.add(temp);
		}
		System.out.println(dp);
		
		System.out.println(lcs(0, 0, s1, s2, dp));
	}
}
