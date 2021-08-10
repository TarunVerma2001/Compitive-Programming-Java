package JanuaryLongChallenge;
import java.util.*;
public class blackJack {
	
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

	public static void solve(int arr[], int n, int x, int y) {
		if(subsetSumDP(arr, n, x, y) == false) {
			System.out.println("called");
			System.out.println("-1");
			return;
		}
		int max = 0;
		int sum = 0;
		int i = 0;
		ArrayList<Integer> sumArr = new ArrayList<Integer>();
		ArrayList<Integer> remArr = new ArrayList<Integer>();
		for(i = 0;i<n;i++) {
			if((sum + arr[i]) >=x && (sum + arr[i]) <=y) {
				sum += arr[i];
				sumArr.add(arr[i]);
				System.out.println(0);
				return;
			} else if((sum + arr[i]) <= y) {
				sum += arr[i];
				sumArr.add(arr[i]);
				max = Math.max(arr[i], max);
			} else if((sum + arr[i]) > y){
				break;
			}
		}
		for(;i<n;i++) {
			remArr.add(arr[i]);
		}
		Collections.sort(sumArr);
		Collections.sort(remArr);
		System.out.println(sumArr + " " + remArr);
		for(i = 0;i<sumArr.size();i++) {
			
			for(int j = 0;j<remArr.size();j++) {
				if((sum - sumArr.get(i) + remArr.get(j)) >= x && (sum - sumArr.get(i) + remArr.get(j)) <= y){
					
					System.out.println("called for 1 swap");
					System.out.println("i and j are : " +i + " " + j);
					System.out.println("1");
					return;
				}
			}
			for(int j = 0;j<sumArr.size();j++) {
				if(j == i) 
					continue;
				for(int o = 0;o<remArr.size();o++) {
					for(int p = 0;p<remArr.size();p++) {
						if(p == o)
							continue;
						if((sum - (sumArr.get(i) + sumArr.get(j)) + (remArr.get(o) + remArr.get(p))) >= x && (sum - (sumArr.get(i) + sumArr.get(j)) + (remArr.get(o) + remArr.get(p))) <= y) {
							System.out.println("2");
							return;
						}
					}
				}
			}
		}
		if(sumArr.size() == 0) {
			System.out.println("-1");
			return;
		}
//		System.out.println(sumArr + " " + remArr);
		System.out.println("-1");
		return;
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
