package Algoriths.DynamicProgrammingSelf;

import java.util.Scanner;

public class AtCoderDPA {

	public static int Rec(int i, int n, int h[]) {
		if(i == n) {
			return 0;
		}
		if(i > n) {
			return Integer.MAX_VALUE;
		}
		int left = Math.abs(h[i]-h[i+1]) + Rec(i+1, n, h);
		int right = Integer.MAX_VALUE;
		if(i+2 <= n) {
			right = Math.abs(h[i]-h[i+2]) + Rec(i+2, n, h);
		}
//		if(left <= right) {
//			System.out.println("i");
//		} else {
//			System.out.println("i+1");
//		}
		return Math.min(left, right);
	}
	public static int Dp(int dp[], int i, int n, int h[]) {
		if(i == n) {
			return dp[i] = 0;
		}
		if(i > n) {
			return Integer.MAX_VALUE;
		}
		if(dp[i] != -1) {
			return dp[i];
		} else {
			int left = Math.abs(h[i]-h[i+1]) + Rec(i+1, n, h);
			int right = Integer.MAX_VALUE;
			if(i + 2 <= n) {
				right = Math.abs(h[i]-h[i+2]) + Rec(i+2, n, h);
			}
			return dp[i] = Math.min(left, right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int h[] = new int[n+1];
		h[0] = -1;
		for(int i = 1;i<=n;i++) {
			h[i] = sc.nextInt();
		}
		int dp[] = new int[n+1];
		for(int i = 0;i<=n;i++) {
			dp[i] = -1;
		}
//		System.out.println(Rec(1, n, h));
		System.out.println(Dp(dp, 1, n, h));
		
	}

}
