package Recursion;
import java.util.*;
public class FibonacciNumber {

	public static int Fib(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return Fib(n-1) + Fib(n-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Fib(8));
		
	}

}
