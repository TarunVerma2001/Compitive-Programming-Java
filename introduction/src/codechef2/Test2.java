package codechef2;

import java.util.Scanner;

public class Test2 {

	public static void Solve(int n, int k) {
		System.out.println(k/n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			Solve(n, k);
		}
	}
	
}
