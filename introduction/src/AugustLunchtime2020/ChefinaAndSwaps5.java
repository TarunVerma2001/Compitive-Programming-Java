package AugustLunchtime2020;
import java.util.*;
public class ChefinaAndSwaps5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			int j = 1;
			for(int i =0;i<n;i++) {
				arr[i] = j;
				j++;
			}
			System.out.println(maxSum(arr, n));
		}
		
	}
	public static int maxSum(int a[], int n) {
		
	int sum = 0;
	for(int i=0;i<n;i++) {
		sum += a[i];
	}	
	int limit = 2 * sum + 1;
	int dp[][] = new int[n+1][limit];
	for(int i=0;i<n + 1;i++) {
		for(int j = 0;j < limit;j++) {
			dp[i][j] = Integer.MIN_VALUE;
		}
	}
	
	dp[0][sum] = 0;
	for(int i=1; i<=n;i++) {
		for(int j = 0;j<limit;j++) {
			if((j - a[i-1]) >= 0 && dp[i-1][j-a[i-1]] != Integer.MIN_VALUE ) {
				dp[i][j] = Math.max(dp[i][j], dp[i-1][j-a[i-1]] + a[i-1]);
			}
			
			if((j+a[i-1] ) < limit && dp[i-1][j+a[i-1]] != Integer.MIN_VALUE) {
				
				dp[i][j] = Math.max(dp[i][j], dp[i-1][j + a[i-1]]);
			}
			if(dp[i-1][j] != Integer.MIN_VALUE) {
				dp[i][j] = Math.max(dp[i][j], dp[i-1][j]);
			}
			
		}
	}
	
	return dp[n][sum];
	}

}
