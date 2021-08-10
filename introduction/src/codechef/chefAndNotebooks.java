package codechef;

import java.util.Scanner;

public class chefAndNotebooks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int x, y, k, n;
			x = sc.nextInt();
			y = sc.nextInt();
			k = sc.nextInt();
			n = sc.nextInt();
			int p[] = new int [n];
			int c[] = new int [n];
			for(int i=0;i<n;i++) {
				p[i] = sc.nextInt();
				c[i] = sc.nextInt();
			}
			boolean result = false;
			int temp = x - y;
			for(int i=0;i<n;i++) {
				if(p[i] >= temp && c[i] <= k) {
					result = true;
					break;
				}
				else {
					result = false;
				}
			}
			if(result == true) {
				System.out.println("LuckyChef");
			} else {
				System.out.println("UnluckyChef");
			}
		}
	}

}
