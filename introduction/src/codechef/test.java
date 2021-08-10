package codechef;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j=0;j<t;j++) {
			int n = sc.nextInt();
			int temp = n;
			int sum = 0;
			for(int i=0;temp>0;i++) {
				int m = temp%10;
				sum += m;
				temp /= 10;
			}
			System.out.println(sum);
		}
	}

}
