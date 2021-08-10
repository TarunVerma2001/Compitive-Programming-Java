package dynamicProgramming;

public class knapsack01 {
	
	public static int dp[][] = new int[400][400];
	
	public static void initialize() {
//		for(int i = 0;i<400;i++) {
//			for(int j = 0;j < 400;j++) {
//				dp[i][j] = -1;
//			}
//		}
		for(int i = 0;i<400;i++) {
			dp[i][0] = 0;
			dp[0][i] = 0;
		}
	}
	
	public static int knapsackDP(int wt[], int val[], int W, int n) {
		initialize();
		for(int i = 1;i<n+1;i++) {
			
			for(int j = 1;j<W+1;j++) {
				
				if(wt[i-1] <= j) {
					dp[i][j] = Math.max((val[i-1] + dp[i-1][j-wt[i-1]]), dp[i-1][j]);
//					System.out.println(dp[i][j]);
//					System.out.println(Math.max((val[i-1] + dp[i-1][j-wt[i-1]]), dp[i-1][j]));
				} else {
					dp[i][j] = dp[i-1][j];
//					System.out.println(dp[i][j]);
				}
			}
		}
//		System.out.println("dp[n][W] : " + dp[n][W]);
		return dp[n][W];
		
	}
	
	public static void main(String[] args) {
		int val[] = {60, 100, 120};
		int wt[] = {10, 20, 30};
		int W = 50;
		int n = 3;
		
		
//		System.out.println(dp[1][1]);
		System.out.println(knapsackDP(wt, val, W, n));
	}
	
}
