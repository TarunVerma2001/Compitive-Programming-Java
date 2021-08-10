package googleCodeJam2021;
import java.io.BufferedReader ;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;


public class reversortEngineering {
	
	static ArrayList<String> res = new ArrayList<String>();
	public static int cost(String s, int n) {
		int cost = 0;
		for(int i = 0;i<n-1;i++) {
			int min = Integer.MAX_VALUE;
			int j = i;
			for(int k = i;k<n;k++) {
				if((s.charAt(k)-'0') < min) {
					min =(s.charAt(k)-'0');
					j = k;
				}
			}
			cost += (j - i + 1);
			int k = i;
			while(k <= j && k < n && j >= 0) {
//				int temp = arr[k];
//				arr[k] = arr[j];
//				arr[j] = temp;
				char[] charArray = s.toCharArray();
				char temp = charArray[k] ;
		        charArray[k] = charArray[j];
		        charArray[j] = temp;
		        s = String.valueOf(charArray);
				k++;
				j--;
			}
			
		}
		return cost;
	}
	
	public static void permute(String str, int l, int r)
    {
        if (l == r) {
            res.add(str);
            return;
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
 

    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc = new FastScanner();
		int t = sc.nextInt();
		for(int tt = 0;tt<t;tt++) {
			res.clear();
			int n = sc.nextInt();
			int c = sc.nextInt();
			String s = new String();
			s = "";
			for(int i  =0;i<n;i++) {
				s += Integer.toString(i+1);
			}
//			System.out.println(s);
			permute(s, 0, n-1);
			boolean is = false;
			int i = 0;
			for(;i<res.size();i++) {
				int cost = cost(res.get(i), n);
				if(cost == c) {
					is = true;
					break;
				}
			}
			if(!is) {
				System.out.println("Case #" + (tt+1) + ": IMPOSSIBLE");
			} else{
				System.out.print("Case #" + (tt+1) + ": ");
				for(int j = 0;j<n;j++) {
					System.out.print(res.get(i).charAt(j) + " ");
				}
				System.out.println();
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
