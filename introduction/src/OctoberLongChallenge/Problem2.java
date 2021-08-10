package OctoberLongChallenge;
import java.util.*;
public class Problem2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			long k = sc.nextLong();
			long a[] = new long[n];
			long c[] = new long[n];
			long b[] = new long[n];
			for(int i =0;i<n;i++) {
				a[i] = sc.nextLong();
			}
			for(int i =0;i<n;i++) {
				if(i == 0) {
					b[i] = (a[i] - k);
					if(i < n-1) {
						b[i+1] = a[i+1] + b[i]; 
						c[i+1] = a[i+1] + b[i];
					}
					c[i] = (a[i]);
//					System.out.println(b[i]);
//					System.out.println(b[i+1]);
					continue;
				}
				if((b[i] - k) >= 0) {
					b[i] = b[i] - k;
//					System.out.println(b[i]);
					if(i < n-1) {
						if(b[i] >= 0) {
							b[i+1] = a[i+1] + b[i]; 
							c[i+1] = a[i+1] + b[i];
						} else {
							b[i+1] = a[i+1];
							c[i+1] = a[i+1];
						}
//							System.out.println(b[i+1]);
					}
//					System.out.println(b[i]);
//					System.out.println(b[i+1]);
				} else {
					b[i] = b[i] - k;
//					System.out.println(b[i]);
					if(i < n-1) {
						b[i+1] = a[i+1];
						c[i+1] = a[i+1];
//						System.out.println(b[i+1]);
					}
//					System.out.println(b[i]);
//					System.out.println(b[i+1]);
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
			long temp2 = 0;
			boolean res = false;
			int i = 0;
			for(;i<n;i++) {
////				if(a[i] + b[i] <=
//				if(b[i] < 0) {
//					res = true;
//					break;
				if(c[i] < 5 ) {
					res = true;
					break;
				} else {
					temp2 = b[i];
				}
			}
//			if(res == false) {
//				System.out.println(i+1);
//			} else {
//				
//			}
			if(res == true) {
				System.out.println(i+1);
			} else {
//				long tempe = b[n-1];
//				for(i = 0;tempe>=0;i++) {
//					tempe = tempe - k;
//				}
//				System.out.println(n + i );
				int tempe2 = (int)Math.ceil(b[n-1] / k);
				System.out.println(n + tempe2 + 1);
			}
			
		
		}

	}
}
