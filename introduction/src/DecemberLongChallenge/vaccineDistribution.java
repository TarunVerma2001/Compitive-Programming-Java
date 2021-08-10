package DecemberLongChallenge;
import java.util.*;
public class vaccineDistribution {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			int critical = 0;
			int nonCrirical = 0;
			for(int i =0;i<n;i++) {
				int temp = sc.nextInt();
				if(temp >= 80 || temp <=9) {
					critical ++;
				} else {
					nonCrirical++;
				}
			}
//			System.out.println("critical : " + critical);
//			System.out.println("nonCritical : " + nonCrirical);
			if(d == 1) {
				System.out.println(n);
			} 
//			else if(d >= n) {
//				int temp = 0;
//				if(critical != 0)
//					temp++;
//				if(nonCrirical != 0)
//					temp++;
//				System.out.println(temp);
//			} 
			else {
				int temp2 = 0;
				if(d >= critical) {
					temp2 ++;
				} else {
					if(critical % d != 0) {
						temp2 += ((critical / d) + 1);
					} else {
						temp2 += (critical / d);
					}
				}
				if(d >= nonCrirical) {
					temp2 ++;
				} else {
					if(nonCrirical % d != 0) {
						temp2 += ((nonCrirical / d) + 1);
					} else {
						temp2 += (nonCrirical / d);
					}
				}
				System.out.println(temp2);
//				int temp = 0;
//				if(d >= critical) 
//					temp++;
//				if(d >= nonCrirical)
//					temp++;
//				if (d < critical)
//					if(critical % d != 0)
//						temp += critical/d + 1;
//					else
//						temp += critical/d;
//				if (d < nonCrirical)
//					if(nonCrirical % d != 0)
//						temp += nonCrirical/d + 1;
//					else
//						temp += nonCrirical/d;
//				System.out.println(temp);
			}
			int ans = (int) (Math.ceil((double)critical / (double)d) + Math.ceil((double)nonCrirical / (double)d));
		}

	}

}
