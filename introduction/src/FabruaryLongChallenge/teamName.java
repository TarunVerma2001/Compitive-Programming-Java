package FabruaryLongChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class teamName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int tt = 0;tt<t;tt++) {
			int n = sc.nextInt();
			HashSet<Character> first = new HashSet<Character>();
			HashSet<String> last = new HashSet<String>();
			ArrayList<String> s = new ArrayList<String>();
			for(int i = 0;i<n;i++) {
				String temp = sc.next();
				s.add(temp);
				first.add(temp.charAt(0));
				last.add(temp.substring(1));
			}	
			for(int i = 0;i<first.size();i++) {
				for(int j = 0;j<last.size();j++) {
//					String temp2 = first.
				}
			}
			Iterator<Character> i1 = first.iterator();
			Iterator<String> i2 = last.iterator();
			
			while(i1.hasNext()) {
				while(i2.hasNext()) {
					String temp2 = i1.next() + i2.next();
					
				}
			}
			
			
//			for(int i = 0;i<n;i++) {
//				System.out.println();
//			}
			
		}
	}

}
