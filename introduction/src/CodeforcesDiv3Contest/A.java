package CodeforcesDiv3Contest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;


public class A {

	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc = new FastScanner();
		int t = sc.nextInt();
		for(;t>0;t--) {
			long n = sc.nextLong();
			long m = sc.nextLong();
			long x = sc.nextLong();
			long col;
			if(x % n == 0) {
				col = x / n;
			} else {
				col = x / n + 1;
			}
			long row;
			if(x % n == 0) {
				row = n;
			} else {
				row = x % n;
			}
//			System.out.println( row + "  " + col);
			
			if(row == 1 && col == 1) {
				System.out.println(x);
			} else {
				long ans =( m * row) - (m - col); 
				System.out.println(ans);
			}
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
