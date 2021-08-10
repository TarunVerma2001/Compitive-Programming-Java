package Algoriths.DynamicProgrammingSelf;

import java.io.*;
import java.util.Scanner;

public class LCS {
	
	public static int RecLCS(int i, int j, String a, String b) {
		if(i>= a.length() || j>=b.length()) {
			return 0;
		}
		if(a.charAt(i) == b.charAt(j)) {
			return (1 + RecLCS(i+1, j+1, a, b));
		} else {
			int left = RecLCS(i+1, j, a, b);
			int right = RecLCS(i, j+1, a, b);
			return Math.max(left, right);
		}
	}
	
	public static int dpLCS(int dp[][], int i, int j, String a, String b) {

//		int dp[][] = new int[a.length()+1][b.length()+1];
		
		if(i >= a.length() || j >= b.length()) {
			return 0;
		}
		if(dp[i][j] != -1) {
			return dp[i][j];
		} else {
			if(a.charAt(i) == b.charAt(j)) {
				return dp[i][j] = 1 + dpLCS(dp, i+1, j+1, a, b);
			} else {
				int left = dpLCS(dp, i+1, j, a, b);
				int right = dpLCS(dp, i, j+1, a, b);
				return dp[i][j] = Math.max(left, right);
			}
			
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Reader sc = new Reader();
//		String a = sc.readLine();
//
//		String b = sc.readLine();
		Scanner sc = new Scanner (System.in);
		String a = sc.next();
		String b = sc.next();
		
//		System.out.println(RecLCS(0, 0, a, b));
		int dp[][] = new int[a.length()][b.length()];
		for(int i = 0;i<a.length();i++) {
			for(int j = 0;j<b.length();j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println(dpLCS(dp , 0, 0, a, b));
	}

}
