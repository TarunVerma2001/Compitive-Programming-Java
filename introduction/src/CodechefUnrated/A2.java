package CodechefUnrated;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.StringTokenizer;

public class A2 {

	
	public static class students{
		int height;
		int iq;
		public students(int height, int iq) {
			this.height = height;
			this.iq = iq;
		}
	}
	class Sortbyheight implements Comparator<students>
	{
	    public int compare(students a, students b)
	    {
	        return a.height - b.height;
	    }
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc = new FastScanner();
		int t= sc.nextInt();
		for(int tt = 0;tt<t;tt++) {
			int n = sc.nextInt();
			int h[] = sc.readArray(n);
			int ii[] = sc.readArray(n);
			ArrayList<students> s = new ArrayList<students>();
			for(int i =0;i<n;i++) {
				s.add(new students(h[i], ii[i]));
			}
			Collections.sort(list, c);
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
