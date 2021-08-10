import java.io.BufferedReader ;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class topLeft_to_bottomRight {
	// author: Tarun Verma
	static FastScanner sc = new FastScanner();
	static int inf = Integer.MAX_VALUE;
	static long mod = 1000000007;
	static int totalPaths = 0;

	public static boolean isSafe(int n, int m, int i, int j, int grid[][], boolean visited[][]) {
		return(i>=0 && j>=0 && i<n && j <m && visited[i][j] == false);
	}
	
	
	public static void helper(int i, int j, int n, int m, int grid[][], boolean visited[][]) {
		if(i == n-1 && j == m-1) {
			totalPaths ++;
			return;
		}
		if(!isSafe(n, m, i, j, grid, visited)) return;
		visited[i][j] = true;
		if(i+1 < n && grid[i+1][j] == 0) {
			helper(i+1, j, n, m, grid, visited);
		}
		if(j+1 < m && grid[i][j+1] == 0) {
			helper(i, j+1, n, m, grid, visited);
		}
		visited[i][j] = false;
	}
	public static void rec(int n, int m, int grid[][]) {
		boolean visited[][] = new boolean[n][m];
		for(int i = 0;i<n;i++)
			for(int j = 0;j<m;j++)
				visited[i][j]= false;
		helper(0, 0, n, m, grid, visited);
		System.out.println(totalPaths);
	}
	
	public static void bottomUP(int n, int m, char grid[][]) {
		int dp[][] = new int[n+1][m+1];
		for(int i = 0;i<=n;i++)
			for(int j = 0;j<=m;j++)
				dp[i][j] = 0;
		dp[n][m] = 1;
		for(int i = n;i>0;i--)
			for(int j = m;j>0;j--) {
				if(i == n && j == m)
					//base case
					continue;
				if(grid[i][j] == '#') {
					dp[i][j] = 0;
					continue;
				}
				dp[i][j] = ( (i==n) ? 0:dp[i+1][j] )+ ((j == m)? 0:dp[i][j+1]); 
			}
			
		System.out.println(dp[1][1]);
	}
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		char grid[][] = new char[n+1][m+1];
		for(int i = 1;i<=n;i++) {
			String temp = sc.next();
			for(int j = 1;j<=m;j++) {
				grid[i][j] = temp.charAt(j-1);
			}
		}
		bottomUP(n, m, grid);
//		rec(n, m, grid);
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
