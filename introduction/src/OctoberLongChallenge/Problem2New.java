package OctoberLongChallenge;
import java.util.*;
public class Problem2New {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			long k = sc.nextLong();
			long a[] = new long[n];
			long b[] = new long[n];
			long c[] = new long[n];
			for(int i = 0;i<n;i++) {
				a[i] = sc.nextLong();
			}
			if(a[0] <= k) {
				b[0] = 0;
				c[0] = a[0];
			} else {
				b[0] = a[0] - k;
				c[0] = k;
			}
			for(int i =1;i<n;i++) {
				b[i] = a[i] + b[i-1]; 
				if(b[i] <= k) {
					c[i] = b[i];
					b[i] = 0;
				} else {
					c[i] = k;
					b[i] = b[i] - k;
				}
			}
//			for(int i =0;i<n;i++) {
//				System.out.print(a[i] + " ");
//			} System.out.println();
//			for(int i =0;i<n;i++) {
//				System.out.print(b[i] + " ");
//			} System.out.println();
//			for(int i =0;i<n;i++) {
//				System.out.print(c[i] + " ");
//			}
//			System.out.println();
			boolean res = false;
			int i = 0;
			for(i = 0;i<n;i++) {
				if(c[i] < k) {
					res = true;
					break;
				}
			}
			if(res) {
				System.out.println(i+1);
			} else {
				int tempe2 = (int)(b[n-1] / k);
//				int tempe3 = (int)(b[n-1] % k);
//				System.out.println((int)Math.ceil(b[n-1] / k));
//				System.out.println(b[n-1] % k);
//				
				System.out.println(n + tempe2 + 1);
//				} else {
//					
//				}
//				System.out.println(n + tempe2 );
			}
		}
		
	}

}
