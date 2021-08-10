package codeforces;

import java.util.Scanner;

public class Books {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long t = sc.nextInt();
		int Sum = 0;
		int a[] = new int[n];
		for(int i =0;i<n;i++) {
			a[i] = sc.nextInt();
			Sum += a[i];
		}
		
		int i = 0;
		int j = n-1;
		int Sum2 = Sum;
		while(Sum2 > t && i <= j) {
			int p = Sum2 - a[i];
			int q = Sum2 - a[j];
			if(a[i] > a[j]) {
				Sum2 = p;
//				System.out.println("Sum2 : " + Sum2);
				i++;
//				System.out.println("i : " + i);
				if(Sum2 <= t) {
					break;
				}
			} else {
				Sum2 = q;
//				System.out.println("Sum2 : " + Sum2);
				j--;
//				System.out.println("j : " + j);
				if(Sum2 <= t) {
					break;
				}
			}
		}
		System.out.println((j - i + 1));
		
	}

}
