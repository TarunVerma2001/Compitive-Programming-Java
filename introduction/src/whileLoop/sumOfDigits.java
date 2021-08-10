package whileLoop;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a;
		a = sc.nextInt();
		int temp =a;
		int sum =0;
		
		while(temp>0) {
			int lastDigit=temp%10;
			sum += lastDigit;
			temp /= 10;
		}
		System.out.println("sum of digits of " + a + " is " + sum);
		
		int numberOfDigits = (int)Math.log10(a) + 1;
		System.out.println(a + " has " + numberOfDigits + " digits ");
	}

	
}
