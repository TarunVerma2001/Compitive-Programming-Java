package Algoriths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class QuickSort {
	
//	public static void swap(int arr[], int i, int j) {
//		int temp = arr[i];
//		arr[i] = arr[j];
//		arr[j] = temp;
//	}
//
//	public static void quickSort(int arr[], int l, int r) {
//		
//		if(l < r) {
//			int pi = partition(arr, l, r);
//			
//			quickSort(arr, l, pi-1);
//			quickSort(arr, pi+1, r);
//		}
//		
//	}
//	
//	public static int partition(int arr[], int l, int r) {
//		int pivot = arr[r];
//		System.out.println("pivot : " + pivot);
//		int i = l - 1;
//		
//		for(int j = l;j<r;j++) {
//			if(arr[j] < pivot) {
//				i++;
//				swap(arr, i, j);
//			}
//		}
//		swap(arr, i+1, r);
//		return i+1;
//	}
	public static void quickSort(int arr[], int l, int r) {
		
		if(l < r) {
			int pi = partition(arr, l, r);
			
			quickSort(arr, l, pi-1);
			quickSort(arr, pi+1, r);
		}
		
	}
	public static void swap(int arr[], int i , int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	public static int partition(int arr[], int l, int r) {
		int pivot = arr[r];
		int i = l - 1;
		
		for(int j = l;j<r;j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, r);
		return i+1;
	}
	
	public static void main(String [] args) {
		int arr[] = {4, 3, 2, 7, 10, 8, 13, 11, 12};
		int l = 0;
		int r = 8;
		quickSort(arr, l, r);
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.print("/n");
	}
	static long gcd(long a, long b) {
		if (b==0) return a;
		return gcd(b, a%b);
	}
 
	static void ruffleSort(long[] a) {
		int n=a.length;
		Random r=new Random();
		for (int i=0; i<a.length; i++) {
			int oi=r.nextInt(n); long temp=a[i];
			a[i]=a[oi];
			a[oi]=temp;
		}
		Arrays.sort(a);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
