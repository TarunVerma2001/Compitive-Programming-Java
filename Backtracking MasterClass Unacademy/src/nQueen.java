import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class nQueen {

	static FastScanner sc = new FastScanner();
	static long mod = 1000000007;
	
	static int count = 0;
	
	public static boolean isItSafe(ArrayList<ArrayList<Boolean>> grid, int row, int col, int n){
		
		//Column Check
		for(int i = row -1 ;i >= 0;i--) //Column Check
			if(grid.get(i).get(col)) return false;
		for(int i =row-1, j = col-1;i>=0 && j >= 0;i--, j--) //left dig
			if(grid.get(i).get(j)) return false;
		for(int i = row-1, j = col+1;i>=0 && j<n ;i--, j++) //right dig
			if(grid.get(i).get(j)) return false;
		return true;
		
	}
	public static void display(ArrayList<ArrayList<Boolean>> grid, int n) {
		for(int i = 0;i<n;i++) {
			for(int j  =0;j<n;j++) {
				if(grid.get(i).get(j)) System.out.print("Q ");
				else System.out.print(". ");
			}System.out.println();
		}
		System.out.println();
	}
	
	public static void nQ(ArrayList<ArrayList<Boolean>> grid, int curr_row, int n) {
		if(curr_row == n) {
			count++;
			display(grid, n);
			return;
		}
		
		for(int i =0;i<n;i++) {
			if(isItSafe(grid, curr_row, i, n)) {	// yet to be implemented
				grid.get(curr_row).set(i, true);
				nQ(grid, curr_row+1, n);
				grid.get(curr_row).set(i, false);
			}
			
		}
	}
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		ArrayList<ArrayList<Boolean>> grid = new ArrayList<ArrayList<Boolean>>();
		for(int i = 0;i<n;i++) {
			grid.add(new ArrayList<Boolean>());
			for(int j = 0;j<n;j++)	grid.get(i).add(false);
		}
		nQ(grid, 0, n);
		System.out.println(count);
		
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
