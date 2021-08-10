package codechef;

import java.util.Scanner;
import java.util.Arrays;

public class chefinaAndSwaps {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j=0;j<t;j++) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			for(int i=0;i<n;i++) {
				b[i] = sc.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			

			for(int i=0;i<n;i++) {
				if(a[i] != b[i]) {
					if(i<=n-2) {
						if(a[i+1] == a[i] && b[i+1] == b[i]) {
							int temp;
							temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
					i+=2;
				}
				else continue;
			}
			 
			Arrays.sort(a);
			Arrays.sort(b);
			 
			int count =0;
			for(int i=0;i<n;i++) {
				if(a[i] == b[i]) {
					continue;
				}
				else {
					count++;
				}
			}
			
			
			if(count !=0) {
				for(int i=0;i<n;i++) {
					System.out.print(a[i] + " ");
				}
			}
			
			
			
			
			
		}
		
	}

}
