package dynamicProgramming;

public class SubSetSum {

//	static boolean dp[][] = new boolean[4001][4001];
	//	initialize dp
	
//	static void initializeDP() {
//		for(int i = 0;i<4000;i++) {
//			for(int j = 0;j<4000;j++) {
//				dp[i][j] = false;
//			}
//		}
//	}
	
	//Wuth DP
	public static boolean subsetSumDP(int arr[], int n, int Sum) {
//		initializeDP();
		boolean dp[][] = new boolean[n+1][Sum+1];
		System.out.println(n+1);
		System.out.println(Sum+1);
		for(int i = 0;i<=n;i++) {
			dp[i][0] = true;
		}
		for(int i = 1;i<=Sum;i++) {
			dp[0][i] = false;
		}
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=Sum;j++) {
				
				if(arr[i-1] <= j) {
					dp[i][j] = (dp[i-1][j - arr[i-1]] || dp[i-1][j]);
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		return dp[n][Sum];
		
		
	}
	
	
	//with recursion TIME COMPLEXITY + 2^n
	public static boolean SubSetSum(int arr[], int n, int sum) {
//		base case
		if(sum == 0) {
			return true;
		}
		if(n == 0) {
			return false;
		}
		if(arr[n-1] > sum) {
			return SubSetSum(arr, n-1, sum);
		}
		if(SubSetSum(arr, n-1, sum) == true) {
			return true;
		} else if(SubSetSum(arr, n-1, sum - arr[n-1]) == true) {
			return true;
		} else {
			return false;
		}
		
		
	}
	public static void main(String[] args) {
		int arr[] = {2, 3, 7, 8, 10};
		int sum = 11;
		int n = 5;
//		System.out.println(SubSetSum(arr, n, sum));
		System.out.println(subsetSumDP(arr, n, sum));
	}
	
}
