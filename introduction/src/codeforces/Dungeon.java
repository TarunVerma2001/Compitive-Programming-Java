package codeforces;
import java.util.*;
public class Dungeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o = 0;o<t;o++) {
			int a, b, c;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if(a == b && a == c) {
				if(a % 3 != 0) {
					System.out.println("No");
				}
			}
		}
		
	}

}
