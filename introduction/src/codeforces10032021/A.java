package codeforces10032021;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class A {

	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc = new FastScanner();
		int t = sc.nextInt();
		for(int tt = 0;tt<t;tt++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			String s = new String();
			s = sc.next();
			if(k == 0) {
				System.out.println("YES");
				continue;
			}
			char arr[] = s.toCharArray();
			for(int i = 0;i<n/2;i++) {
				char temp = arr[i];
				arr[i] = arr[n - i - 1];
				arr[n- i- 1] = temp;
			}
//			for(char a: arr) {
//				System.out.print(a + " ");
//			}
//			System.out.println();
			String s2 = arr.toString();
			int i = 0;
			int j = n-1;
			boolean isPalindrom = false;
			int palLen = 0;
			while(i < j-1) {
				if(s.charAt(i) == s.charAt(j)) {
					isPalindrom = true;
					palLen ++;
				} else {
					break;
				}
				i++;
				j--;
			}
//			System.out.println("plaLen : " + palLen);
			if(palLen >= k) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
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
