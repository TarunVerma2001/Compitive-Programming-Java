package FabruaryLongChallenge;
import java.util.*;
public class frogSort {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		int n = Integer.MAX_VALUE;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int tt = 0;tt<t;tt++) {
			int n = sc.nextInt();
			int w[] = new int[n];
			int l[] = new int[n];
			for(int i = 0;i<n;i++) {
				w[i] = sc.nextInt();
			}
			for(int i = 0;i<n;i++) {
				l[i] = sc.nextInt();
			}
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for(int i = 0;i<n;i++) {
				map.put(w[i], i+1);
			}
//			System.out.println(map);
			Arrays.sort(w);
			int ans = 0;
			int first = map.get(w[0]);
//			System.out.println("first :: " + first);
			for(int i = 1;i<n;i++) {
				if(map.get(w[i]) > first) {
					first = map.get(w[i]);
//					System.out.println("if : first : " + first);
				} else {
//					System.out.println("map.get(w[i]) : " + map.get(w[i]));
//					System.out.println("l[map.get(w[i]) - 1]) : " + l[map.get(w[i]) - 1]);
					double temp = Math.ceil((double) (first - map.get(w[i]) + 1) / (double)l[map.get(w[i]) - 1]);
//					System.out.println("temp : " + temp);
					ans += temp;
//					System.out.println("ans : " + ans);
					first = (int) (map.get(w[i]) + l[map.get(w[i]) - 1] * temp);
//					System.out.println("first : " + first);
				}
			}
			System.out.println(ans);
			
		}

	}

}
