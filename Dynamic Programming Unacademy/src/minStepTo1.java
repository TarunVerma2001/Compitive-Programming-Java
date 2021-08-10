import java.io.BufferedReader ;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class minStepTo1 {

	static FastScanner sc = new FastScanner();
	static long mod = 1000000007;
	
	public static int dpTD(int n, int dp[]) {
		if(n == 1) return 0;
		if(n ==2) return 1;
		if(n == 3) return 1;
		if(n < 1) return Integer.MAX_VALUE;
		
		if(dp[n] != -1) return dp[n];
		
		int div_by_3 = Integer.MAX_VALUE;
		int div_by_2 = Integer.MAX_VALUE;
		int sub_by_1 = Integer.MAX_VALUE;
		
		if(n%3 == 0) {
			div_by_3 = 1 + dpTD(n/3, dp);
		}
		if(n%2 == 0) {
			div_by_2 = 1 + dpTD(n/2, dp);
		}
		sub_by_1 = 1 + dpTD(n-1, dp);
		return dp[n] = Math.min(div_by_2,Math.min(div_by_3, sub_by_1));
		
	}

	public static int dpBU(int n) {
		int dp[] = new int[n+1];
		dp[0] = Integer.MAX_VALUE;
		dp[1] = 0;
		dp[2] = dp[3] = 1;
		for(int i = 4;i<=n;i++) {
			int div_by_3 = Integer.MAX_VALUE;
			int div_by_2 = Integer.MAX_VALUE;
			int sub_by_1 = Integer.MAX_VALUE;
			if(i % 3 == 0) {
				div_by_3 = 1 + dp[i/3];
			}
			if(i % 2 == 0) {
				div_by_2 = 1 + dp[i/2];
			}
			sub_by_1 = 1 + dp[i-1];
			dp[i] = Math.min(div_by_2,Math.min(div_by_3, sub_by_1));
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		
		
		int n = sc.nextInt();
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(dpTD(n, dp));
		System.out.println(dpBU(n));
		
	}
	
	
	public static boolean isPalindrom(char[] arr, int i, int j) {
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
	

}
