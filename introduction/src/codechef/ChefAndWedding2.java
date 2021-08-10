package codechef;

import java.util.*;
public class ChefAndWedding2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			List<Integer> family = new ArrayList<Integer>();
			List<Integer> family2 = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				int a = sc.nextInt();
				family.add(a);
				family2.add(a);
			}
//			System.out.println(family);
			int count1 = 0;
			count1 = conflict(family2);
			int count = 0;
			List<Integer> air = new ArrayList<Integer>();
			for(int i = 0;family.size() != 0; i++) {
				air = make(family);
				if(air.isEmpty() == false) {
					count++;
					family = removeE(family, air.size());
				}else {
					break;
				}
			}
//			System.out.println(family);
//			System.out.println(count);
//			System.out.println(count1);
			
			System.out.println(Math.min(k * count, k + count1));
			
			
			t--;
		}
		
	}
	public static List<Integer> make(List<Integer> family) {
		int count = 0;
		List<Integer> air = new ArrayList<Integer>();
		for(int i=0;i<family.size();i++) {
			if(i == 0) {
				air.add(family.get(i));
//				System.out.println(air);
			}else {
				if(air.contains(family.get(i)) == false) {
					air.add(family.get(i));
//					System.out.println(air);
					continue;
				} else {
					count++;
//					System.out.println(count);
					break;
				}
			}
		}
		return air;
	}
	public static List<Integer> removeE(List<Integer> family , int a){
		for(int i=0;i<a;i++) {
			family.remove(0);
//			System.out.println(family);
		}
		return family;
	}
	public static int conflict(List<Integer> f){
		int count1 = 0;
		for(int i = 0;f.size() != 0;i++) {
			List<Integer> a = new ArrayList<Integer>();
			a.add(f.get(0));
//			System.out.println(a);
			int b = Collections.frequency(f, a.get(0));
//			System.out.println(b);
			if(b > 1){
				count1 += b;
//				System.out.println(count1);
			}
			f.removeAll(a);
			a.clear();
//			System.out.println(f);
		}
//		System.out.println(count1);
		return count1;
	}

}
