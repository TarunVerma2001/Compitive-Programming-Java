import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class lootOfRobberFromColony {

	static FastScanner sc = new FastScanner();
	
	static long mod = 1000000007;

	public static int maxLootRec(int arr[], int n) {
		//Base Case
		if(n == 0) return arr[0];
		//recursive assumption
		int sub1 = arr[n] + maxLootRec(arr, n-2);
		int sub2 = maxLootRec(arr, n-1);
		return max(sub1 , sub2);
	}
	
	public static int maxLootTD(int arr[], int n, int dp[], int i) {
		if(i == 0) 
			return dp[0] = arr[0];
		if(i == 1)
			return dp[1] = arr[0] + arr[1];
		if(dp[i] != -1) {
			return dp[i];
		}
		return dp[i] = max(arr[i] + maxLootTD(arr, n, dp, i-2), maxLootTD(arr, n, dp, i-1));
	}
	
	public static int maxLootBU(int arr[], int n) {
		int dp[] = new int[n];
		dp[0] = arr[0];
		dp[1] = max(arr[0], arr[1]);
		for(int i =2;i<n;i++) {
			dp[i] = max(dp[i-2] + arr[i], dp[i-1]);
		}
		return dp[n-1];
	}
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int dp[] = new int[n];
		Arrays.fill(dp, -1);
		int arr[] = sc.readArray(n);
		System.out.println(maxLootTD(arr, n, dp, n-1));
		System.out.println(maxLootBU(arr, n));
		
		
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
	
	static int max(int a, int b) {
		if(a >= b) return a;
		else return b;
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
