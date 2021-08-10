package codechef;

import java.util.Scanner;

public class MissingApoint2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int n = sc.nextInt();
			int m= 4 * n - 1;
			int input[][] = new int [m][2];
			for(int i=0;i<m;i++) {
				input[i][0] = sc.nextInt();
				input[i][1] = sc.nextInt();
			}
			int count = 0;
			for(int i=0;i<m;i++) {
				for(int j=0;j<m;j++) {
					if(input[i][0] == input[j][0]) {
						int temp = input[i][0];
						int diffIny = 
					}
				}
			}
			
		}
		
	}

}
