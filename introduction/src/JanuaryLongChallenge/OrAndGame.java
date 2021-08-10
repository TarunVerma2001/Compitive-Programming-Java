package JanuaryLongChallenge;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class OrAndGame {
	
	public static void solve(LinkedHashSet<Integer> a, LinkedHashSet<Integer> b,int v, int n, int m) {
		LinkedHashSet<Integer> ans = new LinkedHashSet<Integer>();
		Iterator<Integer> i1 = a.iterator();
		ans.add(0);
		while(i1.hasNext()) {
			ans.add(v | i1.next());
		}
		Object arr[] = ans.toArray();
		for(int i = 0;i<arr.length;i++) {
			Iterator<Integer> i2 = b.iterator();
			while(i2.hasNext()) {
				ans.add((int)arr[i] & (int)i2.next());
			}
		}
		Object arr2[] = ans.toArray();
		for(int i = 0;i<arr2.length;i++) {
			Iterator<Integer> i3 = a.iterator();
			while(i3.hasNext()) {
				ans.add((int)arr2[i] | (int) i3.next());
			}
		}
		Object arr3[] = ans.toArray();
		for(int i = 0;i<arr3.length;i++) {
			Iterator<Integer> i3 = a.iterator();
			while(i3.hasNext()) {
				ans.add((int)arr3[i] | (int) i3.next());
			}
		}
		Object arr4[] = ans.toArray();
		for(int i = 0;i<arr4.length;i++) {
			Iterator<Integer> i2 = b.iterator();
			while(i2.hasNext()) {
				ans.add((int)arr4[i] & (int)i2.next());
			}
		}
		Object arr5[] = ans.toArray();
		for(int i = 0;i<arr5.length;i++) {
			for(int j = 0;j<arr5.length;j++) {
				ans.add((int)arr5[i] | (int)arr5[j]);
			}
		}
		Object arr6[] = ans.toArray();
		for(int i = 0;i<arr6.length;i++) {
			for(int j = 0;j<arr6.length;j++) {
				ans.add((int)arr6[i] | (int)arr6[j]);
			}
		}
		
//		System.out.println(ans);
		System.out.println(ans.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			LinkedHashSet<Integer> a = new LinkedHashSet<Integer>();
			LinkedHashSet<Integer> b = new LinkedHashSet<Integer>();
			for(int i = 0;i<n;i++) {
				int temp = sc.nextInt();
				a.add(temp);
			}
			
			for(int i = 0;i<m;i++) {
				int temp = sc.nextInt();
				b.add(temp);
			}
			int v = 0;
			solve(a, b, v, n, m);
//			System.out.println(a);
//			System.out.println(b);
//			solve(n, m, v, a, b);
		}

	}

}
