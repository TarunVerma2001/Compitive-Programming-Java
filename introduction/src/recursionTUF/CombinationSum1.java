package recursionTUF;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class CombinationSum1 {

	
	public static void solve(int index, int target, int[] arr, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> res) {
		if(index == arr.length) {
			if(target == 0) {
				res.add(new ArrayList<Integer>(ans));
			}
			return;
		} 
		
		if(arr[index] <= target) {
			ans.add(arr[index]);
			solve(index, target-arr[index], arr, ans, res);
			ans.remove(ans.size() - 1);
		}
		solve(index+1, target, arr, ans, res);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int arr[] = sc.readArray(n);
		int target = sc.nextInt();
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		solve(0, target, arr, ans, res);
		System.out.println(res);
		
		
	}
	static long gcd(long a, long b) {
		if (b==0) return a;
		return gcd(b, a%b);
	}
 
	static void ruffleSort(long[] a) {
		int n=a.length;
		Random r=new Random();
		for (int i=0; i<a.length; i++) {
			int oi=r.nextInt(n); long temp=a[i];
			a[i]=a[oi];
			a[oi]=temp;
		}
		Arrays.sort(a);
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
		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
