package codechefLunchMarch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A2 {

	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tt = 0;tt<t;tt++) {
			long a = sc.nextLong();
			long y = sc.nextLong();
			long x = sc.nextLong();

			long res;
			if(y == a) {
				res = a * x;
			} else if(y > a) {
				res = a*x + 1;
			} else {
				res = y * x;
			}
			System.out.println(res);
		}
		
	}
	

}
