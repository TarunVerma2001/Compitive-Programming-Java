package googleKickStart;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;


public class B {
	
	
	static ArrayList<Integer> length = new ArrayList<Integer>();
	static ArrayList<Integer> bredth = new ArrayList<Integer>();
	
	
	
	public static int solve(int r, int c, int arr[][]) {
		boolean is = false;
		int result = 0;
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				if(arr[i][j] == 1){
					if(i-1 >= 0 && arr[i-1][j] == 1) {
						if(j-1 >= 0 && arr[i][j-1] == 1) {
							result++;
						}
						if(j+1 < c && arr[i][j+1] == 1) {
							result++;
						}
					}
					if(i+1 < r && arr[i+1][j] == 1) {
						if(j-1 >= 0 && arr[i][j-1] == 1) {
							result++;
						}
						if(j+1 < c  && arr[i][j+1] == 1) {
							result++;
						}
						
					}
					
				}
			}
		}
		
			
		return result;
		
	}
	
	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		FastScanner sc = new FastScanner();
		int t =sc.nextInt();
		for(int tt = 0;tt<t;tt++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			int arr[][] = new int [r][c];
			for(int i =0;i<r;i++) {
				for(int j =0;j<c;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int result = solve(r, c, arr);
			System.out.println("Case #" + (tt+1) + ": " + result);
			
			
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
