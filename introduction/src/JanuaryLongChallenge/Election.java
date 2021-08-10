package JanuaryLongChallenge;
import java.util.*;
public class Election {

//	public static void Solve(int SumA, int SumB, int a[], int b[], int n, int m) {
//		Arrays.sort(a);
//		Arrays.sort(b);
//		int Count = 0;
//		int i = 0;
//		int j = m - 1;
//		while(SumA <= SumB) {
//			if(a[i] < b[j]) {
//				SumA = (SumA - a[i] + b[j]);
//				SumB = (SumB - b[j] + a[i]);
//				i++;
//				j--;
//				if(i >= n && m < 0) {
//					System.out.println("-1");
//					return;
//				}
//				Count++;
//			}else {
//				System.out.println("-1");
//				return;
//			}
//		}
//		System.out.println(Count);
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t= sc.nextInt();
		for(int o = 0;o<t;o++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[] = new int [n];
			int []b = new int [m];
			int SumA = 0;
			int SumB = 0;
			for(int j = 0;j<n;j++) {
				a[j] = sc.nextInt();
				SumA += a[j];
			}
			for(int j = 0;j<m;j++) {
				b[j] = sc.nextInt();
				SumB += b[j];
			}
//			Solve(SumA, SumB, a, b, n, m);
			Arrays.sort(a);
			Arrays.sort(b);
			int Count = 0;
			int i = 0;
			int j = m - 1;
			boolean temp = true;
			while(SumA <= SumB) {
				if(i >= n && j < m) {
					temp = false;
					System.out.println("-1");
					break;
				}
				if(a[i] < b[j]) {
					SumA = (SumA - a[i] + b[j]);
					SumB = (SumB - b[j] + a[i]);
					i++;
					j--;
					Count++;
				} else {
					temp = false;
					System.out.println("-1");
					break;
				}
			}
			if(temp == true) {
				System.out.println(Count);
			}
		}
	}
	
}
