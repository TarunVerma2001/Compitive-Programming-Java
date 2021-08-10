package codeforces;
import java.util.*;
public class StringSimilarity {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			int n = sc.nextInt();
			String s = new String();
			s = sc.next();
			sc.nextLine();
			char a = s.charAt(n-1);
			List<Character> finale = new ArrayList<Character>();

			List<Character> finale2 = new ArrayList<Character>();
			for(int i=0;i<n;i++) {
				for(int j=i;j<=i+n-1;j++) {
					finale.add(s.charAt(j));
				}
				finale2.add(finale.get(i));
				finale.clear();
			}
			for(int i=0;i<finale2.size();i++) {
				System.out.print(finale2.get(i));
			}
			System.out.println();

		
			
			t--;
		}

	}

}
