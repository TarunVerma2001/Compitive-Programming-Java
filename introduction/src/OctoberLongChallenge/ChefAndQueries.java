package OctoberLongChallenge;
import java.util.*;
public class ChefAndQueries {

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
			long i = 0;
			long temp = 1;
			if(a[0] > k) {
				temp = a[0] - k;
			} else if(a[0] == k){
				temp = 0;
			} else {
				temp = 0;
				System.out.println(1);
				continue;
			}
			boolean res = false;
			for(i = 1;i<n;i++) {
				temp = temp + a[(int) i];
				if(temp > k) {
					temp = temp - k;
				} else if(temp == k) {
					temp = 0;
				} else {
					res = true;
					break;
				}
//				System.out.println("temp : " + temp);
			}
			if(res == true) {
				System.out.println(i+1);
			} else {
				temp = temp / k;
				System.out.println(n + temp + 1);
			}
		}
		
	}
	
}
