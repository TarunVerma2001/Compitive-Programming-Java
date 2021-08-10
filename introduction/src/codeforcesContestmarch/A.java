package codeforcesContestmarch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.StringTokenizer;



public class A {

	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		FastScanner sc = new FastScanner();
		int t = sc.nextInt();
		for(int tt = 0;tt<t;tt++) {
			int n = sc.nextInt();
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int i =0;i<n;i++) {
				a.add(sc.nextInt());
			}
			if(n == 1) {
				System.out.println(a.get(0));
				continue;
			}
			
			Collections.sort(a);
			ArrayList<Integer> b1 = new ArrayList<Integer>();

			ArrayList<Integer> b2 = new ArrayList<Integer>();
			int j =0;
			while(a.size() != 0) {
				for(int i =0;i<a.size();i++) {
					if(i == 0) {
						b1.add(a.get(i));
						b2.add(a.get(i));
					} else {
						if(a.get(i) != a.get(i-1)) {
							b1.add(a.get(i));
							b2.add(a.get(i));
						}
					}
				}
				for(int i = 0;i<b2.size();i++) {
					a.remove(b2.get(i));
				}
				b2.clear();
			}
			
			
			
			for(int x: b1) {
				System.out.print(x + " ");
			}
			System.out.println();
			
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
