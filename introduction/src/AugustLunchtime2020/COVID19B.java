package AugustLunchtime2020;

import java.util.*;

public class COVID19B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			int n = sc.nextInt();
			int vel[] = new int[n];
			int pos[] = new int[n];
			for(int i=0;i<n;i++) {
				vel[i] = sc.nextInt();
				pos[i] = i+1;
			}
			int res[] = new int[n];
			for(int i=0;i<n;i++) {
				res[i] = 1;
			}
			for(int i=0;i<n;i++) {
//				System.out.println("i : " + i);
				for(int j = 0;j<n;j++) {
//					System.out.println("j :" + j);
					if(j == i) {
//						System.out.println("in if");
						continue;
					} else {
//						System.out.println("in else");
						if(i < j) {
//							System.out.println("in inner if");
							if(vel[i] > vel[j]) {
//								System.out.println("in inner inner if");
								res[i]++;
//								System.out.println("res[" + i + "] :" + res[i]);
							}
						}else if(i > j) {
//								System.out.println("in inner else");
								if(vel[i] < vel[j]) {
//									System.out.println("in inner if2");
									res[i]++;
								}
							}
						}
				}
			}
			Arrays.sort(res);
//			for(int i=0;i<n;i++) {
//				System.out.print(res[i] + " ");
//			}
//			System.out.println();
			System.out.println(res[0] + " " + res[n-1]);
			
			t--;
	    }
		
		

    }
	
	
}
