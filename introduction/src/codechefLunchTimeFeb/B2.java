package codechefLunchTimeFeb;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.StringTokenizer;

public class B2 {

	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc = new FastScanner();
		int t = sc.nextInt();
		for(int tt=0;tt<t;tt++) {
			String s = sc.next();
			char[] ch = s.toCharArray();
			int n = ch.length;
			Arrays.sort(ch);
			if(n == 1) {
				System.out.println("NO");
				continue;
			}
			int even = 0;
			int single = 0;
			char te = ch[0];
			int count = 1;
			
			for(int i = 1;i<n;i++) {
				if(ch[i] == te) {
					count ++;
				} else {
					if((count % 2) == 0) {
						if(count == 2) {
							even ++;
						} else {
							even += (count / 2);
						}
					} else {
						if(count == 1) {
							single ++;
						}
						if(count > 3) {
							even += ((count - 3) / 2);
						}
					}
					count = 1;
					te = ch[i];
				}
			}
			if((count % 2) == 0) {
				if(count == 2) {
					even ++;
				} else {
					even += (count / 2);
				}
			} else {
				if(count == 1) {
					single ++;
				}
				if(count > 3) {
					even += ((count - 3) / 2);
				}
			}
//			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//			char temp = ch[0];
//			map.put(temp, 1);
//			for(int i =1;i<n;i++) {
//				if(ch[i] == temp) {
//					int te = map.get(temp);
//					te ++;
//					map.put(temp, te);
//				} else {
//					temp = ch[i];
//					map.put(temp, 1);
//				}
//			}
//			int even = 0;
//			int single = 0;
//			for(Map.Entry<Character, Integer> en: map.entrySet()) {
//				if(en.getValue() == 1) {
//					single++;
//				}
//				if(en.getValue() != 1 && (en.getValue() & 1) == 0) {
//					even ++;
//				}
//			}
			if(single != 0) {
				if(even >= single) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("YES");
			}
			System.out.println("Single : " + single);
			System.out.println("EVEn : " + even);
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
