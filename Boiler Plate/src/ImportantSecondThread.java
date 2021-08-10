import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.StringTokenizer;
public class ImportantSecondThread {
	 
	static Random r = new Random();

	static ArrayList<Long> getPrimeFactors(long n) {
		ArrayList<Long> factors = new ArrayList<>();
		getPrimeFactors(n, factors);
		// Collections.sort(factors); if you want multiplicities in a row
	return factors;
	}
	
	static void getPrimeFactors(long n, ArrayList<Long> factors) {
		if (n <= 1) {
		} else if (BigInteger.valueOf(n).isProbablePrime(30))  factors.add(n);
		else {
			long d = rho(n);  getPrimeFactors(d, factors);
			getPrimeFactors(n / d, factors);
		}
	}
	
	// returns a small non-trivial divisor of n (n must not be prime)
	static long rho(long n) {
		if (n <= 3)  return -1;
		if ((n & 1) == 0)  return 2;
		long x, y, d;  BigInteger ab, nb;

		nb = BigInteger.valueOf(n);
		do {
			ab = BigInteger.valueOf(Math.abs(r.nextInt(100_000)) + 2);
			x = y = Math.abs(r.nextInt(100_000)) + 2;
			do {
				x = poly(x, ab, nb);  y = polypoly(y, ab, nb);
				d = gcd(n, Math.abs(x - y));
			} while (d == 1);
		} while (d == n);
		return d;
	}

	static long poly(long x, BigInteger ab, BigInteger nb) {
		BigInteger xb = BigInteger.valueOf(x);
		return xb.multiply(xb).add(ab).mod(nb).longValue();
	}

	static long polypoly(long x, BigInteger ab, BigInteger nb) {
		BigInteger xb = BigInteger.valueOf(x), p = xb.multiply(xb).add(ab);
		return p.multiply(p).add(ab).mod(nb).longValue();
	}


	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	static long gcd(long a, long b) {
		return b==0?a:gcd(b, a%b);
	}
}
