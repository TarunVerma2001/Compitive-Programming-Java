import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;
public class D {
// author: Tarun Verma
static FastScanner sc = new FastScanner();
static int inf = Integer.MAX_VALUE;
static long mod = 1000000007;

static boolean isPalindrom(char[] arr, int i, int j) {
	boolean ok = true;
	while (i <= j) {
		if (arr[i] != arr[j]) {
			ok = false;
			break;
		}
		i++;
		j--;
	}
	return ok;
}

static int abs(int a) {
	return Math.abs(a);
}

static long abs(long a) {
	return Math.abs(a);
}

static int max(int a, int b) {
	return Math.max(a, b);
}

static int min(int a, int b) {
	return Math.min(a, b);
}

static long max(long a, long b) {
	return Math.max(a, b);
}

static long min(long a, long b) {
	return Math.min(a, b);
}

static void swap(long arr[], int i, int j) {
	long temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}

static void swap(int arr[], int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}

static int maxArr(int arr[]) {
	int maxi = Integer.MIN_VALUE;
	for (int x : arr)
		maxi = max(maxi, x);
	return maxi;
}

static int minArr(int arr[]) {
	int mini = Integer.MAX_VALUE;
	for (int x : arr)
		mini = min(mini, x);
	return mini;
}

static long maxArr(long arr[]) {
	long maxi = Long.MIN_VALUE;
	for (long x : arr)
		maxi = max(maxi, x);
	return maxi;
}

static long minArr(long arr[]) {
	long mini = Long.MAX_VALUE;
	for (long x : arr)
		mini = min(mini, x);
	return mini;
}

static long gcd(int a, int b) {
	if (b == 0)
		return a;
	return gcd(b, a % b);
}

static long gcd(long a, long b) {
	if (b == 0)
		return a;
	return gcd(b, a % b);
}

static void ruffleSort(int[] a) {
	int n = a.length;
	Random r = new Random();
	for (int i = 0; i < a.length; i++) {
		int oi = r.nextInt(n);
		int temp = a[i];
		a[i] = a[oi];
		a[oi] = temp;
	}
	Arrays.sort(a);
}

public static int binarySearch(int a[], int target) {
	int left = 0;
	int right = a.length - 1;
	int mid = (left + right) / 2;
	int i = 0;
	while (left <= right) {
		if (a[mid] <= target) {
			i = mid + 1;
			left = mid + 1;
		} else {
			right = mid - 1;
		}
		mid = (left + right) / 2;
	}
	return i;
}

static class FastScanner {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer("");

	String next() {
		while (!st.hasMoreTokens())
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	int[] readArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	int[][] read2dArray(int n, int m) {
		int arr[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = nextInt();
			}
		}
		return arr;
	}

	ArrayList<Integer> readArrayList(int n) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int a = nextInt();
			arr.add(a);
		}
		return arr;
	}

	long nextLong() {
		return Long.parseLong(next());
	}
}
////////////////////////////////////////////////////////////////////////////////////
////////////////////DO NOT TOUCH BEFORE THIS LINE //////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////

public static long knapTD(int n, int w, int wrr[], long v[], long dp[][]) {
	if(n < 0 || w < 0) {
		return  0;
	}
	if(dp[n][w] != -1) {
		return dp[n][w];
	}
	if(wrr[n] <= w) {
		
		long sub1 = (v[n] + knapTD(n-1, w-wrr[n], wrr, v, dp));
		long sub2 = knapTD(n-1, w, wrr, v, dp);
		return dp[n][w] = max(sub1, sub2);
	} else {
		return dp[n][w] = knapTD(n-1, w, wrr, v, dp);
	}
	
}

public static void knapBU(int n, int w, int wrr[], long val[]) {
	long dp[][] = new long[n+1][w+1];
	for(int i = 0;i<=n;i++) {
		dp[i][0]  = 0;
	}
	for(int i = 0;i<=w;i++) {
		dp[0][i] = 0;
	}
	for(int i = 1;i<=n;i++) {
		for(int j = 1;j<=w;j++) {
			if(wrr[i-1] <= j) {
				dp[i][j] = max(val[i-1] + dp[i-1][j-wrr[i-1]], dp[i-1][j]);
			} else {
				dp[i][j] = dp[i-1][j];
			}
		}
	}
	System.out.println( dp[n][w]);
}

public static void knapSpaceOptiBU(int n, int w, int wrr[], long val[]) {
	//MAIN INTUTION IS THAT WHEN WE DRY RUN
	//WE SEE THAT IN THE 2D MATRIX WE NEED ONLY TWO ROWS FOR OUR PROFIT
	//SO INSTEAD OF 2D DP WE MADE 2 1D DPs
	long dp1[] = new long[w+1];
	long dp2[] = new long[w+1];
	for(int i = 0;i<n;i++) {
		for(int j = 1;j<=w;j++) {
			if(wrr[i] > j) {
				dp2[j] = dp1[j];
			} else {
				dp2[j] = max(dp2[j], max(val[i] + dp1[j-wrr[i]], dp1[j]));
			}
		}
		for(int j = 1;j<=w;j++) {
			dp1[j] = dp2[j];
		}
		Arrays.fill(dp2, 0);
	}
	System.out.println(dp1[w]);
}

public static void main(String[] args) {
	int t;
	t = 1;
//	t = sc.nextInt();
	for (int tt = 0; tt < t; tt++) {
		int n = sc.nextInt();
		int w = sc.nextInt();
//		long dp[][] = new long[n+1][w+1];
//		for(int i = 0;i<n+1;i++) {
//			for(int j = 0;j<=w;j++) {
//				dp[i][j] = -1;
//			}
//		}
//		int arr[] = sc.readArray(n);
		int wrr[] = new int[n];
		long v[] = new long[n];
		for(int i = 0;i<n;i++) {
			wrr[i] = sc.nextInt();
			v[i] = sc.nextLong();
		}
//		System.out.println(knapTD(n-1, w, wrr, v, dp));
//		knapBU(n, w, wrr, v);
		knapSpaceOptiBU(n, w, wrr, v);
	}
}

////////////////////////////////////////////////////////////////////////////////////	
//////////////////THIS IS THE LAST CHANCE!!!!!//////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////

}
