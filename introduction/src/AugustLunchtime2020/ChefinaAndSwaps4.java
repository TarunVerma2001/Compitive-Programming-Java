package AugustLunchtime2020;
import java.util.*;

public class ChefinaAndSwaps4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		for(int o =0;o<t;o++) {
			
			long n = sc.nextLong();
			long sum = n*(n+1)/2;
//			long half = sum / 2;
//			long result = 0;
			if(sum % 2 != 0) {
				System.out.println("0");
				continue;
			}
			long indx = fn(sum);
			long ss = indx *( indx + 1 ) / 2;
			if(sum / 2 == ss) {
				long out = ((indx - 1) * indx / 2) + ((n - indx - 1)*(n - indx) / 2) + (n - indx);
				
				System.out.println(out);
			} else {
				System.out.println(n - indx);
			}
			
		
		
	}
}

		public static long fn(long sm) {
			long a = (long)Math.sqrt((long)1 + (long)4 *sm);
			a = (a - 1) / 2;
			return a;
		}
}
