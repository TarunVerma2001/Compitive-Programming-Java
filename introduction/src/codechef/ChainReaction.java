package codechef;

import java.util.Scanner;

public class ChainReaction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int o=0;o<t;o++) {
			int R = sc.nextInt();
			int C = sc.nextInt();
			int grid[][] = new int[R][C];
			for(int i=0;i<R;i++) {
				for(int j=0;j<C;j++) {
					grid[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0;i<R;i++) {
				for(int j=0;j<C;j++) {
					System.out.print(grid[i][j] + " ");//delete it
				}
				System.out.println();
			}
			int count=0;
			int count2=0;
			for(int i=0;i<R;i++) {
				for(int j=0;j<C;j++) {
					if(i == 0 && j == 0) {
						if(grid[i][j] < 2) {
							count++;
						}
					}
					if(i == 0 && j != 0) {
						if(grid[i][j] < 2) {
							count++;
						}
					}
					if()
					
				}
				if(count2 == 0) {
					System.out.println("Stable");
				}
				else {
					System.out.println("Unstable");
				}
			}
			
			
			
			
		}
		
		
	}

}
