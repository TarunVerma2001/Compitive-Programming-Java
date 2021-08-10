package codechef;

import java.util.Scanner;

public class mahasena {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int gun[] = new int[n];
		int lucky = 0;
		int unlucky = 0;
		for(int j=0;j<n;j++) {
			gun[j] = sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			if(gun[j] % 2 == 0) {
				lucky++;
			} else {
				unlucky++;
			}
		}
		if(lucky > unlucky) {
			System.out.println("READY FOR BATTLE");
		} else {
			System.out.println("NOT READY");
		}
		
	}

}
