package codeforcesContestmarch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Random;
import java.util.Stack;
import java.util.StringTokenizer;




public class B {

	public static boolean isComplete(char arr[], int n) {
		Stack<Character> st = new Stack<Character>();
		for(int i = 0;i<n;i++) {
			if(arr[i] == '(') {
				st.push('(');
			} else {
				if(!st.isEmpty()) {
					st.pop();
				} else {
					return false;
				}
			}
		}
		if(st.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		FastScanner sc = new FastScanner();
		int t = sc.nextInt();
		for(int tt = 0;tt<t;tt++) {
			String a = sc.next();
			int n = a.length();
			if(n == 2) {
				if(a.charAt(0) == a.charAt(1)) {
//					System.out.println(1);
					System.out.println("NO");
					continue;
				} else {
//					System.out.println(2);
					System.out.println("YES");
					continue;
				}
			}
			if(n != 1 && (a.charAt(0) == a.charAt(n-1))) {
//				System.out.println(3);
				System.out.println("NO");
				continue;
			}
			boolean result = false;
			char arr[] = a.toCharArray();
			if(a.charAt(0) == 'A') {
				for(int i = 0;i<n;i++) {
					if(arr[i] == 'A') {
						arr[i] = '(';
					}
				}
			} else if(a.charAt(0) == 'B') {
				for(int i = 0;i<n;i++) {
					if(arr[i] == 'B') {
						arr[i] = '(';
					}
				}
			} else if(a.charAt(0) == 'C') {
				for(int i = 0;i<n;i++) {
					if(arr[i] == 'C') {
						arr[i] = '(';
					}
				}
			}
			
			if(a.charAt(n-1) == 'A') {
				for(int i = 0;i<n;i++) {
					if(arr[i] == 'A') {
						arr[i] = ')';
					}
				}
			} else if(a.charAt(n-1) == 'B') {
				for(int i = 0;i<n;i++) {
					if(arr[i] == 'B') {
						arr[i] = ')';
					}
				}
			} else if(a.charAt(n-1) == 'C') {
				for(int i = 0;i<n;i++) {
					if(arr[i] == 'C') {
						arr[i] = ')';
					}
				}
			}
			ArrayList<Integer> arrr = new ArrayList<Integer>();
			
			for(int i = 0;i<n;i++) {
				
				if(arr[i] != '(' && arr[i] != ')') {
					arrr.add(i);
					arr[i] = '(';
				}
//				System.out.print(arr[i] +" ");
			}
//			System.out.println();
			if(isComplete(arr, n)) {
//				System.out.println(4);
				System.out.println("YES");
				continue;
			}
//			System.out.println();
			for(int x: arrr) {
				arr[x] = ')';
				
			}
//				System.out.print(arr[i] + " ");
			
//			System.out.println();
			if(isComplete(arr, n)) {
//				System.out.println(5);
				System.out.println("YES");
				continue;
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
