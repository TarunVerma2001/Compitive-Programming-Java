package hashingproblems;

import java.util.*;

public class RegistrationSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Map<String, Integer> names = new HashMap<String, Integer>();
		for(int o = 0;o<t;o++) {
			String s = sc.next();
			if(!names.containsKey(s)) {
				names.put(s, 0);
				System.out.println("OK");
			} else {
				names.put(s, names.get(s) + 1);
				System.out.println(s + names.get(s));
			}
		}

	}
}

