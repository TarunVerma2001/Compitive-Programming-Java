package codechef2;

import java.util.*;


public class everyOneIsWinner {
	
	public static void solve(int n) {
		TreeSet<Integer> a = new TreeSet<Integer>();
		for(int i = 1;i <= n;i++) {
			a.add(n/i);
		}
		a.add(0);
		System.out.println(a.size());
		Iterator<Integer> i = a.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t= sc.nextInt();
		for(;t>0;t--) {
			
			int n = sc.nextInt();
			solve(n);
		}
		

	}
}
