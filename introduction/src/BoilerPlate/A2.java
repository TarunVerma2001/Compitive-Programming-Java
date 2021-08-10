package BoilerPlate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class A2 {

//	static int a[];
	public static int solve(int i, int j, int arr[], int k) {
		int sum = 0;
		int size = j - i +1;
		if(size == 1) {
			return (k - 1);
		}
//		sum += (arr[i+1] - arr[i] - 1);
		sum += (arr[i+1] - 2);
//		System.out.println((arr[i+1] - arr[i] - 1));
//		sum += (arr[j] - arr[j-1] - 1);
		sum+=k - arr[j-1] - 1;
//		System.out.println((arr[j] - arr[j-1] - 1));
		for(int o= i+1;o<= j-1;o++) {
			sum += (arr[o+1] - arr[o-1] - 2);
		}
		return sum;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int q = sc.nextInt();
		int k = sc.nextInt();
		
		int arr[] = sc.readArray(n);
		for(int x = 0;x<q;x++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			i--;
			j--;
			int sum = solve(i, j, arr, k);
			System.out.println(sum);
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
