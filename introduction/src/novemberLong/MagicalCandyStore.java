package novemberLong;

import java.util.*;

public class MagicalCandyStore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i =0;i<n;i++) 
				a[i] = sc.nextInt();
			int q = sc.nextInt();
//			int[] r = sc.hasNext();
			int candy = 0;
			int j = 0;
			int round = 1;
			for(int i =0;i<q;i++) {
				int r = sc.nextInt();
				for(;j>=0;j++) {
					System.out.println("j : " + j);
					round ++;
					System.out.println("round : " + round);
					if((round -1) % n != 0) {
						System.out.println("a");
						if(a[j] % 2 == 0) {
							candy += a[j];
							System.out.println("b");
							System.out.println(candy);
						} else {
							System.out.println("c");
							candy += a[j] - 1;
							System.out.println(candy);
						}
					} else {
						if(a[j] % 2 != 0) {
							candy += a[j];
							System.out.println("d");
							System.out.println(candy);
						} else {
							candy += a[j] - 1;
							System.out.println("e");
							System.out.println(candy);
						}
					}
					if(j >= n) {
						j = 0;
					}
					if(round - 1 == r) {
						j++;
						if(j >= n) {
							j = 0;
						}
						break;
					}
					
				}
				System.out.println(candy);
			}
		}

	}

}
