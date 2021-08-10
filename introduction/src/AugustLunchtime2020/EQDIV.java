package AugustLunchtime2020;

import java.util.*;

public class EQDIV {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int t = sc.nextInt();
		while(t != 0) {
			
			int n = sc.nextInt();
			long a[] = new long[n];
			for(int i=0;i<n;i++) {
				a[i] = (long)Math.pow(i+1, k);
			}
			int p = 0;
			int q = n-1;
			int total = 2;
			long split1 = 0;
			long split2 = 0;
			while(total <= n) {
				split1 += a[p];
				split2 += a[q];
				if(split1 < split2) {
					if(total < n) {
						p++;
					}
				} else {
					if(total < n) {
						q--;
					}
				}
				
				total++;
			}
			t--;
		}
		
	}

}
