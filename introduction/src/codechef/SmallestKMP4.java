package codechef;

import java.util.*;

public class SmallestKMP4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t != 0) {
			String s1 = new String();
			s1 = sc.next();
			List<Character> s = new ArrayList<>();
			for(int i = 0;i < s1.length() ; i++) {
				s.add(s1.charAt(i));
			}

			String p1 = new String();
			p1 = sc.next();
			char p2[] = new char[p1.length()];
			List<Character> p = new ArrayList<>();
			for(int i = 0;i < p1.length() ; i++) {
				p.add(p1.charAt(i));
				p2[i] = p1.charAt(i);
			}
			Collections.sort(s);
			List<Character> s2 = new ArrayList<>();
			for(int i = 0;i < s1.length() ; i++) {
				s2.add(s1.charAt(i));
			}
			Collections.sort(s2);
			System.out.println(s);
			System.out.println(p);
			for(int i=0;i<p2.length;i++) {
				System.out.print(p2[i]);
			}
			System.out.println(s2);
			for(int i=0;i<p.size();i++) {
				int temp = s.indexOf(p2[i]);
				s.remove(temp);
			}
			System.out.println(s);
			
			t--;
		}
		
		
	}

}
