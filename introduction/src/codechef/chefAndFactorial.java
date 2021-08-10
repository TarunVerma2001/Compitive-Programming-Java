package codechef;

import java.util.Scanner;

public class chefAndFactorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			long n = sc.nextInt();
			long result = factorial(n);
			System.out.println(result);
		}
		
		
	}
	static long factorial(long n) {
		long a=1;
		for(long i=0;n>0;i++) {
			a = a * n;
			n = n - 1;
		}
		return a;
	}

}
