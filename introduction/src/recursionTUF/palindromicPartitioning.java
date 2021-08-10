package recursionTUF;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class palindromicPartitioning {

	public static boolean isPalindrom(String s, int start, int end) {
		
		while(start <= end) {
			if(s.charAt(start++) != s.charAt(end--)) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void solve(int n, String s, int index, ArrayList<ArrayList<String>> ans, ArrayList<String> res) {
		
		if(index == n) {
			ans.add(new ArrayList<String>(res));
			return;
		}
		for(int i = index;i<n;i++) {
			if(isPalindrom(s, index, i)) {
				res.add(s.substring(index, i+1));
				solve(n, s, i + 1, ans, res);
				res.remove(res.size()-1);
			}
		}
		
		
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc = new FastScanner();
		String s = sc.next();
		int n = s.length();
		ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
		solve(n, s, 0, ans, new ArrayList<String>());	
		System.out.println(ans);
		
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
