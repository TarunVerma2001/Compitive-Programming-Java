package codechefLunchTimeFeb;

import java.util.Scanner;

import codechefLunchTimeFeb.B.FastScanner;

public class A {
	
	public static void Solve(int [] arr, int n) {
		int count = 0;
		for(int i = 0;i<n-1;i++) {
			if(arr[i] < arr[i+1]) {
				count ++;
				break;
			}
		}
		if(count > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tt=0;tt<t;tt++) {
			int n = sc.nextInt();
			int A[] = new int[n];
			for(int i=0;i<n;i++) {
				A[i] = sc.nextInt();
			}
			Solve(A, n);
			
		}
		
	}
	

}
