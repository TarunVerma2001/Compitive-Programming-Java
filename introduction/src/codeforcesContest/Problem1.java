package codeforcesContest;

import java.util.*;

public class Problem1 {

	public static void solve(long n, long m, long x) {
		long col;
		if(x % n == 0) {
			col = x / n;
		} else {
			col = x / n + 1;
		}
		long row;
		if(x % n == 0) {
			row = n;
		} else {
			row = x % n;
		}
		
		if(row == 1 && col == 1) {
			System.out.println(x);
		} else {
			long ans =( m * row) - (m - col); 
			System.out.println(ans);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		
		for(;t>0;t--) {
			long n = sc.nextLong();
			long m = sc.nextLong();
			long x = sc.nextLong();
			solve(n, m, x);
		}
		
		
		
	}

}
