package codechef;
import java.util.*;
public class ChefAndWedding {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			List<Integer> f = new ArrayList<Integer>();
			List<Integer> f1 = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				int a1 = sc.nextInt();
				f.add(a1);
				f1.add(a1);
			}
			int count2 = 0;
			count2 = countN(f1);
			int count = 0;
			List<Integer> air = new ArrayList<Integer>();
			air = make(f);
//			System.out.println(air);
//			System.out.println(f);
			for(int i=0;air.isEmpty() == false;i++) {
				count++;
				f = removeElements(f, air);
//				System.out.println(f);
				air.clear();
				air = make(f);
//				System.out.println(air);
//				System.out.println(f);
			}
//			System.out.println(f);
//			System.out.println(air);
//			System.out.println(count);
			System.out.println(Math.min(count2 * k, count * k));		
			
			t--;
			}
		}
	
	public static List<Integer> make(List<Integer> f){
		int count = 0;
		List<Integer> air =new ArrayList<Integer>();
		for(int i=0;i<f.size() && f.size() > 0;i++) {
			if(!f.isEmpty()) {
					if(i == 0) {
					Collections.sort(f);
					air.clear();
					air.add(f.get(i));
					continue;
				}
				if(f.get(i) != f.get(i-1)) {
					air.add(f.get(i));
//					System.out.println(f.get(i));
				}else {
					if(i == f.size() - 1) {
//						System.out.println(air);
						count ++;
					}
					continue;
				}
			} else {
				return f;
			}
		}
		return air;
	}
	public static List<Integer> removeElements(List<Integer> f , List<Integer> air){
		for(int i=0;i<air.size();i++) {
				int a = f.indexOf(air.get(i));
				f.remove(a);
		}
		return f;
	}
	public static int countN(List<Integer> f){
		int count1 = 0;
		for(int i = 0;i<f.size();i++) {
			List<Integer> a = new ArrayList<Integer>();
			a.add(f.get(0));
			int b = Collections.frequency(f, a.get(0));
//			System.out.println(b);
			if(b > 1){
				count1 += b;
			}
			f.removeAll(a);
			a.clear();
//			System.out.println(f);
		}
//		System.out.println(count1);
		return count1;
	}

}
