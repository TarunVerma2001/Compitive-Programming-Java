package codechefLunchMarch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class F2 {

	static int mod = 998244353;
//	static long l = 1000000000 + 5;
	
	public static void solve(long n, long k, long[] x, long[] y, long v[]) {
		long ans = 0;
		for(long i = 1;(i < (1<<n));i++) {
			long temp = 0;
			long L = Integer.MAX_VALUE;
			long R = 0;
			for(long j = 0;j<n;j++) {
				
				if(((i & (1<<j)) == 0)) {
					
					L = Math.min(L, x[(int) j]);
					R = Math.max(R, y[(int) j]);
					temp += v[(int) j];
					System.out.println("l " + L );
					System.out.println("r " + R);
					System.out.println("temp " + temp);
				}
				
			}

			long cost = k * (R - L);
			temp -= cost;
			System.out.println("temp1 " + temp);
			ans = Math.max(ans, temp);
			
		}
		System.out.println(ans);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long x[] = new long [(int) (n)];

		long y[] = new long [(int) (n)];

		long v[] = new long [(int) (n)];
		
		for(long i =0;i<n;i++) {
			x[(int) i] = sc.nextLong();
			y[(int) i] = sc.nextLong();
			v[(int) i] = sc.nextLong();
		}
		solve(n, k, x, y, v);
		
		
		
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
