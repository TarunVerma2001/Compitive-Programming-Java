package codechef;

import java.util.*;
public class SmallestKMP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t != 0) {
			String s1 = new String();
			s1 = sc.next();
			List<Character> s = new ArrayList<>();//original s
			for(int i = 0;i < s1.length() ; i++) {
				s.add(s1.charAt(i));
			}
//			System.out.println(s);
			String p1 = new String();
			p1 = sc.next();
			char p2[] = new char[p1.length()];
			List<Character> p = new ArrayList<>();
			for(int i = 0;i < p1.length() ; i++) {
				p.add(p1.charAt(i));
				p2[i] = p1.charAt(i);
			}
//			System.out.println(p);
			Collections.sort(s);//sorted s
			List<Character> s2 = new ArrayList<>();
			for(int i = 0;i < s1.length() ; i++) {
				s2.add(s1.charAt(i));
			}
//			System.out.println(s);
			for(int i=0;i<p.size();i++) {
				int temp = s.indexOf(p2[i]);
				s.remove(temp);
			}
			Collections.sort(s2);//sorted s
//			System.out.println(s);
//			System.out.println(s2);
			for(int i=1;i<p.size();i++) {
				int temp = s2.indexOf(p2[i]);
				s2.remove(temp);
			}
//			System.out.println(s2);
			if(s2.contains(p2[0])) {
				int fre = Collections.frequency(s2, p2[0]);
				int index = s2.indexOf(p2[0]);
				s2.remove(index);
				int index2 = index + fre - 1;
				for(int i=0;i<p.size();i++) {
					s2.add(index2 + i, p2[i]); 
				}
			}
			System.out.println(s2);
			
			
			
			
			
			
			
			
//			int temp2 = s.indexOf(p2[0]) + Collections.frequency(s, p2[0])  + 1;
			
//			System.out.println(s);
//			for(int i=0;i<p.size();i++) {
//				s.add(temp2 + i, p2[i]);
//			}
//			System.out.println(s);
//			
			
			
//			for(int i=0;i< p.size();i++) {
//				if(s.contains()) {
//					
//				}
//			}
			
			
			t--;
		}
		
	}

}
