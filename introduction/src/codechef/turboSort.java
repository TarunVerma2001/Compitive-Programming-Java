package codechef;

import java.util.*;

public class turboSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a[] = new int[t];
		for(int i=0;i<t;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<t;i++) {
			System.out.println(a[i]);
		}
	}

}
