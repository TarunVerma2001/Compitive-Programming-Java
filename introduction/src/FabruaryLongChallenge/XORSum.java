package FabruaryLongChallenge;

import java.util.Scanner;

public class XORSum {
	
	static int dp[] = new int[1001];

	public static void init() {
		for(int i = 0;i<=1000;i++) {
			dp[i] = 0;
		}
	}
	public static void dp(int arr[], int m, int n) {
		int sum = 0;
		for(int i = 0;i<n;i++) {
			sum += arr[i];
		}
		dp[1] = sum;
		for(int i =2;i<=m;i++) {
			dp[i] += dp[i-1];
			print(arr, n, i);
		}
	}
	static void combination(int arr[], int n, int r, int index, 
            int data[], int i) 
	{ 
		if (index == r) 
		{ 
			int temp = 0;
			for (int j=0; j<r; j++) {
				temp ^= data[j];
			}
			dp[r]+=temp;
//				System.out.print(data[j]+" "); 
//			System.out.println(""); 
			return; 
		} 
		
		if (i >= n) 
			return; 
		
		data[index] = arr[i]; 
		combination(arr, n, r, index+1, data, i+1); 
		
		combination(arr, n, r, index, data, i+1); 
	} 
	static void print(int arr[], int n, int r) 
	{ 
		// A temporary array to store all combination one by one 
		int data[]=new int[r]; 
		
		// Print all combination using temprary array 'data[]' 
		combination(arr, n, r, 0, data, 0); 
	} 
	
//	static void combination(int arr[], int data[], int l, 
//            int r1, int index, int r) 
//	{ 
//		// Current combination is ready to be printed, print it 
//		if (index == r) 
//		{ 
////			System.out.println("dp : " + dp[r]);
//			int temp = 0;
//			for (int j=0; j<r; j++) {
//				temp ^= data[j];
////				System.out.print(data[j]+" ");
//			}
////			System.out.println("temp : " +temp);
//			dp[r] += temp;
////			System.out.println("dp : " + dp[r]);
////			System.out.println(""); 
//			return; 
//		} 
//
//
//		for (int i=l; i<=r1 && r1-i+1 >= r-index; i++) 
//			{ 
//				data[index] = arr[i]; 
//				combination(arr, data, i+1, r1, index+1, r); 
//			} 
//	} 
//	static void print(int arr[], int n, int r) 
//    { 
//        // A temporary array to store all combination one by one 
//        int data[]=new int[r]; 
//  
//        // Print all combination using temprary array 'data[]' 
//        combination(arr, data, 0, n-1, 0, r); 
//    } 
	public static void main (String[] args) { 
        
//		int arr[] = {1, 2, 3, 4, 5}; 
//        int r = 3; 
//        int n = arr.length; 
//        printCombination(arr, n, r); 
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int tt = 0;tt<n;tt++) {
        	arr[tt] = sc.nextInt();
        }
        int q = sc.nextInt();
        init();
        dp(arr, n, n);
        for(int i = 0;i<q;i++) {
        	int m = sc.nextInt();
        	System.out.println(dp[m]);
        }
//        for(int tt = 0;tt<q;tt++) {
//        	int m = sc.nextInt();
//        	while(m > 0) {
//        		
//        	}
//        }
	} 

}
