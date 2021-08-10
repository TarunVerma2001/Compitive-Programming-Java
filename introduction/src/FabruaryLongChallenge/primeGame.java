package FabruaryLongChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class primeGame {
	
	static int n = 1000001;
	public static boolean [] mark = new boolean[n+1];
	public static int [] primes = new int[n+1];
	
	
	
	public static void Sieve() {
//		boolean [] mark = new boolean[n+1];
		for(int i =0;i<=n;i++) {
			mark[i] = true;
		}

		for(int p = 2;p*p <= n;p++) {
			if(mark[p] == true) {
				for(int i = p*p;i<=n;i+=p) {
					mark[i] = false;
				}
			}
		}
		primes[1] = 0;
		for(int i = 2;i<=n;i++) {
			primes[i] = primes[i-1];
			if(mark[i]) {
				primes[i]++;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		
		FastScanner sc =new FastScanner();
		int t = sc.nextInt();
		Sieve();
		
		for(int tt = 0;tt<t;tt++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(primes[x] <= y) {
				System.out.print("Chef\n");
			} else {
				System.out.print("Divyam\n");
			}
		}

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
