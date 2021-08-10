package DecemberLongChallenge;

import java.util.*;

public class primeTuples {

	public static boolean[] SieveOfEractothenes(int n) {
		boolean [] mark = new boolean[n+1];
		for(int i =0;i<=n;i++) {
			mark[i] = true;
		}

		for(int p = 2;p*p <= n;p++) {
			if(mark[p] == true) {
				for(int i = p*p;i<=n;i+=p) {
					mark[i] = false;
				}
			}
		}
		return mark;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		int n = 1000001;
		int count = 0;
		boolean mark[]= SieveOfEractothenes(n);
		int ans[] = new int[n+1];
		for(int i = 5;i<=n;i++) {
			if(mark[i] && mark[i-2]) {
				count ++;
			}
			ans[i] = count;
		}
		for(;t>0;t--) {
			int n1 = sc.nextInt();
			System.out.println(ans[n1]);
			
		}
			
	}

}
