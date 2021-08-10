package codeforces10032021;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class B {

	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc = new FastScanner();
		int t = sc.nextInt();
		for(int tt = 0;tt<t;tt++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int arr[] = sc.readArray(n);
			ruffleSort(arr);
			int max = Integer.MIN_VALUE;
			int mex = -1;
			int pre = -1;
			boolean is = false;
			for(int i = 0;i<n;i++) {
				max = Math.max(max, arr[i]);
				if(arr[i] != i) {
					if(!is) {
						mex = i;
						is = true;
					}
				}
			}
			if(mex < 0) {
				mex = n;
			}
			
			System.out.println("max :: mex : " + max + " " + mex);
			
			
		}
		
	}
	static long gcd(long a, long b) {
		if (b==0) return a;
		return gcd(b, a%b);
	}
 
	static void ruffleSort(int[] arr) {
		int n=arr.length;
		Random r=new Random();
		for (int i=0; i<arr.length; i++) {
			int oi=r.nextInt(n); long temp=arr[i];
			arr[i]=arr[oi];
			arr[oi]=(int) temp;
		}
		Arrays.sort(arr);
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
