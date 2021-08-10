package codechef;

import java.util.*;

public class ChefAndDolls {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j=0;j<t;j++) {
			int n = sc.nextInt();
			int a[] = new int [n];
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			boolean result = false;
			for(int i=0;i<n-1;i++) {
				if(a[i] != a[i+1]) {
					result = true;
					System.out.println(a[i]);
					break;
				} else {
					i++;
				}
			}
			if(result == true) {
				continue;
			} else {
				System.out.println(a[n-1]);
			}
			
		}

	}

}
