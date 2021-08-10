package codechefMarchLong;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class D {

	public static void Solve(long h[], int n, int maxi) {
		

		int i = n-2;
		int j = n-1;

		maxi = j - i;
		if(n == 2) {
			System.out.println("1");
			return;
		}
		double m = (double)(h[i] - h[j]) / (double)(j - i);
		int pos = j;
		while(j > 0 && j > 1) {
			
			i = j - 1;
			m = (double)(h[i] - h[j]) / (double)(j - i);
			maxi = Math.max(maxi, (j - i));
			while(i>=0) {
				double temp = (double)(h[i] - h[j]) / (double)(j - i);
				if(temp >= m) {
					m = temp;
					pos = i;
					maxi = Math.max(maxi, (j - i));
					i--;
				} else {
					i--;
				}
			}
			j = pos;
		}

		System.out.println(maxi);
		return;
		
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		FastScanner sc = new FastScanner();
		int t= sc.nextInt();
		for(int tt = 0;tt< t;tt++) {
			int n = sc.nextInt();
			long h[] = sc.readArray(n);

			int max = 0;
			Solve(h, n, max);
			
		}
		
		
	}
	static long gcd(long a, long b) {
		if (b==0) return a;
		return gcd(b, a%b);
	}
 
	static void ruffleSort(int[] a) {
		int n=a.length;
		Random r=new Random();
		for (int i=0; i<a.length; i++) {
			int oi=r.nextInt(n); long temp=a[i];
			a[i]=a[oi];
			a[oi]=(int) temp;
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
		long[] readArray(int n) {
			long[] a=new long[n];
			for (int i=0; i<n; i++) a[i]=nextLong();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
