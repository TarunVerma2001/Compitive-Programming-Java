import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class E {
// author: Tarun Verma
static FastScanner sc = new FastScanner();
static long inf = 1000000007;
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

//public static long knap2TD(int n, int w, int wt[], int val[], int dp[][]) {
//	
//}\


public static void knap2BUSpaceOpti(long n, long w, long wt[], long val[]) {
	
	long dp1[] = new long[(int) (n*1000+1)];

	long dp2[] = new long[(int) (n*1000+1)];
	
	Arrays.fill(dp1, inf);
	Arrays.fill(dp2, inf);
	
	dp1[0] = 0;
	dp1[(int) val[0]] = wt[0];

	for(int i = 1;i<n;i++) {
		for(int j = 0;j<=n*1000;j++) {
			if(val[i] > j) {
				dp2[j] = dp1[j];
			} else {
				dp2[j] = min(dp2[j], min(dp1[j], wt[i] + dp1[(int) (j - val[i])]));
			}
		}
		for(int j = 0;j<n*1000+1;j++) {
			dp1[j] = dp2[j];
			dp2[j] = inf;
		}
	}
	long ans = 0;
	for(int j = 0;j<n*1000+1;j++) {
		if(dp1[j] <= w)
			ans = j;
	}
	System.out.println(ans);
}


public static void knap2BU(long n, long w, long wt[], long val[]) {
	
	long dp[][] = new long[(int) (n+1)][(int) (n*1000+1)];
	for(int i = 0;i<=n;i++) {
		for(int j = 0;j<=n*1000;j++) {
			dp[i][j] = inf;
		}
	}
	dp[0][0] = 0;
	dp[0][(int) val[0]] = wt[0];
//	System.out.println(dp[0][3]);
	for(int i = 1;i<n;i++) {
		for(int j = 0;j<=n*1000;j++) {
			if(val[i] > j) {
				dp[i][j] = dp[i-1][j];
			} else {
				long a = dp[i-1][j];
				long b = (wt[i] + dp[i-1][(int) (j-val[i])] );
				dp[i][j] = min(a, b);
			}
		}
	}

	long ans = 0;
	for(int i = 0;i<n*1000+1;i++) {
		if(dp[(int) (n-1)][i] <= w) {
			ans = i;
		}
	}
	System.out.println(ans);
	
	
	
}



public static void main(String[] args) {
	
	long n = sc.nextLong(),w = sc.nextLong();
	long wt[] = new long[(int) n];
	long val[] = new long[(int) n];
	for(int i = 0;i<n;i++) {
		wt[i] = sc.nextLong();
		val[i] = sc.nextLong();
	}
//	knap2BU(n, w, wt, val);
	knap2BUSpaceOpti(n, w, wt, val);
	
}

////////////////////////////////////////////////////////////////////////////////////	
//////////////////THIS IS THE LAST CHANCE!!!!!//////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////

}
