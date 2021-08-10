package novemberLong;
import java.util.*;
public class IronMag2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n, k;
			n = sc.nextInt();
			k = sc.nextInt();
			String s = new String();
			s = sc.next();
			int res = 0;
			List<Character> a = new ArrayList<Character>();
			for(int i =0;i<n;i++) {
				a.add(s.charAt(i));
			}
			int lower = 0;
			int upper = n - 1;
			for(int i = 0;i<n;i++) {
				int condS = 0;
				int tempres = 0;
				if(a.get(i) == 'I') {
					for(int j = i-1;j>=lower;j--) {
						if(a.get(j) == 'M') {
							List<Character> temp = new ArrayList<Character>();
							temp = a.subList(j, i);
							if(temp.contains('X')) {
								break;
							}
							if(temp.contains(':')) {
								for(int u = 1;u<temp.size() - 1;u++) {
									if(a.get(u) == ':') {
										condS ++;
									}
								}
							}
							if((k + 1 - a.size() - 1 - condS) > 0) {
								tempres ++;
							}
						}
					}
					for(int j = i+1;j<upper ;j++) {
						
					}
				}
			}
		}
	}

}
