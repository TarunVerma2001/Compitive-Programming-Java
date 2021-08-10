package DecemberLongChallenge;
import java.util.*;
public class evenPairSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long t = sc.nextLong();
		for(long o =0;o<t;o++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long x = a/2;
			long y = b / 2;
			
//			long a1[] = new long[x];
//			long a2[] = new long[a-x];
//			long b1[] = new long[y];
//			long b2[] = new long[b-y];
//			
			long x1 = a-x;
			long y1 = b - y;
//			System.out.prlongln(x +" " + x1 + " " + y +" " + y1);
			
			long ans = ((x*y) + (y1*x1));
			System.out.println(ans);
			
		}

	}

}
