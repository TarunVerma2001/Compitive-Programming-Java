package arrays;

import java.util.*;

public class gcdOfTwoNumbers2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = gcd(a, b);
		System.out.println("GCD of " + a +" and " + b + " is " + result);
	}
	static int gcd(int a, int b) {
		int t;
		while(b != 0) {
			t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

}
