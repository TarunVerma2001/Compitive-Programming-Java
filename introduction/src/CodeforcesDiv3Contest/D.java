package CodeforcesDiv3Contest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.StringTokenizer;


public class D {

	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc = new FastScanner();
		int t = sc.nextInt();
		for(;t>0;t--) {
			int n = sc.nextInt();
			int arr[] = sc.readArray(n);
			HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
			for(int x: arr) {
				if(mpp.containsKey(x)) {
					int temp = mpp.get(x) + 1;
					mpp.put(x, temp);
				} else {
					mpp.put(x, 1);
				}
			}
			if(mpp.size() == 1) {
				System.out.println(n);
				continue;
			}
			boolean ok = false;
			if((n & 1) == 0) {
				ok = true;
			}
			ArrayList<Integer> b = new ArrayList<Integer>();
			for(Map.Entry<Integer, Integer> e: mpp.entrySet()) {
				b.add(e.getValue());
			}
			Collections.sort(b);
			int count = 0;
			for(int i =0;i<b.size()-1;i++) {
				count += b.get(i);
			}
			int cnt = b.get(b.size() - 1);
			int ans = Math.max(0, (cnt - count));
			if(ans != 0) {
				System.out.println(ans);
				continue;
			} 
			if(ok == true) {
				ans++;
			}
			System.out.println(ans);
				
				
			
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
