package codechef2;

import java.util.*;

public class Password {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			String s = new String(sc.next());
			char a[] = s.toCharArray();
			for(int i = 0;i<s.length();i++) {
				a[i] = (char)((int)a[i]-2);
//				System.out.println(a[i]);
			}
			String result = new String(a);
			System.out.println(result);
//			System.out.println(s);
		}
		
	}

}
