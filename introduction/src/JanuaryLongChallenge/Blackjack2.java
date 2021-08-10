package JanuaryLongChallenge;

import java.util.*;

public class Blackjack2 {
	
	public static boolean subsetSumDP(int arr[], int n,int x, int Sum) {
//		initializeDP();
		boolean dp[][] = new boolean[n+1][Sum+1];
//		System.out.println(n+1);
//		System.out.println(Sum+1);
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
//		return dp[n][Sum];
		for(int i = x;i<=Sum;i++) {
			if(dp[n][i] == true) {
				return true;
			}
		}
		return false;
		
		
	}

	public static boolean sum(int arr[], int n, int x, int y) {
		
		int sum = 0;
		for(int i = 0;i<n;i++) {
			if((sum + arr[i]) >=x && (sum + arr[i]) <=y) {
				sum += arr[i];
				return true;
			} else if((sum + arr[i]) <= y) {
				sum += arr[i];
			} else if((sum + arr[i]) > y){
				return false;
			}
		}
		return false;
	}
	
	public static void solve(int arr[], int n, int x, int y) {
		if(subsetSumDP(arr, n, x, y) == false) {
			System.out.println("-1");
			return;
		}
		if(sum(arr, n, x, y)) {
			System.out.println("0");
			return;
		}
		int a[] = arr.clone();
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				if(i != j) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					if(sum(a, n, x, y)) {
						System.out.println("1");
						return;
					} else {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(i != j) {
					for(int o = j+1;o<n;o++) {
						if(o != i && o != j) {
							for(int p = o+1;p<n;p++) {
								if(p != i && p != j && p != o) {
									int temp1 = arr[i];
									int temp2 = arr[j];
									arr[i] = arr[o];
									arr[j] = arr[p];
									if(sum(arr, n, x, y)) {
										System.out.println("2");
										return;
									}
									temp1 = arr[i];
									temp2 = arr[j];
									arr[i] = arr[o];
									arr[j] = arr[p];
									
									temp1 = arr[i];
									temp2 = arr[j];
									arr[i] = arr[p];
									arr[j] = arr[o];
									if(sum(arr, n, x, y)) {
										System.out.println("2");
										return;
									}
									temp1 = arr[i];
									temp2 = arr[j];
									arr[i] = arr[p];
									arr[j] = arr[o];
								}
							}
						}
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o = 0;o<t;o++) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int arr[] = new int [n];
			for(int i = 0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			solve(arr, n, x, y);
		}
	}
}
