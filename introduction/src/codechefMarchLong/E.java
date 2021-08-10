package codechefMarchLong;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class E {
	
	public static boolean isEqual(int a[][], int b[][], int r, int c) {
		boolean isEq = true;
		outer: for(int i =0;i<r;i++) {
			for(int j = 0;j<c;j++) {
//				System.out.println("a[i][j] != b[i][j] : " + (a[i][j] != b[i][j]));
				if(a[i][j] != b[i][j]) {
					isEq = false;
					break outer;
				}
				
			}
		}
		return isEq;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		FastScanner sc = new FastScanner();
		int t= sc.nextInt();
		for(int tt = 0;tt< t;tt++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			int x = sc.nextInt();
			
			int a[][] = new int[r][c];
			int b[][] = new int[r][c];

			
			for(int i =0;i<r;i++) {
				for(int j = 0;j<c;j++) {
					a[i][j] = sc.nextInt();
				}
			}
			for(int i =0;i<r;i++) {
				for(int j = 0;j<c;j++) {
					b[i][j] = sc.nextInt();
				}
			}
			
			
			if(x > r && x > c) {
				boolean isEq = isEqual(a, b, r, c);
				if(isEq == true) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else if(x > r && x <= c) {
				for(int i = 0;i<r;i++) {
					for(int j = 0;j<c;j++) {
						if((j + x) <= c) {
							if(a[i][j] != b[i][j]) {
								int diff = b[i][j] - a[i][j];
								for(int k = 0;k<x;k++) {
									a[i][j+k] += diff;
								}
							}
						}
					}
				}
				boolean isEq = isEqual(a, b, r, c);
				if(isEq == true) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else if(x <= r && x > c) {
				for(int i = 0;i<c;i++) {
					for(int j = 0;j<r;j++) {
						if((j + x) <= r) {
							if(a[j][i] != b[j][i]) {
								int diff = b[j][i] - a[j][i];
								for(int k = 0;k<x;k++) {
									a[j+k][i] += diff;
								}
							}
						}
					}
				}
				boolean isEq = isEqual(a, b, r, c);
				if(isEq == true) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else if(x <= r && x <= c) {
				for(int i = 0;i<r;i++) {
					for(int j = 0;j<c;j++) {
						if((j + x) <= c) {
							if(a[i][j] != b[i][j]) {
								int diff = b[i][j] - a[i][j];
								for(int k = 0;k<x;k++) {
									a[i][j+k] += diff;
								}
							}
						}
					}
				}
				
				for(int i = 0;i<c;i++) {
					for(int j = 0;j<r;j++) {
						if((j + x) <= r) {
							if(a[j][i] != b[j][i]) {
								int diff = b[j][i] - a[j][i];
								for(int k = 0;k<x;k++) {
									a[j+k][i] += diff;
								}
							}
						}
					}
				}
				
				boolean isEq = isEqual(a, b, r, c);
				if(isEq == true) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
			
		}
		
		
	}
	static long gcd(long a, long b) {
		if (b==0) return a;
		return gcd(b, a%b);
	}
 
	static void ruffleSort(int[] a) {
		int n=a.length;
		Random r=new Random();
		for (int i=0; i<a.length; i++) {
			int oi=r.nextInt(n); long temp=a[i];
			a[i]=a[oi];
			a[oi]=(int) temp;
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
