package Algoriths;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;
import java.util.StringTokenizer;

public class nextGreaterElementUsingStack {

	
	public static void nextGreater(int arr[], int nge[], int n) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		for(int i = 0;i<n;i++)
			nge[i] = -1;
		for(int i = 1;i<n;i++) {
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				nge[stack.peek()] = arr[i];
				stack.pop();
			}
			stack.push(i);
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int arr[] = sc.readArray(n);
		int nge[] = new int[n];
		nextGreater(arr, nge, n);
		for(int x: nge) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		
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
