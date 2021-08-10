package DecemberLongChallenge;

import java.util.*;

public class vaccineProduction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int d1 = sc.nextInt();
		int v1 = sc.nextInt();
		int d2 = sc.nextInt();
		int v2 = sc.nextInt();
		int p = sc.nextInt();
		
		int ans = 0;
		
		if(d1 == d2) {
				int temp = v1+v2;
				if(p % temp != 0) {
					ans = (p/temp) + 1;
				} else {
					ans = (p/temp);
				}
				if(d1 == 1) {
					System.out.println(ans);
				} else {
					System.out.println(ans + (d1 - 1));
				}
		} else if(d1 > d2) {
			int x = d1 - d2;
			int temp = x * v2;
			if(temp >= p) {
				if(p % v2 != 0) {
					ans = (p/v2) + 1;
				} else {
					ans = (p/v2);
				}
				if(d2 == 1) {
					System.out.println(ans);
				} else {
					System.out.println(ans + (d2 - 1));
				}
			} else {
				ans = x;
				int y = v1 + v2;
				int req = p - temp;
				if(req % y != 0) {
					ans += (req/y) + 1;
				} else {
					ans += (req/y);
				}
				if(d2 == 1) {
					System.out.println(ans);
				} else {
					System.out.println(ans + (d2 - 1));
				}
			}
		} else if(d2 > d1) {
			int x = d2 - d1;
			int temp = x * v1;
			if(temp >= p) {
				if(p % v1 != 0) {
					ans = (p/v1) + 1;
				} else {
					ans = (p/v1);
				}
				if(d1 == 1) {
					System.out.println(ans);
				} else {
					System.out.println(ans + (d1 - 1));
				}
			} else {
				ans = x;
				int y = v1 + v2;
				int req = p - temp;
				if(req % y != 0) {
					ans += (req/y) + 1;
				} else {
					ans += (req/y);
				}
				if(d1 == 1) {
					System.out.println(ans);
				} else {
					System.out.println(ans + (d1 - 1));
				}
			}
		}
		
	}

}
