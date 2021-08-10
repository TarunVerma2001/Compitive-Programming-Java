package codechef;
import java.util.*;
public class ChefWars {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		while(t != 0) {
			
			long h = sc.nextLong();
			long p = sc.nextLong();
			for(int i=0;p > 0;i++) {
				if(h > 0) {
					if((h - p) <= 0) {
						h = h - p;
						break;
					}
					h = h - p;
					p = p / 2;
					
				} else {
					break;
				}
			}
			if(p <= 0) {
				System.out.println("0");
			}else if(h<=0) {
				System.out.println("1");
			}
			
			
			t -= 1;
		}
		

	}

}
