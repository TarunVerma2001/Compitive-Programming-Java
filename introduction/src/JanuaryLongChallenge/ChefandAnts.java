package JanuaryLongChallenge;

import java.util.*;

public class ChefandAnts {
	public static void Solve(int n, ArrayList<ArrayList<Integer>> a) {
		
		ArrayList<E>
		for(int i =0;i<=n;i++) {
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> temp2 = new ArrayList<Integer>();
			
		}
		int o = 0;
		for(int i = 1;i<=a.size();i++) {
			for(int j = 0;j<a.get(i).size();j++) {
				if(a.get(i).get(j) < 0) {
					list.get
				}
			}
			
		}
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int i = 0;i<t;i++) {
			int n = sc.nextInt();
			ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
			for(int j = 0;j<=n;j++) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(2);
				temp.clear();
				a.add(temp);
			}
//			System.out.println(a);
			for(int j = 1;j<=n;j++) {
				int m = sc.nextInt();
				for(int o = 0;o<m;o++) {
					int temp2 = sc.nextInt();
					a.get(j).add(temp2);
				}
				Collections.sort(a.get(j));
			}
			Solve(n, a);
//			System.out.println(a);
//			long count1 = 0;
//			long count2 = 0;
//			for(int j = 0;j<a.get(1).size();j++) {
//				if(a.get(1).get(j) > 0) {
//					count1++;
//				} else {
//					count2++;
//				}
//			}
//			System.out.println(count1*count2);
		}
	}

}
