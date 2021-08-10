
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
public class allPermutationsOfAString {

	
	
	public static void permutations(String s, String osf) {
		//Base Case
		if(s.length() == 0) {
			System.out.println(osf);
			return;
		}
		for(int j = 0;j<s.length();j++) {
			String ros = s.substring(0, j) + s.substring(j+1);
			permutations(ros, osf+ s.charAt(j));
		}
		
		
	}
	public static void permutationsNotUnique(String s, String osf) {
		//Base Case
		if(s.length() == 0) {
			System.out.println(osf);
			return;
		}
		HashSet<Character> set = new HashSet<Character>();
		for(int j = 0;j<s.length();j++) {
			char ch = s.charAt(j);
			if(!set.contains(ch)) {
				String ros = s.substring(0, j) + s.substring(j+1);
				set.add(ch);
				permutationsNotUnique(ros, osf+ ch);
			}
		}
		
 		
	}
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		String s = sc.next();
		permutationsNotUnique(s, "");
		
		
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
