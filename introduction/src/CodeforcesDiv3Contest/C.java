package CodeforcesDiv3Contest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.StringTokenizer;

public class C {

	public static void Solve(int c0, int c1, int c2, int res) {
		int ans = 0;
		if(c0 < res) {
			int temp1 = res - c0;
			if(c1 > res) {
				int temp = c1 - res;
				if(temp1 > temp) {
					ans += (2 * (temp));
					ans += (temp1 - temp);
					System.out.println(ans);
					return;
				} else if(temp1 < temp){
					ans += (2 * temp1);
					ans += (temp - temp1);
					System.out.println(ans);
					return;
				} else {
					ans += (2 * temp);
					System.out.println(ans);
					return;
				}
			}
			if(c2 > res) {
				int temp = c2 - res;
				if(temp1 > temp) {
					ans += temp;
					ans += (2 * (temp1 - temp));
					System.out.println(ans);
					return;
				} else if(temp1 < temp) {
					ans += temp1;
					ans += (2 * (temp - temp1));
					System.out.println(ans);
					return;
				} else {
					ans += temp;
					System.out.println(ans);
					return;
				}
			}
		}
		if(c1 < res) {
			int temp1 = res - c1;
			if(c0 > res) {
				int temp = c0 - res;
				if(temp1 > temp) {
					ans += (temp);
					ans += (2 * (temp1 - temp));
					System.out.println(ans);
					return;
				} else if(temp1 < temp) {
					ans += (temp1);
					ans += (2 * (temp - temp1));
					System.out.println(ans);
					return;
				} else {
					ans += temp;
					System.out.println(ans);
					return;
				}
			}
			if(c2 > res) {
				int temp = c2 - res;
				if(temp1 > temp) {
					ans += (2 * temp);
					ans += ((temp1 - temp));
					System.out.println(ans);
					return;
				} else if(temp1 < temp) {
					ans += (2 * temp1);
					ans += ((temp - temp1));
					System.out.println(ans);
					return;
				} else {
					ans += (2 * temp);
					System.out.println(ans);
					return;
				}
			}
		}
		if(c2 < res) {
			int temp1 = res - c2;
			if(c0 > res) {
				int temp = c0 - res;
				if(temp > temp1) {
					ans += (2 * temp1);
					ans += (temp - temp1);
					System.out.println(ans);
					return;
				} else if(temp < temp1){
					ans += (2 * temp);
					ans += (temp1 - temp);
					System.out.println(ans);
					return;
				} else {
					ans += (2 * temp);
					System.out.println(ans);
					return;
				}
			}
			if(c1 > res) {
				int temp = c1 - res;
				if(temp > temp1) {
					ans += temp1;
					ans += (2 * temp - temp1);
					System.out.println(ans);
					return;
				} else if(temp1 > temp) {
					ans += temp;
					ans += (2 * temp1 - temp);
					System.out.println(ans);
					return;
				} else {
					ans += temp;
					System.out.println(ans);
					return;
				}
			}
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc = new FastScanner();
		int t = sc.nextInt();
		for(int tt =0;tt<t;tt++) {
			int n = sc.nextInt();
			int arr[] = sc.readArray(n);
			int c0 = 0, c1 = 0, c2 = 0;
			int res = n/3;
			for(int x: arr) {
				if(x % 3 ==0) {
					c0++;
				} else if(x % 3 ==1){
					c1++;
				} else{
					c2++;
				}
			}
			
			if(c1 == c2 && c0 == c1) {
				System.out.println(0);
				continue;
			}
			Solve(c0, c1, c2, res);
			
			
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
