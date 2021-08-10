package Algoriths;
import java.util.*;
public class KadanesMaximumSubArraySum {

	
	public static int Solve(int arr[], int n) {
		int sum = 0;
		int maxi = arr[0];
		for(int i = 0;i<n;i++) {
			sum += arr[i];
			maxi = Math.max(maxi, sum);
			if(sum <= 0)
				sum = 0;
		}
		return maxi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(Solve(arr, 8));
		
	}

}
