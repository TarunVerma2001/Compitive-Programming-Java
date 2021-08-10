package codechefLunchMarch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.util.Random;
import java.util.StringTokenizer;

public class F {

	static int mod = 998244353;
	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc = new FastScanner();
		long n = sc.nextLong();
		long k = sc.nextLong();
		long x[] = new long [(int) (n+1)];

		long y[] = new long [(int) (n+1)];

		long v[] = new long [(int) (n+1)];
		
		for(long i =1;i<=n;i++) {
			x[(int) i] = sc.nextLong();
			y[(int) i] = sc.nextLong();
			v[(int) i] = sc.nextLong();
		}
		long cost = Integer.MIN_VALUE;
		for(long i = 1;i<=n;i++) {
			for(long j = i;j<=n;j++) {
				long c = k*(j - i);
				c = 0 - c;
//				c /= mod;
				
				for(long o = 1;o<=n;o++) {
					if(x[(int) o] >= i && y[(int) o] <= j) {
						c += v[(int) o];
//						c /= mod;
					}
				}
				cost = Math.max(cost, c);
				cost %= mod;
				
				
			}
		}
		System.out.println(cost);
		
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
