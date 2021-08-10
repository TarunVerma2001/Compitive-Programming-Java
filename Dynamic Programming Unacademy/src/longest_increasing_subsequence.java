 	import java.io.BufferedReader ;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class longest_increasing_subsequence {
	// author: Tarun Verma
	static FastScanner sc = new FastScanner();
	static int inf = Integer.MAX_VALUE;
	static long mod = 1000000007;
	
	
	
	public static void lisBU(int arr[], int n) {
		int dp[] = new int[n+1];
		Arrays.fill(dp, 1);
		dp[0] = 1;
		dp[1] = 1;
		for(int i = 1;i<n;i++) {
			for(int j = 0;j<i;j++) {
				if(arr[i] > arr[j]) {
					dp[i] = max(dp[i], 1 + dp[j]);
				}
			}
		}
		int ans = -inf;
		for(int i = 0;i<=n;i++) {
			ans = max(ans, dp[i]);
		}
		System.out.println(ans);
	}
	
	static int rec(int arr[], int n, int dp[]) {
		if(n <= 0) {
			return 1;
		}
		if(dp[n] != -1) {
			return dp[n];
		}
		int ans = 1;
		for(int i = 0;i<n;i++) {
			if(arr[n] > arr[i]) {
				ans = max(ans, 1 + rec(arr, i, dp));
			}
		}
		return dp[n] = ans;
	}

	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int arr[] = {1,3,6,7,9,4,10,5,6};
//		lisBU(arr, n);
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(rec(arr, n-1, dp));
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
