package CodeforcesDiv3Contest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.StringTokenizer;

public class winner {

	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc = new FastScanner();
		int t = sc.nextInt();
		for(;t>0;t--) {
			String a = sc.next();
			String b = sc.next();
			int na = a.length();
			int nb = b.length();
			ArrayList<String> arr = new ArrayList<String>();

			ArrayList<String> brr = new ArrayList<String>();
			for(int i = 0;i<na;i++) {
				for(int j = i;j<na;j++) {
					arr.add(a.substring(i, j+1));
				}
			}
			for(int i = 0;i<nb;i++) {
				for(int j = i;j<nb;j++) {
					brr.add(b.substring(i, j+1));
				}
			}
//			System.out.println(arr);
//			System.out.println(brr);
			boolean ans = false;
			int size = Integer.MIN_VALUE;
			for(int i = 0;i<arr.size();i++) {
				for(int j =0;j<brr.size();j++) {
					if(arr.get(i).compareTo(brr.get(j)) == 0) {
						if(arr.get(i).length() > size) {
							size = arr.get(i).length();
							ans = true;
						}
					}
				}
			}
//			System.out.println("ans : " + ans);
//			System.out.println("size : " + size);
			if(ans == true) {
				int res = (na - size) + (nb - size);
				System.out.println(res);
			} else {
				System.out.println((na + nb));
			}
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
