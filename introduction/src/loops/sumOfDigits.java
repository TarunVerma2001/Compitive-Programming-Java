package loops;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a;
		a = sc.nextInt();
		int m;
		int sum = 0;
		for(int i=0;a>0;i++)
		{
			m=a%10;
			sum += m;
			a = a/10;
		}
		System.out.println(sum);
		
	}

}
