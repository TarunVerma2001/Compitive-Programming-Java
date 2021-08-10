package Algoriths.DynamicProgrammingSelf;

public class KnapSack01 {

	public static int knapsackRec(int ind, int n, int val[], int wt[], int W) {
		if(ind >= n || W == 0) {
			return 0;
		}
		if(wt[ind] <= W) {
			int left = ( knapsackRec(ind+1, n, val, wt, W-wt[ind]) + val[ind]);
			int right = knapsackRec(ind+1, n, val, wt, W);
			return Math.max(left, right);
		} else {
			return knapsackRec(ind+1, n, val, wt, W);
		}
	}
	
	public static int knapsackDP(int ind, int n, int wt[], int val[], int W, int dp[][]) {
		if(ind >= n || W == 0) {
			return 0;
		}
		if(dp[ind][W] != -1)
			return dp[ind][W];
		if(wt[ind] <= W) {
			int left = val[ind] + knapsackDP(ind+1, n, wt, val, W-wt[ind], dp);
			int right = knapsackDP(ind+1, n, wt, val, W-wt[ind], dp);
			return dp[ind][W] = Math.max(left,  right);
		} else {
			return dp[ind][W] = knapsackDP(ind+1, n, wt, val, W-wt[ind], dp);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wt[] = {
				25, 25, 30
		};
		int val[] = {
				100, 100, 180
		};
		int n = 3;
		int W = 50;
//		System.out.println(knapsackRec(0, 3, val, wt, 50));
		int dp[][] = new int[n][W+1];
		for(int i =0;i<n;i++) {
			for(int j = 0;j<=W;j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println(knapsackDP(0, n, wt, val, W, dp));
	}

}
