package codeforces;

import java.util.Scanner;

public class test {

	
	public static int isPrime(int n) {
		for(int i = 2;i<(1 << n);i++) {
			if(n % i == 0)
				return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(;t>0;t--) {
			int d = sc.nextInt();
			int copy = d + 1;
			if(isPrime(copy) == 0)
				copy++;
			int copy2 = copy+1;
			if(isPrime(copy2) == 0)
				copy2++;
			System.out.println((copy * copy2));
		}
	}

}
