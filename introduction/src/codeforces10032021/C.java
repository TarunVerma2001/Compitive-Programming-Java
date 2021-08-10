package codeforces10032021;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class C {

	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc = new FastScanner();
		int t = sc.nextInt();
		for(int tt = 0;tt<t;tt++) {
			int n = sc.nextInt();
			long a[] = new long[n];
			long b[] = new long [n];
			int i1 = 0;
			int j1 = 0;
			for(int i = 0;i<2*n;i++) {
				long x = sc.nextLong();
				long y = sc.nextLong();
				if(x == 0) {
					if(y < 0) {
						a[i1] = y * -1;
					} else {
						a[i1] = y;
					}
					i1++;
				} else {
					if(x < 0) {
						b[j1] = x * -1;
					} else {
						b[j1] = x;
					}
					j1++;
				}
			}
			ruffleSort(a);
			ruffleSort(b);
//			for(int x: a) {
//				System.out.print(x + " ");
//			} System.out.println();
//			System.out.println("b : ");
//			for(int x: b) {
//				System.out.print(x + " ");
//			} System.out.println();		
			
			double ans1 = 0;
			double ans2 = 0;
			double ans3 = 0;
			
			for(int i = 0;i<n;i++) {
//				double temp = Math.sqrt( (double)((1 << a[i])  +(1 << b[i])) );
				double temp = Math.sqrt( (double)(a[i] * a[i] + b[i] * b[i])  );
				ans1 += temp;
			}
			for(int i = 0;i<n;i++) {
//				double temp = Math.sqrt( (double)((1 << a[i])  +(1 << b[i])) );
				double temp = Math.sqrt( (double)(a[i] * a[i] + b[n- i-1] * b[n- i-1])  );
				ans2 += temp;
			}
			for(int i = 0;i<n;i++) {
//				double temp = Math.sqrt( (double)((1 << a[i])  +(1 << b[i])) );
				double temp = Math.sqrt( (double)(a[n- i-1] * a[n- i-1] + b[i] * b[i])  );
				ans3 += temp;
			}
			ans1 = Math.min(ans1, ans2);
			ans1 = Math.min(ans1, ans3);
			System.out.println(ans1);
			
		}
		
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
