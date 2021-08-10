package GraphsStriver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.StringTokenizer;

public class BFS {

	
	//THIS IS FOR UNDIRECTED GRAPH
	
	public static void main (String[] args) throws java.lang.Exception
	{
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();	//no. of nodes
		int m = sc.nextInt();	//no. of edges
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		for(int i = 0;i<=n;i++) {
			arr.add(new ArrayList<Integer>());
		}
		for(int i = 0;i<m;i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			arr.get(u).add(v);
			arr.get(v).add(u);
		}
		
		// BFS Code
		// BFS Code
		
		
		Queue<Integer> q = new LinkedList<Integer>();
		boolean visited[] = new boolean[n+1];
		for(int i = 0;i<=n;i++) 
			visited[i] = false;
		q.add(3);
		visited[3] = true;
		while(!q.isEmpty()) {
			int node = q.peek();
			q.remove();
			System.out.print(node + " ");
			for(int x: arr.get(node)) {
//				System.out.println("x: " + x);
				if(!visited[x]) {
					visited[x] = true;
					q.add(x);
				}
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
