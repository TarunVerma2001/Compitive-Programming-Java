	import java.io.BufferedReader ;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class minimizing_coins {
	// author: Tarun Verma
	static FastScanner sc = new FastScanner();
	static int inf = Integer.MAX_VALUE;
	static long mod = 1000000007;
	
	public static long minCoinsTD(int coins[], int n, int sum, long dp[]) {
		//base case
		if(sum<0)
			return inf;
		if(sum == 0)
			return 0;
		if(dp[sum] != -1) {
			return dp[sum];
		}
		long result = inf;
		for(int i = 0;i<n;i++) {
			long recResult = minCoinsTD(coins, n, sum-coins[i], dp);
			if(recResult != inf) {
				result = Math.min(result, 1+recResult);
			}
		}
		return dp[sum] = result; 
		
	}
	
	public static void minCoinsBU(int coins[], int n, int sum) {
		
		long dp[] = new long [sum+1];
		Arrays.fill(dp, inf);
		dp[0] = 0;
		for(int i = 1;i<=sum;i++) {
			for(int j = 0;j<n;j++) { 
				if(coins[j] > i) {
					continue;
				} else {
					dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
				}
			}
		}
		if(dp[sum] == inf)
			System.out.println(-1);
		else
			System.out.println(dp[sum]);
	}

	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int coins[] = sc.readArray(n);
		long dp[] = new long[x+1];
		Arrays.fill(dp, -1);
		minCoinsBU(coins, n, x);
		
	}
	static boolean isPalindrom(char[] arr, int i, int j) {
		boolean ok = true;
		while(i<=j) {
			if(arr[i] != arr[j]) {
				ok = false;
				break;
			}
			i++;
			j--;
		}
		return ok;
	}
	static int max(int a, int b) {return Math.max(a, b);}
	static int min(int a, int b) {return Math.min(a, b);}
	static int maxArr(int a[]) { 
		ruffleSort(a);
		return a[a.length - 1];
	}
	static int minArr(int a[]) { 
		ruffleSort(a);
		return a[0];
	}
	static void swap(long arr[], int i, int j) {
		long temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static long gcd(long a, long b) {
		if (b==0) return a;
		return gcd(b, a%b);
	}
	static void ruffleSort(int[] a) {
		int n=a.length;
		Random r=new Random();
		for (int i=0; i<a.length; i++) {
			int oi=r.nextInt(n); int temp=a[i];
			a[i]=a[oi];
			a[oi]=temp;
		}
		Arrays.sort(a);
	}
	public static int binarySearch(int a[], int target) {
		int left = 0;
		int right = a.length - 1;
		int mid = (left+ right) / 2;
		int i = 0;
		while(left <= right) {
			if(a[mid] <= target) {
				i = mid+1;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
			mid = (left + right) / 2;
		}
		return i;
	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		int[][] read2dArray(int n, int m){
			int arr[][] = new int[n][m];
			for(int i= 0;i<n;i++) {
				for(int j = 0;j<m;j++) {
					arr[i][j] = nextInt();
				}
			}
			return arr;
		}
		
		ArrayList<Integer> readArrayList(int n){
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int i = 0;i<n;i++) {
				int a = nextInt();
				arr.add(a);
			}
			return arr;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
	
	/*
	 * when you thing of giving up, think that other are hardworking!!!
	 */
}
