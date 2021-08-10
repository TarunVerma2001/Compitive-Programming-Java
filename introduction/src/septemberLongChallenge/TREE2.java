package septemberLongChallenge;

import java.util.*;

public class TREE2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			
			int n = sc.nextInt();
//			List<Integer> li = new ArrayList<Integer>();
//			for(int i=0;i<n;i++) {
//				li.add(sc.nextLong());
//			}
//			System.out.println(li);
			Set<Integer> set = new HashSet<Integer>();
			for(int i=0;i<n;i++) {
				int temp = sc.nextInt();
				set.add(temp);
			}
			System.out.println(set);
			boolean a = false;
			if(set.contains(0)) {
				a = true;
			}
			if(a == true) {
				System.out.println(set.size() - 1);
			} else {
				System.out.println(set.size());
			}
			
			t--;
		}
		
	}

}
