package CollegeAssignment;

import java.util.Scanner;

public class PalindromicNumber {
	
	public static void ispalindrome(int n) {
		
		int temp = 0;
		int n2 = n;
		while(n != 0) {
			int temp2 = n % 10;
			n /= 10;
			temp = temp * 10 + temp2;
		}
//		System.out.println(temp);
		if(temp == n2) {
			System.out.println("is a Palindrom");
		} else {
			System.out.println("not a Palindrom");
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number : ");
		int n = sc.nextInt();
		ispalindrome(n);
	}

}
