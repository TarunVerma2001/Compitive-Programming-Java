package AugustLunchtime2020;

import java.util.*;

public class ChefinaAndswaps2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			int sum = 0;
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = i + 1;
			}
			int niceSwap =0;
			sum = (arr[n-1] * (arr[n-1] + 1)) / 2;
			if(sum % 2 != 0) {
				System.out.println("0");
				continue;
			} else {
				for(int i = 0;i<=(n-1)/2;i++) {
					for(int j = 0; j < n ; j++) {
						if(i % 2 == 0) {
							if(j % 2 == 0) {
								int temp = arr[i];
								arr[i] = arr[j];
								arr[j] = temp;
								int sum2 = 0;
								for(int o =0;o<n;o++) {
									if(sum2 < (sum / 2)) {
										sum2 += arr[o];
									} else {
										break;
									}
								}
								if(sum2 == sum/2) {
									niceSwap += 1;
								}
								temp = arr[i];
								arr[i] = arr[j];
								arr[j] = temp;
							} 
						} else {
							if(j % 2 != 0) {
								int temp = arr[i];
								arr[i] = arr[j];
								arr[j] = temp;
								int sum2 = 0;
								for(int o =0;o<n;o++) {
									if(sum2 < (sum / 2)) {
										sum2 += arr[o];
									} else {
										break;
									}
								}
								if(sum2 == sum/2) {
									niceSwap += 1;
								}
								temp = arr[i];
								arr[i] = arr[j];
								arr[j] = temp;
							}
						}
					}
				}
				System.out.println(niceSwap);
			}
			long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
			long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
			System.out.println("before :" + beforeUsedMem);
			System.out.println("after: " + afterUsedMem);
			t--;
			
			
		}
		

	}

}
