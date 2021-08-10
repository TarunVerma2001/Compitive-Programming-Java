package someImpQuestions;

import java.util.*;


public class findTripletWithZeroSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);	//sort the array
		for(int i=0; i<n-2;i++) { // as n-1 and n place is occupied by j and k
			if(twoSum(arr, -arr[i], i+1)) {

				System.out.println("true");
			} else {
				System.out.println("false");
			}
			
			
		}

		
	}
	public static boolean twoSum(int a[], int x, int i) { // create a two sum classs
		int j = a.length -1;
		while(i<j) {
			if(a[i] + a[j] > x) {
				j--;
			} else if(a[i] + a[j] < x){
				
				i++;
			} else {
				return true;
			}
		}
		return false;
	}

}
