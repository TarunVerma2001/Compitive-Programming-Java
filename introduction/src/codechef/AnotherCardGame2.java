package codechef;

import java.util.Scanner;

public class AnotherCardGame2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			
			int pc = sc.nextInt();
			int pr = sc.nextInt();
			int temp1 = pc, temp2 = pr, digit1 = 0, digit2 = 0;
			if(temp1 < 10) {
				digit1++;
			}
			if(temp2 < 10) {
				digit2++;
			}
			if(temp > 9) {
				digit1 = temp1 / 9;
				temp1 = temp1 % 9;
			}
			if(temp2 < 10) {
				digit2++;
			} else {
				digit2 = temp2 / 9;
				temp2 = temp2 % 9;
			}
			if(temp1 < 10 && temp1 > 0) {
				digit1++;
			}
			if(temp2 < 10 && temp2 >0) {
				digit2++;
			}
			if(temp2 < 10) {
				digit2++;
			}
			
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
