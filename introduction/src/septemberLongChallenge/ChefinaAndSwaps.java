package septemberLongChallenge;

import java.util.*;

public class ChefinaAndSwaps {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		long t = sc.nextLong();
		for(long o = 0;o<t;o++) {
			long n = sc.nextLong(); 
			long sum = n*(n+1)/2;
			long ans = 0;
			if(sum % 2 != 0) {
				ans = 0;
				
			} else {
				double tmp = sum/2;
				double k = (Math.sqrt(8 * tmp + 1)/ 2) - 0.5;
				long temp = (long)k;
				double deci = k - (double)temp;
				long ans1 = (long)deci;
				if(deci==0) {
					ans = func(ans1-1) + func(n-ans1-1);
				}else {
					ans = n - ans1;
				}
			}
			System.out.println(ans);
			
		}
		
	}
	public static long func(long n) {
		return (n*(n+1))/2;
	}

}
