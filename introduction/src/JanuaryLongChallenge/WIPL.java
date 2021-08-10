package JanuaryLongChallenge;
import java.util.*;
public class WIPL {
	
	public static boolean SubSetSum(ArrayList<Integer> v, int sum, long remaining) {
		
		int n = v.size();
		
		boolean dp[][] = new boolean[n+1][sum+1];
		
		for(int i = 0;i<=sum;i++) {
			dp[0][i] = false;
		}
		for(int i = 0;i<=n;i++) {
			dp[i][0] = true;
		}
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=sum;j++) {
				if(v.get(i-1) <= j) {
					dp[i][j] = (dp[i-1][j-v.get(i-1)] || dp[i-1][j]);
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		ArrayList<Integer> store= new ArrayList<>();
		for(int i = 0;i<= sum/2;i++) {
			if(dp[n][i]) {
				store.add(i*2);
			}
		}
		int minimum = Integer.MAX_VALUE;
		for(int i = 0;i<store.size();i++) {
			minimum = Math.min(sum - store.get(i), minimum);
		}
		if(minimum <= remaining) {
			return true;
		}
		return false;
		
	}
	public static int solve(int arr[], int n, int k) {
	 
		
		if(n == 1) {
			return -1;
		}
		
		int sum = 0;
		sum = arr[n-1];
		int count = 1;
		boolean temp = false;
		ArrayList<Integer> v = new ArrayList<Integer>();
		v.add(arr[n-1]);
		for(int i = n-2;i>=0;i--) {
			
			sum += arr[i];
			
			count++;
			
			v.add(arr[i]);
			
			if(sum >= 2 * k) {
				long remaining = sum -(2*k);
				if(SubSetSum(v, sum, remaining) == true) {
					temp = true;
					break;
				}
				
			}
		}
		if(temp = false) {
			return -1;
		}
		return count;
		
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int i = 0;i<t;i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int arr[] = new int[n];
			for(int j = 0;j<n;j++) {
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(solve(arr, n, k));
		}
	}
}
