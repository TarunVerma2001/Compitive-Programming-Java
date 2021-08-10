
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
public class printAllBinaryStringofLengthWithNoConsecutiveOnes {

	public static void printBinaryStrings(int n, int i, String osf) {
		// Base case
		if(i >= n) {
			System.out.println(osf);
			return;
		}
		// recursive Assumption
		
		if(osf.length() == 0 || osf.charAt(0) == '0') {
			printBinaryStrings(n, i+1, "0"+osf);
			printBinaryStrings(n, i+1, "1"+osf);
		} else {
			printBinaryStrings(n, i+1, "0"+osf);
		}
	}
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		printBinaryStrings(n, 0, "");
		
		
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
