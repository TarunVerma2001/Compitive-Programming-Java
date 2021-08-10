package GraphsStriver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

public class EulerTourOfATree {

	static List<Integer> adj[];
	static ArrayList<Integer> eulerTour = new ArrayList<Integer>();
	
	public static void eulerT(int node, boolean visited[]) {
		visited[node] = true;
		List<Integer> l = adj[node];
		for(Integer x: l) {
			if(!visited[x]) {
				eulerTour.add(x);
				eulerT(x, visited);
//				eulerTour.add(x);
			}
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int m = sc.nextInt();
		adj = new List[n + 1];
		for(int i = 0;i<=n;i++) {
			adj[i] = new ArrayList<Integer>();
		}
		for(int i = 0;i<m;i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			adj[u].add(v);
			adj[v].add(u);
		}
		boolean visited[] = new boolean[n+1];
		Arrays.fill(visited, false);
		eulerT(1, visited);
		System.out.println(eulerTour);
		
		
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
