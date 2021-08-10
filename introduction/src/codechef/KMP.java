package codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KMP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t != 0) {
			String s1 = new String();
			s1 = sc.next();
			List<Character> s = new ArrayList<>();
			List<Character> s2 = new ArrayList<>();
			for(int i = 0;i < s1.length() ; i++) {
				s.add(s1.charAt(i));
				s2.add(s1.charAt(i));
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
			Collections.sort(s2);
			for(int i=0;i<p.size();i++) {
				int temp = s.indexOf(p2[i]);
				s.remove(temp);
			}
			for(int i=1;i<p.size();i++) {
				int temp = s2.indexOf(p2[i]);
				s2.remove(temp);
			}
			if(s2.contains(p2[0])) {
				int fre = Collections.frequency(s2, p2[0]);
				int index = s2.indexOf(p2[0]);
				s2.remove(index);
				int index2 = index + fre - 1;
				for(int i=0;i<p.size();i++) {
					s2.add(index2 + i, p2[i]); 
				}
			}
			for(int i=0;i<s2.size();i++) {
				System.out.print(s2.get(i));
			}
			System.out.println();
			t--;
		}
	}

}
