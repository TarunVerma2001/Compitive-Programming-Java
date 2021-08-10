package FabruaryLongChallenge;

import java.util.*;

public class MaxFun {

	public static int Solve(int arr[], int n) {
		int i = 0;
		int j = n-1;
		int k = n -2;
		int ans1 = Math.abs(arr[i] - arr[j]) + Math.abs(arr[j] - arr[k]) + Math.abs(arr[k] - arr[i]);
		j = 1;
		k = n-1;
		int ans2 = Math.abs(arr[i] - arr[j]) + Math.abs(arr[j] - arr[k]) + Math.abs(arr[k] - arr[i]);
		int ans = Math.max(ans1,  ans2);
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int tt = 0;tt<t;tt++) {
			int n = sc.nextInt();
//			int min = Integer.MAX_VALUE;
//			int max = Integer.MIN_VALUE;
//			for(int i = 0;i<n;i++) {
//				int temp = sc.nextInt();
//				if(temp <= min) {
//					min = temp;
//				} 
//				if(temp > max){
//					max = temp;
//				}
//			}
//			System.out.println(min + " .. " + max);
//			int ans = 2 * (max - min);
//			System.out.println(ans);
			int arr[] = new int[n];
			for(int i = 0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int ans = Solve(arr, arr.length);
			System.out.println(ans);
		}
	}
}
