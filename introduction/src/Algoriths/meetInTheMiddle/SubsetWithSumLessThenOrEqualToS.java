package Algoriths.meetInTheMiddle;

import java.util.Arrays;

public class SubsetWithSumLessThenOrEqualToS {

	
	static long x[] = new long[2000005];
	static long y[] = new long[2000005];
	public static int Search(long arr[],int l, int r, long x, long S) {
		
		x = S - x;
		if(l <= r) {
			int mid = l + (r - l) / 2;
//			System.out.println(mid);
			
			if(arr[mid] >= x) {
//				System.out.println("yo");
				return mid;
			}
//			System.out.println("that");
			if(arr[mid] > x) {
				return Search(arr ,l, mid-1, x, S);
			}
//			System.out.println("this");
			return Search(arr, mid+1, r, x);
		}
		return -1;
//		 if (r >= l) { 
//	            int mid = l + (r - l) / 2; 
//	  
//	            // If the element is present at the 
//	            // middle itself 
//	            if (arr[mid] == x) 
//	                return mid; 
//	  
//	            // If element is smaller than mid, then 
//	            // it can only be present in left subarray 
//	            if (arr[mid] > x) 
//	                return Search(arr, l, mid - 1, x); 
//	  
//	            // Else the element can only be present 
//	            // in right subarray 
//	            return Search(arr, mid + 1, r, x); 
//	        } 
//	  
//	        // We reach here when element is not present 
//	        // in array 
//	        return -1;

	}
	public static void calSubArray(long a[], long x[], long n, long c) {
		for(int i = 0;i<(1 << n);i++) {
			long s = 0;
			for(int j = 0;j<n;j++) {
				if((i & (1 << j)) == 0) {
					s += a[(int) (j + c)];
				}
			}
			x[i] = s;
		}
	}
	public static long solveSubSetSum(long a[], long n, long S) {
		calSubArray(a, x, n/2, 0);
		calSubArray(a, y, n-n/2, n/2);
		
		Arrays.sort(y);
		
		long max = 0;
		for(int i = 0;i<x.length;i++) {
			int p = Search(y, 0, y.length, x[i], S);
			
		}
		
	}
	
}
