package codeforces;
import java.util.*;
import java.lang.String;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		for(int i = 0;i<n;i++) {
			String s = new String();
			s = sc.next();
			if(s.length() > 10) {
				int size = s.length();
				char a = s.charAt(0);
				char b = s.charAt(size-1);
				size -= 2;
				System.out.println(a + "" + size + "" + b);
			} else {
				System.out.println(s);
			}
			
		}
	}

}
