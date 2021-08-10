package codeforces;
import java.util.*;
public class MereArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o = 0;o<t;o++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i =0;i<n;i++) {
				a[i] = sc.nextInt();
				b[i] = a[i];
			}
			Arrays.sort(a);
			int min = a[0];
			boolean res = true;
			for(int i =0;i<n;i++) {
				if(a[i] != b[i] && b[i]%min != 0) {
					res = false;
					break;
				}
			}
			if(res)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
		
	}

}
