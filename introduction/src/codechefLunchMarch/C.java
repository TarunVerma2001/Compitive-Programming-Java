package codechefLunchMarch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.util.Random;
import java.util.StringTokenizer;

public class C {

	
	public static void solve(int arr[], int n) {
		int res[] = new int[n];
		for(int i =0;i<n;i++)
			res[i] = 0;
		for(int k = 0;k<n;k++) {
			int i = k - 1;
			int j = k+1;
			while(i>=0) {
				if(arr[i] > arr[k]) {
					break;
				} else {
					if(arr[i] == arr[k]) {
						res[k] ++;
					}
				}
				i--;
			}
			while(j <n) {
				if(arr[j] > arr[k]) {
					break;
				} else {
					if(arr[j] == arr[k]) {
						res[k] ++;
					}
				}
				j++;
			}
		}
		for(int i = 0;i<n;i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc = new FastScanner();
		int t = sc.nextInt();
		for(int tt = 0;tt<t;tt++) {
			int n = sc.nextInt();
			int arr[] = sc.readArray(n);
			solve(arr, n);
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
