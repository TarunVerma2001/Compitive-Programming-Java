package AugustLunchtime2020;

import java.util.*;

public class ChefinaAndSwaps3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		for(int o =0;o<t;o++) {
			
			long n = sc.nextLong();
			long sum = n*(n+1)/2;
			long half = sum / 2;
			long result = 0;
			List<Integer> arr = new ArrayList<Integer>();
			for(long i=0;i<n;i++) {
				arr.add((int)i+1);
			}
			long sumtemp2 = 0;
			long i2 = 0;
//			System.out.println("half : " + half);
			for(long i =n-1;sumtemp2<half;i--) {
				sumtemp2 += arr.get((int)i);
				i2++;
			}
			if(sum % 2 != 0) {
				System.out.println("0");
				continue;
			} else if(n == 3) {
				System.out.println("2");
				continue;
			} else if(sumtemp2 == half) {
				System.out.println(((i2 - 1)*(i2)/2) + (n-i2-1)*(n-i2)/2);
			}
			else {
//				System.out.println(sumtemp2);
//				System.out.println(i2);
				int m = (int)n - (int)i2;
				long temp = sumtemp2 - half;
				for(long i = n-1;i >= m;i--) {
					if(arr.contains(arr.get((int)i) - (int)temp)) {
						result++;
					}
				}
				System.out.println(result);		
			}
		}

	}

}
