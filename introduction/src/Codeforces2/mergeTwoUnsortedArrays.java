package Codeforces2;

import java.util.*;
public class mergeTwoUnsortedArrays {

	public static void merge(int a[], int b[]) {
		int SizeA = a.length;
		int SizeB = b.length;
		
		int i = 0;
		int j = 0;
		int k = 0;
		int arr[] = new int[SizeA + SizeB];
		while (i < SizeA && j < SizeB) {
			if(a[i] > b[j]) {
				arr[k] = a[i];
				i++;
				k++;
			} else {
				arr[k] = b[j];
				j++;
				k++;
			}
		}
		for(;i < SizeA;i++) {
			arr[k] = a[i];
			k++;
		}
		for(;j < SizeB;j++) {
			arr[k] = b[j];
			k++;
		}
		for(int temp: arr) {
			System.out.print(temp + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int [n];
		int b[] = new int [m];
		for(int i = 0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0;i<m;i++) {
			b[i] = sc.nextInt();
		}
		merge(a, b);
	}
	
}
