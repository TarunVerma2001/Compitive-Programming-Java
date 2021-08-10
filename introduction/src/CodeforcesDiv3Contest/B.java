package CodeforcesDiv3Contest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;


public class B {

	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc = new FastScanner();
		int t = sc.nextInt();
		for(;t>0;t--) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			String s = sc.next();
			char st[] = s.toCharArray();
			for(int i = 0;i<n;i++) {
				if(st[i] == '*') {
					st[i] = 'x';
					break;
				}
			}
			for(int i = n-1;i>=0;i--) {
				if(st[i] == '*') {
					st[i] = 'x';
					break;
				}
			}
			int x = -1;
			int dis = -1;
			for(int i =0;i<n;i++) {
				if(x != -1) {
					if(st[i] == 'x') {
						x = i;
					}
					if(st[i] == '*') {
						if(i - x > k) {
							st[dis] = 'x';
							x = dis;
							
						} else {
							dis = i;
							System.out.println("dis : " + dis);
						}
					}
				}
			}
			for(int i = 0;i<n;i++) {
				System.out.print(st[i] + " ");
			}
			System.out.println();
			String ans = new String();
			ans = st.toString();
			char temp[] = s.toCharArray();
			int res = 0;
			for(int i =0;i<n;i++) {
				if(temp[i] != st[i]) {
					res++;
				}
			}
			System.out.println(ans);
			System.out.println(res);
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
