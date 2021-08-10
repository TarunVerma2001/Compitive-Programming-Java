import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;
public class C {

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
																//acti //din
public static int vacationTD(int n, int a[], int b[], int c[], int dp[][], int osf) {
	if(n == 0) {
		dp[0][0] = a[0];
		dp[1][0] = b[0];
		dp[2][0] = c[0];
		return dp[osf][n];
//		return max(dp[0][0])
		
	}
	if(dp[osf][n] != -1) {
		return dp[osf][n];
	}
	if(osf == 0) {
		return dp[osf][n] = a[n] + max(vacationTD(n-1, a, b, c, dp, 1), vacationTD(n-1, a, b, c, dp, 2));
	} else if(osf == 1) {
		return dp[osf][n] = b[n] + max(vacationTD(n-1, a, b, c, dp, 0), vacationTD(n-1, a, b, c, dp, 2));
	} else  {
		return dp[osf][n] = c[n] + max(vacationTD(n-1, a, b, c, dp, 0), vacationTD(n-1, a, b, c, dp, 1));
	}
//	int sub1, sub2, sub3;
//	dp[0][n] = a[n] + max(vacationTD(n-1, a, b, c, dp, 1), vacationTD(n-1, a, b, c, dp, 2));
//	dp[1][n] = b[n] + max(vacationTD(n-1, a, b, c, dp, 0), vacationTD(n-1, a, b, c, dp, 2));
//	dp[2][n] = c[n] + max(vacationTD(n-1, a, b, c, dp, 0), vacationTD(n-1, a, b, c, dp, 1));
//	return max(dp[0][n], max(dp[1][n], dp[2][n]));
	
}

public static void vacationBU(int n) {
	int dp[][] = new int[3][n];
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	dp[0][0] = a;
	dp[1][0] = b;
	dp[2][0] = c;
	for(int i = 1;i<n;i++) {
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		dp[0][i] = a + max(dp[1][i-1], dp[2][i-1]);
		dp[1][i] = b + max(dp[0][i-1], dp[2][i-1]);
		dp[2][i] = c + max(dp[0][i-1], dp[1][i-1]);
	}
	System.out.println(max(dp[0][n-1], max(dp[1][n-1], dp[2][n-1])));
}

public static void main(String[] args) {
	int t;
	t = 1;
//	t = sc.nextInt();
	for (int tt = 0; tt < t; tt++) {
		int n = sc.nextInt();
		vacationBU(n);
//		int a[], b[], c[];
//		a = new int[n];
//		b = new int[n];
//		c = new int[n];
//		for(int i = 0;i<n;i++) {
//			a[i] = sc.nextInt();
//			b[i] = sc.nextInt();
//			c[i] = sc.nextInt();
//			
//		}
//		int dp[][] = new int[3][n+1];
//		for(int i = 0;i<=n;i++) {
//			dp[0][i] = -1;
//			dp[1][i] = -1;
//			dp[2][i] = -1;
//		}
//		int sub1 = vacationTD(n-1, a, b, c, dp, 0);
//		int sub2 = vacationTD(n-1, a, b, c, dp, 1);
//		int sub3 = vacationTD(n-1, a, b, c, dp, 2);
//		System.out.println(max(sub1, max(sub2, sub3)));
	}
}

////////////////////////////////////////////////////////////////////////////////////	
//////////////////THIS IS THE LAST CHANCE!!!!!//////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////

}
