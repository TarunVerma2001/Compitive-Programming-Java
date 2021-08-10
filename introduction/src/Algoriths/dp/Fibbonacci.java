package Algoriths.dp;

public class Fibbonacci {
	static int dp[] = new int[4000]; 
	
	public static void _initialize() {
		for(int i = 0;i<4000;i++) {
			dp[i] = -1;
		}
	}
	public static int solve(int n) {
		
		if(dp[n] != -1) {
			if(n == 0 || n == 1)
				dp[n] = n;
			else
				dp[n] = solve(n-1) + solve(n-2);
			
		}
		return dp[n];
		
	}
	public static void main(String [] args) {
		int n = 8;
		System.out.println(solve(n));
		
	}
	
}
