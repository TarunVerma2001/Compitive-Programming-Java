package codechef;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			long a,b,c,x,y;
			a = sc.nextLong();
			b = sc.nextLong();
			c = sc.nextLong();
			x = sc.nextLong();
			y = sc.nextLong();
			
			if(x >= b && y>= c)
			{
				if(((x + y) - (b + c)) == a ) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			else {
				System.out.println("NO");
			}
		
			
		}
		
		
	}

}
