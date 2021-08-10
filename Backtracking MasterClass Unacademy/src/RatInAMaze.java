import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class RatInAMaze {
	static int totalPaths = 0;
	public static FastScanner sc = new FastScanner();
	static long mod = 1000000007;
	
	public static boolean isItSafe(int i , int j ,int n , ArrayList<ArrayList<Boolean>> visited) {
		return (i>=0 && j>=0 && i<n && j < n && visited.get(i).get(j) == false);
	}
	
	
	
	
	public static void helper(int i , int j, int n, ArrayList<ArrayList<Integer>> grid, ArrayList<ArrayList<Boolean>> visited ) {
		if(i == n-1 && j == n-1) {
			totalPaths++;
			return;
		}
		if(!isItSafe(i, j, n, visited))
			//pruning
			return;
		visited.get(i).add(j, true);
		//recursion
		if(i + 1 < n && grid.get(i+1).get(j) == 0) {	//	down
			helper(i+1, j, n, grid, visited);
		}
		if(i-1 >=0 && grid.get(i-1).get(j) == 0) {	//	up
			helper(i-1, j, n, grid, visited);
		}
		if(j+1 <n && grid.get(i).get(j+1) == 0) {	//	right
			helper(i, j+1, n, grid, visited);
		}
		if(j-1 >= 0 && grid.get(i).get(j-1) == 0) {	//	left
			helper(i, j-1, n, grid, visited);
		}
		
		
		visited.get(i).add(j, false);
	}
	
	public static int countRatMazePaths(ArrayList<ArrayList<Integer>> grid ) {
		int n = grid.size();
		ArrayList<ArrayList<Boolean>> visited = new ArrayList<ArrayList<Boolean>>();
		for(int i = 0;i<n;i++) {
			ArrayList<Boolean> temp = new ArrayList<Boolean>();
			for(int j = 0;j<n;j++) 
				temp.add(false);
			visited.add(temp);
		}
		helper(0, 0, n, grid, visited);
		return totalPaths;
	}
	
	
	
	public static void main(String[] args) {
		int n = sc.nextInt();
//		s.substring(0, 0);
//		s.toString();
		ArrayList<ArrayList<Integer>> grid = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0;i<n;i++) {
			grid.add(new ArrayList<Integer>());
			for(int j = 0;j<n;j++) {
				grid.get(i).add(sc.nextInt());
			}
		}
		System.out.println(countRatMazePaths(grid));
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
