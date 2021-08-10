import java.io.BufferedReader ;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class AllPossibleSubsetsOfAnArray {
	
	public static FastScanner sc = new FastScanner();
	
	static long mod = 1000000007;
	
	public static void RecursiveApproach(String s, int i, String osf, int n) {
		//Base Case
		if(i == n) {
			System.out.println(osf);
			return;
		}
		//recursive Assumption
		//And Self Work
		RecursiveApproach(s, i+1, osf + s.charAt(i),n);
		RecursiveApproach(s, i+1, osf,n);
	}
	
	public static void backTrack(int arr[], ArrayList<Integer> temp, int i, int n) {
		//Base Case
		if(i == n) {
			System.out.println(temp);
			return;
		}
		//push element
		temp.add(arr[i]);
		backTrack(arr, temp, i+1, n);
		temp.remove(temp.size()-1);
		backTrack(arr, temp, i+1, n);
	}
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
//		int arr[] = sc.readArray(n);
//		backTrack(arr, new ArrayList<Integer>(), 0, n);
		String s = sc.next();
		RecursiveApproach(s, 0, "", n);
		
		
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
