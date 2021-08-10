package codechef;

import java.util.*;

public class ChefAndLinearChess {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			
			int n = sc.nextInt();
			long k = sc.nextLong();
			long p[] = new long [n];
			long arr[] = new long [n];
			for(int i=0;i<n;i++) {
				p[i] = sc.nextLong();
			}
			for(int i=0;i<n;i++) {
				if((k > p[i])) {
					long temp = k - p[i];
					arr[i] = temp;
				} else if(k < p[i]) {
					arr[i] = 0;
				}
			}
			for(int i=0;i<n;i++) {
				if(arr[i] < p[i]) {
					arr[i] = 0;
				} else if(arr[i] % p[i] != 0) {
					arr[i] = 0;
				} else {
					arr[i] = arr[i] / p[i];
				}
			}
			Arrays.sort(arr);
			long temp = 0;
			for(int i=0;i<n;i++) {
				if(arr[i] > 0) {
					temp = arr[i];
					break;
				}
			}
			if(temp == 0) {
				System.out.println("-1");
			} else {
				System.out.println((k + 1)/(1 + temp));
			}
			
			
			t = t-1;
		}
		
	}

}
