package codechefMarchLong;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class C2 {

	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		FastScanner sc = new FastScanner();
		int t= sc.nextInt();
		for(int tt = 0;tt< t;tt++) {
			long n, e, h, a, b, c;
			n = sc.nextLong();
			e = sc.nextLong();
			h = sc.nextLong();
			a = sc.nextLong();
			b = sc.nextLong();
			c = sc.nextLong();
			int min = Integer.MAX_VALUE;
			long count = 0;

			int ans4 = Integer.MAX_VALUE;
			for(int x = 0;x<=n;x++) {
				for(int y = 0;y<=(n-x);y++) {
					boolean condOfOmlette = ((e - x) >= (2*(n-x-y)));
					boolean condOfMilk = ((h - x) >= 3*y);
					boolean condOfCake = ((e >= x) && (h >= x));
					if(x == 1) {
						int temp = (int) ((a*(n-x-y)) + (b*y) + (c*x));
					}
					if(condOfOmlette && condOfMilk && condOfCake) {
						int temp = (int) ((a*(n-x-y)) + (b*y) + (c*x));
						ans4 = Math.min(ans4, temp);
					}
					
				}
			}
			int max = (int) Math.max(Math.max(a, b), c);
			max = (int) (max * n);
			if(ans4 <= max) {
				System.out.println(ans4);
			} else {
				System.out.println(-1);
			}
			
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
