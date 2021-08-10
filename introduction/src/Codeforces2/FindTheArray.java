package Codeforces2;
import java.util.*;
public class FindTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int t= sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			int sum = 0;
			for(int i =0;i<n;i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			
			
			int arr2[] = new int[n];
			for(int i =0;i<n;i++){
				arr2[i] = arr[i];
			}
			for(int i = 1;i<n;i++) {
				if((arr[i] - arr2[i]) > 0) {
					if(arr2[i-1] < arr2[i]) {
						arr2[i] = arr2[i-1];
					} else {
						arr2[i-1] = arr2[i];
					}
				} else {
					if(arr2[i-1] < arr2[i]) {
						arr2[i] = arr2[i-1];
					} else {
						arr2[i] = arr2[i-1]/2;
					}
				}
			}
			
			
//			Arrays.sort(arr);
//			int temp2 = arr[n / 2];
//			int temp = sum / 2;
//			temp /= n;
//			if(temp == 0) {
//				temp++;
//			}
//			int arr1[] = new int[n];
//			for(int i = 0;i<n;i++) {
//				arr1[i] = temp2;
//			}
//			for(int i = 0;i<n;i++) {
//				System.out.print(arr1[i] + " ");
//			}
//			System.out.println();
			
			
			
		}
		
	}

}
