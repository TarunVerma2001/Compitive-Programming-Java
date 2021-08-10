package googleCodeJam2021;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class moonsAndUmbrellas {

	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc = new FastScanner();
		int t = sc.nextInt();
		for(int tt = 0;tt<t;tt++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			String s = sc.next();
			int n = s.length();
			int cost = 0;
			ArrayList<Character> arr = new ArrayList<Character>();
			for(int i = 0;i<n;i++) {
				if(s.charAt(i) != '?') {
					arr.add(s.charAt(i));
				}
			}
			if(arr.size() == 1 || arr.size() ==0) {
				cost = 0;
			} else {
				for(int i = 0;i<arr.size()-1;i++) {
					if(arr.get(i) != arr.get(i+1)) {
						if(arr.get(i) == 'C') {
							cost += x;
						} else {
							cost += y;
						}
					}
				}
			}
			System.out.println("Case #" + (tt+1) + ": " + cost);
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
