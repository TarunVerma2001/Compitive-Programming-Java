package codechef;

import java.util.Scanner;

public class PrimalityTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int j = 0;j < t;j++) {
			int n = sc.nextInt();
			boolean result = prime(n);
			if(result == true) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
			
	}
	public static boolean prime(int n) {
		boolean isPrime = true;
		for(int i=2; i * i<=n;i++)
		{
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}
		if(n<2)
		{
			isPrime=false;
		}
		return isPrime;
	}

}
