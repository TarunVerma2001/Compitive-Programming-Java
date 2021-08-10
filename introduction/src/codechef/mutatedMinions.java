package codechef;

import java.util.Scanner;

public class mutatedMinions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int initial[] = new int [n];
			for(int j=0;j<n;j++) {
				initial[j] = sc.nextInt();
			}
			for(int j=0;j<n;j++) {
				initial[j] = initial[j] + k;
			}
			int temp = 0;
			for(int j=0;j<n;j++) {
				if(initial[j] % 7 == 0) {
					temp++;
				}
			}
			System.out.println(temp);
			
		}
		
	}

}
