package a2ojLadders;

import java.util.Scanner;

public class Ashu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int tt  =0;tt<t;tt++) {
			int n= sc.nextInt();
			int k = sc.nextInt();
			boolean is = false;
			int temp;
			if((n & 1) == 0) {
				temp = n /2;
				temp--;
				if(k <= temp) {
					is = true;
				} else {
					is = false;
				}
			} else {
				temp = n / 2;
				if(k <= temp) {
					is = true;
				} else {
					is = false;
				}
			}
			if(is == false) {
				System.out.println(-1);
			} else {
				int x = n;
				int arr[] = new int[n];
				int j = 1;
				for(int i = 0;i<n;i++) {
					if((i & 1) == 0) {
						arr[i] = j;
						j++;
					} else {
						if(k != 0) {
							arr[i] = x;
							x--;
							k--;
						} else {
							arr[i] = j;
							j++;
						}
					}
				}
				for(int i = 0;i<n;i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}
		}

	}

}
