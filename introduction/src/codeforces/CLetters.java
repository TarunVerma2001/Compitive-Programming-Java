package codeforces;
import java.util.*;
public class CLetters {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long[] a = new long[(int)n];
		long[] b = new long[(int)m];
		for(long i =0;i<n;i++) {
			a[(int)i] = sc.nextLong();
		}
		for(long i =0;i<m;i++) {
			b[(int)i] = sc.nextLong();
		}
		long temp = 0;
		long res = 0;
		for(long i =0;i<m;i++) {
			res = 0;
			temp = b[(int)i];
			for(long j = 0;temp - a[(int)j] > 0;j++) {
				temp -= a[(int)j];
				res ++;
			}
			if(temp == 0) {
				System.out.println(res + " " +a[(int)res-1]);
			} else {
				System.out.println((res + 1) + " "+temp);
			}
		}
		
		
	}

}
