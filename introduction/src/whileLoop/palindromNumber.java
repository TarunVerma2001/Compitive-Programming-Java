package whileLoop;

import java.util.Scanner;

public class palindromNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int a = sc.nextInt();
			
			int temp = a;
			int m;
			int reversedNumber=0;
			while(temp > 0)
			{
				m = temp%10;
				reversedNumber=reversedNumber * 10 + m;
				temp /= 10;
				
			}
			if(reversedNumber == a) {
				System.out.println(a + " is a palindrome number");
			} else {
				System.out.println(a + " is a not palindrome number");
			}
		}
	}

}
