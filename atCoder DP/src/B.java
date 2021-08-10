import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;
public class B {
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

public static int frogTD(int n, int k, int arr[], int dp[]) {
	if(n == 0) {
		return 0;
	}
	if(dp[n] != -1) {
		return dp[n];
	}
	int ans = inf;
	for(int i = 1;i<= k;i++) {
		if(n - i >= 0) {
			ans = min(ans, Math.abs(arr[n] - arr[n-i]) + frogTD(n-i, k, arr, dp));
		}
	}
	return dp[n] = ans;
}

public static void frogBU(int n, int k, int arr[]) {
	int dp[] = new int[n+1];
	
	Arrays.fill(dp, inf);
	dp[0] = 0;
//	if(n == 1) {
//		System.out.println(dp[0]);
//		return;
//	}
	for(int i = 1;i<n;i++) {
		for(int j = 1;j<k+1;j++) {
			if(i - j < 0) break;
			dp[i] = min(dp[i], dp[i-j] + Math.abs(arr[i] - arr[i-j]));
//			System.out.println(dp[i]);
		}
	}
	System.out.println(dp[n-1]);
}

public static void main(String[] args) {
	
	int t;
	t = 1;
//	t = sc.nextInt();
	for (int tt = 0; tt < t; tt++) {
		int n = sc.nextInt(), k = sc.nextInt();
		int arr[] = sc.readArray(n);
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(frogTD(n-1, k, arr, dp));
//		frogBU(n, k, arr);
	}
}

////////////////////////////////////////////////////////////////////////////////////	
//////////////////THIS IS THE LAST CHANCE!!!!!//////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////

}
