package codechef;

import java.util.Scanner;

public class CouponSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = sc.nextInt();
		int c[] = new int [n];
		int l[] = new int [n];
		int x[] = new int [n];
		
		for(int i=0;i<n;i++) {
			c[i] = sc.nextInt();
			l[i] = sc.nextInt();
			x[i] = sc.nextInt();
		}
		int temp1 =0, temp2 = 100,temp3;
		for(int i=0;i<n;i++) {
			if(l[i] == 1) {
				 if(temp1 < x[i]){
					 if(temp2 > c[i]) {
						 temp1 = x[i];
						 temp3 = i;
					}
				}
			}
		}
		System.out.println(x[temp3] + " " + c[temp3]);
		temp1 =0;
		temp2 = 100;
		temp3;
		for(int i=0;i<n;i++) {
			if(l[i] == 1) {			 if(temp1 < x[i]){
					 if(temp2 > c[i]) {
						 temp1 = x[i];
						 temp3 = i;
					}
				}
			}
		}
		System.out.println(x[temp3] + " " + c[temp3]);
		
		
	}

}
