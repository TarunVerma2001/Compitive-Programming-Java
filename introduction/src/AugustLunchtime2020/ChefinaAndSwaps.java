package AugustLunchtime2020;

import java.util.*;

public class ChefinaAndSwaps {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			long sum = 0;
			int n = sc.nextInt();
			long a[] = new long[n];
			long arr[] = new long[n];
			for(int i=0;i<n;i++) {
				a[i] = i + 1;
				arr[i] = i + 1;
			}
			int niceSwap =0;
			System.out.println("a[n-1] : " +a[n-1]);
			sum = (a[n-1] * (a[n-1] + 1)) / 2;
			if(sum % 2 != 0) {
				System.out.println("0");
				continue;
			} else {
				for(int i = 0;i<=(n-1)/2;i++) {
					System.out.println("i : " + i);
					for(int j = 0; j < n ; j++) {
						System.out.println("j : " + j);
						if(i % 2 == 0) {
							System.out.println("in odd");
							if(j % 2 == 0) {
								System.out.println("in odd innner");
								System.out.println("a[i] :" + a[i]);
								System.out.println("a[j] :" + a[j]);
								long temp = arr[i];
								arr[i] = arr[j];
								arr[j] = temp;
								int sum2 = 0;
								for(int o =0;o<n;o++) {
									System.out.println("o : " + o);
									if(sum2 < (sum / 2)) {
										sum2 += arr[o];
									} else {
										break;
									}
									System.out.println("sum2 : " + sum2);
								}
								if(sum2 == sum/2) {
									niceSwap += 1;
								}
								System.out.println("nice swap :" + niceSwap);
								temp = arr[i];
								arr[i] = arr[j];
								arr[j] = temp;
							} 
						} else {
							System.out.println("in else");
							if(j % 2 != 0) {
								System.out.println("in even innner");
								System.out.println("a[i] :" + a[i]);
								System.out.println("a[j] :" + a[j]);
								long temp = arr[i];
								arr[i] = arr[j];
								arr[j] = temp;
								int sum2 = 0;
								for(int o =0;o<n;o++) {
									System.out.println("o : " + o);
									if(sum2 < (sum / 2)) {
										sum2 += arr[o];
										System.out.println("sum2 _ " + sum2);
									} else {
										break;
									}
									System.out.println("sum2 : " + sum2);
								}
								if(sum2 == sum/2) {
									niceSwap += 1;
								}
								System.out.println("nice swap :" + niceSwap);
								temp = arr[i];
								arr[i] = arr[j];
								arr[j] = temp;
							}
						}
					}
				}
				System.out.println(niceSwap);
			}
			t--;
			
			
		}
		
	}

}
