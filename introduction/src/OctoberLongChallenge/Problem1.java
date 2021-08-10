package OctoberLongChallenge;

import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n, k, x, y;
			n = sc.nextInt();
			k = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			boolean res = false;
			int temp = x;
			int temp2 = 0;
//			int num = (int) Math.ceil(n / k);
			for(int i = 0;temp2 != x;i++) {
//				if(y<x) {
//					if((temp - k) <= 0)
//				}
				if((temp + k) % n == y) {
//					System.out.println((temp + k) % n);
					res = true;
					break;
				} else {
//					System.out.println((temp + k) % n);
					temp = ((temp + k) % n);
					temp2 = temp;
				}
			}	
			if(res == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
				
			
		}

	}

}
//class CircularArray{
//	int size;
//	List<Integer> arr = new ArrayList<Integer>();
////	int Arr[] = new int[size];
//	public CircularArray(int size) {
//		
//		this.size = size;
//		
//	}
//	int max = 0;
//	void addE(int )
//	
//}
