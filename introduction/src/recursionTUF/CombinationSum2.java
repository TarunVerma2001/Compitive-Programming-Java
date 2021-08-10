package recursionTUF;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class CombinationSum2 {

	
	public static void solve(int index, int target, int[] arr, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> res) {
		
		if(target == 0) {
			res.add(new ArrayList<Integer>(ans));
			return;
		}
		
		
		
		for(int i = index;i<arr.length;i++) {
			if(i > index && arr[i] == arr[i-1])
				continue;
			if(arr[i] > target) {
				break;
			}
			ans.add(arr[i]);
			solve(i+1, target-arr[i], arr, ans, res);
			ans.remove(ans.size() - 1);
			
			
		}
		
		
		
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int arr[] = sc.readArray(n);
		int target = sc.nextInt();
		ruffleSort(arr);
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		solve(0, target, arr, ans, res);
		System.out.println(res);
		
		
	}
	static long gcd(long a, long b) {
		if (b==0) return a;
		return gcd(b, a%b);
	}
 
	static void ruffleSort(int[] arr) {
		int n=arr.length;
		Random r=new Random();
		for (int i=0; i<arr.length; i++) {
			int oi=r.nextInt(n); long temp=arr[i];
			arr[i]=arr[oi];
			arr[oi]=(int) temp;
		}
		Arrays.sort(arr);
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
