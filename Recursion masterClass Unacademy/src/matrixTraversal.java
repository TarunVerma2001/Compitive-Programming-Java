
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
public class matrixTraversal {

	static int totalPaths = 0;
	
	public static void matrixT(int n, int m, int i, int j, String osf) {
		//Base Case
		if(i == n-1 && j == m-1) {
			//we found the destination
			totalPaths ++;
			System.out.println(osf);
			return;
		} 
		if(i >= n || j >= m) {
			return;
		}
		//Recursive Assumption
		matrixT(n, m, i, j+1, osf+"⇨R ");
		matrixT(n, m, i+1, j, osf+"⇩D ");
		matrixT(n, m, i+1, j+1, osf+"⬂d ");
		
	}
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int m = sc.nextInt();
		matrixT(n, m, 0, 0, "");
		System.out.println("Total Paths: " + totalPaths);
		
		
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
