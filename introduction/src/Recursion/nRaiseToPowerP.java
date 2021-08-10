package Recursion;
import java.util.*;
public class nRaiseToPowerP {

	public static int Power(int n, int p) {
		
		if(p == 0) {
			return 1;
		}
		
		int prevPower =Power(n, p-1);
		return n * prevPower;
	}
	
	
	public static int fastPower(int n, int p) {
		
		if( p == 0 ) {
			return 1;
		}
		
		if(p % 2 == 0) {
			return fastPower(n*n, p/2);
		} else {
			return (n * fastPower(n, p-1));
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fastPower(4, 3));
		
	}

}
