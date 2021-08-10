package codechef;

import java.util.Scanner;

public class farmerAndHisPlot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {	
			int l = sc.nextInt();
			int b = sc.nextInt();
			int temp = gcd(l, b);
			int all = l * b;
			int temp1 = temp * temp;
			int result = all / temp1;
			System.out.println(result);
		}
	}
	public static int gcd(int a, int b) {
		int t;
		while(b != 0) {
			t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

}
