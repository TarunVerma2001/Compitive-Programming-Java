package codechef;

import java.util.Scanner;

public class AnotherCardGameProblem {
	
	public static int countDigit(int a) {
		int digit = 0;
		for(int i=0;i < 1; i++) {
			if(a > 9) {
				digit = (a / 9);
				a = a % 9;
				if(a < 10 && a > 0) {
					digit++;
				}
			} else {
				digit++;
			}
		}
		return digit;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			
			int pc = sc.nextInt();
			int pr = sc.nextInt();
			 
			int temp1 = pc, temp2 = pr;
			int digit1 = countDigit(temp1);
			int digit2 = countDigit(temp2);
			if(digit1 < digit2) {					
				System.out.println("0 " + digit1);
			} else if(digit1 > digit2) {
				System.out.println("1 " + digit2);
			} else {
				System.out.println("1 " + digit1);
			}
			t -= 1;
		}

	}

}
