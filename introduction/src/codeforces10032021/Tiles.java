package codeforces10032021;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class Tiles {

	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		FastScanner sc = new FastScanner();
		int t= sc.nextInt();
		for(int tt = 0;tt<t;tt++) {
			int n = sc.nextInt();
			int k1 = sc.nextInt();
			int k2 = sc.nextInt();
			int w = sc.nextInt();
			int b = sc.nextInt();
			int b1 = n - k1;
			int b2 = n - k2;
			boolean white = false;
			boolean black = false;
			if(k1 != k2) {
				if(w > Math.max(k1, k2)) {
					System.out.println("NO");
					continue;
				}
				
				if(w > Math.min(k1, k2)) {
					int temp = Math.abs(k1 - k2);
					temp /= 2;
					if((w - Math.min(k1, k2)) > temp) {
						System.out.println("NO");
						continue;
					}
				}
				
				if(b > Math.max(b1, b2)) {
					System.out.println("NO");
					continue;
				}
				if(b > Math.min(b1, b2)) {
					int temp = Math.abs(b1 - b2);
					temp /= 2;
					if((b - Math.min(b1, b2)) > temp) {
						System.out.println("NO");
						continue;
					}
				}
				System.out.println("YES");
			} else if(k1 == k2) {
				if(w > k1) {
					System.out.println("NO");
					continue;
				}
				if(b > b1) {
					System.out.println("NO");
					continue;
				}
				System.out.println("YES");
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
