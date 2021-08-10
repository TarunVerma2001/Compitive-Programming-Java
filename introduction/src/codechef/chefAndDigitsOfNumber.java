package codechef;

import java.util.*;

public class chefAndDigitsOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			String a = sc.next();
			int zero = 0;
			int one = 0;
			for(int j=0;j<a.length();j++) {
				if(a.charAt(j) == '0') {
					zero++;
				} else if(a.charAt(j) == '1'){
					one++;
				}
			}
			if(zero == 1 || one == 1) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			t--;
		}


	}

}
