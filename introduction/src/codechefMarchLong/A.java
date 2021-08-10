package codechefMarchLong;
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
		int t= sc.nextInt();
		for(int tt = 0;tt< t;tt++) {
			int n = sc.nextInt();
			int a[] = sc.readArray(n);
			int arr[] = new int[n];
			for(int i = 0;i<n;i++) {
				arr[i] = i+1;
			}
			ruffleSort(a);
			int i = 0;
			boolean res = true;
			int ans = 0;
			while(i < n) {
				if(a[i] <= arr[i]) {
					ans += (arr[i] - a[i]);
				} else {
					res = false;
					break;
				}
				i++;
			}
			if(res == true) {
				if((ans & 1) == 0) {
					System.out.println("Second");
				} else {
					System.out.println("First");
				}
			} else {
				System.out.println("Second");
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
