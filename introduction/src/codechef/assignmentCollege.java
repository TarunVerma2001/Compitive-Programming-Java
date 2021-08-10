package codechef;

import java.util.Scanner;

public class assignmentCollege {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int [k];
		for(int i=0;i<k;i++) {
			a[i] = sc.nextInt();
		}
		int max = 0;
		int temp = 0;
		for(int i=0;i <= k-m;i++) {
			temp = 0;
			for(int j=i;j<m+i;j++) {
				temp = temp + a[j];
			}
			if(temp >= max) {
				max = temp;
			}
		}
		System.out.println(max);
	}

}
