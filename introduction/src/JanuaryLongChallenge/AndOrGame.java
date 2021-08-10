package JanuaryLongChallenge;
import java.util.*;
public class AndOrGame {
	
	public static void solve(int n, int m, int v, int[] a, int[] b) {
		LinkedHashSet<Integer> ans = new LinkedHashSet<Integer>();
		v = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(v);
		while(pq.size() != 0) {
//			System.out.println("in while");
			int temp = pq.peek();
			pq.remove();
			for(int i = 0;i<n;i++) {
				if(!ans.contains(temp | a[i])) {
					ans.add(temp | a[i]);
					pq.add(temp | a[i]);
				}
				
			}
			for(int i = 0;i<m;i++) {
				if(!ans.contains(temp & b[i])) {
					pq.add(temp & b[i]);
					ans.add(temp & b[i]);
				}
				
			}
		}
		System.out.println(ans);
		System.out.println(ans.size());
//		Object[] arr = a.toArray();
//		Object[] brr = b.toArray();
//		for(int i = 0;i<arr.length;i++) {
//			ans.add(v | (int)arr[i]);
//		}
//		ans.add(0);
//		Object[] crr = ans.toArray();
//		for(int i = 0;i<crr.length;i++) {
//			for(int j = 0;j<arr.length;j++) {
////				System.out.println((int)crr[i]);
////				System.out.println((int)brr[j]);
////				System.out.println((int)crr[i] & (int)brr[j]);
//				ans.add((int)crr[i] | (int)arr[j]);
//			}
//		}
//		for(int i = 0;i<crr.length;i++) {
//			for(int j = 0;j<brr.length;j++) {
////				System.out.println((int)crr[i]);
////				System.out.println((int)brr[j]);
////				System.out.println((int)crr[i] & (int)brr[j]);
//				ans.add((int)crr[i] & (int)brr[j]);
//			}
//		}
//		Object[] drr = ans.toArray();
//		for(int i = 0;i<drr.length;i++) {
//			for(int j = 0;j<arr.length;j++) {
//				ans.add((int)drr[i] | (int)arr[j]);
//			}
//		}
//		for(int i = 0;i<drr.length;i++) {
//			for(int j = 0;j<brr.length;j++) {
//				ans.add((int)drr[i] & (int)brr[j]);
//			}
//		}
//
//		System.out.println(ans.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[m];
//			LinkedHashSet<Integer> a = new LinkedHashSet<Integer>();
//			LinkedHashSet<Integer> b = new LinkedHashSet<Integer>();
			for(int i = 0;i<n;i++) {
				a[i]= sc.nextInt();
			}
			for(int i = 0;i<m;i++) {
				b[i]= sc.nextInt();
			}
			
//			for(int i = 0;i<m;i++) {
//				int temp = sc.nextInt();
//				b.add(temp);
//			}
			int v = 0;
//			System.out.println(a);
//			System.out.println(b);
			solve(n, m, v, a, b);
		}
		
		
	}

}
