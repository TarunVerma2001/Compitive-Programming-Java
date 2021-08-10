package JanuaryLongChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class watching {
	
	static int max = 4000;
	static ArrayList<Integer> result = new ArrayList<Integer>();
	
	static boolean dp[][];
	
//	public static void solve(ArrayList<Integer> a, int n, int k) {
//		Collections.sort(a);
//		int line1 = 0;
//		int line2 = 0;
//		int i = a.size()-1;
//		int count = 0;
//		while(line1 < k) {
//			if(i < 0)
//				break;
//			if(line1 + a.get(i) <= k) {
//				line1 += a.get(i);
//				System.out.println("line1 : " + line1);
//				count++;
//				a.remove(i);
//				i--;
//			} else {
//				i--;
//			}
//			
//		}
//		i = a.size()-1;
//		while(line2 < k) {
//			if(i < 0)
//				break;
//			if(line2 + a.get(i) <= k) {
//				line2 += a.get(i);
//				System.out.println("line2 : " + line2);
//				count++;
//				a.remove(i);
//				i--;
//			} else {
//				i--;
//			}
//		}
//		int temp = 0;
//		if(line1 != k) {
//			if(a.size() >= 1) {
//				temp++;
//				a.remove(a.size()-1);
//			}
//		}
//		if(line2 != k) {
//			if(a.size() >= 1) {
//				temp++;
//			}
//		}
//		count += temp;
//		System.out.println(count);
//		
//	}
	public static void solve(int arr[], int n, int sum, int arrSum) {
		Arrays.sort(arr);
		if((arrSum < 2 * sum) || n == 1) {
			System.out.println("-1");
		}
		int temp = 0;
		ArrayList<Integer> a = new ArrayList<Integer>();
		int i = n-1;
		for(i = n-1;temp <= (2 * sum);i--) {
			temp += arr[i];
			a.add(arr[i]);
		}
		
		
		System.out.println(temp);
	}
	public static void AllSubsets(int arr[], int n, int sum) 
    { 
        if (n == 0 || sum < 0) 
           return;  
        dp = new boolean[n][sum + 1]; 
        for (int i=0; i<n; ++i) 
        { 
            dp[i][0] = true;   
        } 
        if (arr[0] <= sum) 
           dp[0][arr[0]] = true; 
       
        for (int i = 1; i < n; ++i) 
            for (int j = 0; j < sum + 1; ++j) 
                dp[i][j] = (arr[i] <= j) ? (dp[i-1][j] || 
                                           dp[i-1][j-arr[i]]) 
                                         : dp[i - 1][j]; 
        if (dp[n-1][sum] == false) 
        { 
            return; 
        } 
        ArrayList<Integer> p = new ArrayList<>(); 
        printSubsetsRec(arr, n-1, sum, p); 
    } 
	public static void printSubsetsRec(int arr[], int i, int sum, ArrayList<Integer> p) {  
		if (i == 0 && sum != 0 && dp[0][sum]) 
		{ 
			p.add(arr[i]); 
			display(p); 
			p.clear(); 
			return; 
		} 
		if (i == 0 && sum == 0) 
		{ 
			display(p); 
			p.clear(); 
			return; 
		} 
		if (dp[i-1][sum]) 
		{ 
			ArrayList<Integer> b = new ArrayList<>(); 
			b.addAll(p); 
			printSubsetsRec(arr, i-1, sum, b); 
		}  
		if (sum >= arr[i] && dp[i-1][sum-arr[i]]) 
		{ 
			p.add(arr[i]); 
			printSubsetsRec(arr, i-1, sum-arr[i], p); 
		} 
	} 
	
	public static void display(ArrayList<Integer> v) { 
		if(v.size() < max) {
			result.clear();
			result.addAll(v);
			max = v.size();
		}
		if(v.size() == result.size()) {
			for(int i = 0;i<v.size();i++) {
				if(result.get(i) < v.get(i)) {
					result.clear();
					result.addAll(v);
					max = v.size();
				}
			}
		}
	} 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int sum = sc.nextInt();
			int arrSum = 0;
			int arr[] = new int[n];
			for(int j = 0;j<n;j++) {
				arr[j] = sc.nextInt();
				arrSum += arr[j];
			}
			solve(arr, n, sum, arrSum);
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int i = 0;i<n;i++) {
				a.add(arr[i]);
			}
//			Arrays.sort(arr);
//			AllSubsets(arr, n, sum); 
//			
//	        a.removeAll(result);
//			System.out.println(result);
//			System.out.println(a);
		} 
		
        
		
				
	}
}
