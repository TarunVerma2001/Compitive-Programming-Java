package AugustLunchtime2020;
import java.util.*;
public class Coronaspread {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		while(t != 0) {
			long n = 0;
			List<Integer> vel = new ArrayList<Integer>();
			List<Integer> a = new ArrayList<Integer>();
			for(int i =0;i<n;i++) {
				vel.add(sc.nextInt());
			}
			for(int i =0;i<n;i++) {
				long l, r, x = 0, y = 0;
				for(l = i;l>=0;l--) {
					if(vel.get((int)l) > vel.get((int)i)) {
						x++;
					}
				}
				for(r = i;r<n;r--) {
					if(vel.get((int)r) < vel.get((int)i)) {
						y++;
					}
				}
				a.add((int)(x+y));
			}
			long min = a.get(0);
			long max = a.get(0);
			for(int i = 0;i<n;i++) {
				if(a.get(i) < min) {
					min = a.get(i);
				}
				if(a.get(i) > max) {
					max = a.get(i);
				}
			}
			min += 1;
			max += 1;
			System.out.println(min + " " + max);
			
			t--;
		}

	}

}
