package codechef;

import java.util.Scanner;

public class adaKing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j=0;j<t;j++) {
			int k = sc.nextInt();
			int cols = k/8;
			char chess[][] = new char [8][8];
			int remaining = k%8;
			for(int i=0;i<8;i++) {
				for(int o=0;o<8;o++) {
					chess[i][o] = '.';
				}
			}
			chess[0][0] = 'O';
			
			for(int i=0;i<8;i++) {
				for(int o=7;o>cols;o--) {
					chess[i][o] = 'X';
				}
			}
			for(int i=7;i>=remaining;i--) {
				for(int o=cols;o>=cols;o--) {
					chess[i][o] = 'X';
				}
			}
			
			for(int i=0;i<8;i++) {
				for(int o=0;o<8;o++) {
					System.out.print(chess[i][o]);		//delete it after completion
				}
				System.out.println();
			}
			
			
			
		}
		
	}

}
