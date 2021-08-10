package JanuaryLongChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class cpl {
	public static void solve(int n, int k, int h[], int sum) {
		long line1 = 0;
		long line2 = 0;
		int i = n - 1;
		int count = 0;
		Arrays.sort(h);
		if(sum < 2*k) {
			System.out.println("-1");
			return;
		}
		if(n == 1) {
			System.out.println("-1");
			return;
		}
		while(line1 < k || line2 < k) {
			if(line1 <=  line2) {
				if(line1 < k) {
					line1 += h[i];
					i--;
					count++;
					if(line1 >= k && line2 >= k) {
						break;
					}
				}
			} else {
				if(line2 < k) {
					line2 += h[i];
					i--;
					count++;
					if(line1 >= k && line2 >= k) {
						break;
					}
				}
			}
			
//			if(line2 < k) {
//				line2 += h[i];
//				i--;
//				count++;
//				if(line1 >= k && line2 >= k) {
//					break;
//				}
//			}
		}
		if(line1 < k || line2 < k) {
			System.out.println("-1");
			return;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o = 0;o<t;o++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int sum = 0;
			int h[] = new int[n];
			for(int i =0;i<n;i++) {
				h[i] = sc.nextInt();
				sum += h[i];
			}
			solve(n, k, h, sum);
		}
	}
}
