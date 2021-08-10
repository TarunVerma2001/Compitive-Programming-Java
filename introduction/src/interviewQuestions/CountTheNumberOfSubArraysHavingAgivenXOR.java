package interviewQuestions;

import  java.util.*;

public class CountTheNumberOfSubArraysHavingAgivenXOR {
	
	public static int Count(int arr[], int n, int m) {
		int ans = 0;
		
		for(int i =0;i<n;i++) {
			int ansTemp = 0;
			for(int j = i;j<n;j++) {
				ansTemp = ansTemp ^ arr[j];
				
				if(ansTemp == m) {
					ans++;
				}
			}
		}
		
		
		
		
		return ans;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Sixe of the Arrays : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Required XOR : ");
		int m = sc.nextInt();
		System.out.println("number of subarrays having " + m + " XOR : " + Count(arr, n, m));
		
		
	}

}
