package codeforces;

import java.util.Scanner;

public class CLetters2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] a = new long[(int)n];
		for(int i = 0;i<n;i++) {
			a[i] = sc.nextLong();
			
		}
		long sum = 0;
		int res = 1;
		for(int i =0;i<m;i++) {
			long x = sc.nextLong();
			while(sum + a[res-1] < x) {
				sum += a[res - 1];
				res ++;
			}
			System.out.print(res + " ");
			System.out.println(x - sum);
		}
		
		
	}

}
