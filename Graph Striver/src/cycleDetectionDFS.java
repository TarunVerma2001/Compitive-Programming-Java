import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;
public class cycleDetectionDFS {
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

static int abs(int a) {
	return Math.abs(a);
}

static long abs(long a) {
	return Math.abs(a);
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

static class pair {
	int fr, sc;

	pair(int fr, int sc) {
		this.fr = fr;
		this.sc = sc;
	}
}

////////////////////////////////////////////////////////////////////////////////////
////////////////////DO NOT TOUCH BEFORE THIS LINE //////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////

static List<Integer> adj[];

static boolean dfsCycle(int node,int par, int n, boolean vis[]) {
	vis[node] = true;
	for(int i: adj[node]) {
		if(!vis[i]) {
			if(dfsCycle(i, node, n, vis)) return true;
		} else if(i != par){
			return true;
		}
	}
	return false;
}
public static boolean isCycle(boolean vis[], int n) {
	for(int i =1;i<=n;i++) {
		if(!vis[i]) {
			if(dfsCycle(i, -1, n, vis)) {
				return true;
			}
		}
	}
	return false;
}
public static void main(String[] args) {
	int t = 1;
//	t = sc.nextInt();
	outer: for (int tt = 0; tt < t; tt++) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		adj = new List[n + 1];
		for(int i =0;i<=n;i++) {
			adj[i] = new ArrayList<Integer>();
		}
		for(int i =0;i<m;i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			adj[u].add(v);
			adj[v].add(u);
		}
		boolean vis [] = new boolean[n+1];
		Arrays.fill(vis, false);
		System.out.println(isCycle(vis, n));
	}
}

////////////////////////////////////////////////////////////////////////////////////	
//////////////////THIS IS THE LAST CHANCE!!!!!//////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////

}
