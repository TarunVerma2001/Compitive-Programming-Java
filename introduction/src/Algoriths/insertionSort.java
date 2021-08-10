package Algoriths;
import java.util.*;
public class insertionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
			
		}
		for(int i = 1;i<n;i++) {
			int Current = arr[i];
			int j = i - 1;
			while(j>= 0 && arr[j]>Current) {
				System.out.println("j+1 : " + (j+1));
				System.out.println("j : " + j);
				arr[j+1] = arr[j];
				j--;
				System.out.println("j :   " + j);
			}
			arr[j+1] = Current;
		}
		for(int i =0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
