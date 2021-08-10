package hashingproblems;
import java.util.*;
public class Winning {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Map<String, Integer> names =new HashMap<String, Integer>();
		String s[] = new String[t];
		int x[] = new int[t];
		for(int o =0;o<t;o++) {
			s[o] = sc.next();
			x[o] = sc.nextInt();
			if(names.containsKey(s[o])) {
				x[o] += names.get(s[o]);
				names.put(s[o], x[o]);
			} else {
				names.put(s[o], x[o]);
			}
		}
		int ans = Collections.max(names.values());
		for(int i =0;i<t;i++) {
			if(names.get(s[i]) == ans && x[i] >= ans) {
				System.out.println(s[i]);
				break;
			}
		}

	}

}
