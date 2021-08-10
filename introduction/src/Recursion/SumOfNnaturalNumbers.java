package Recursion;

public class SumOfNnaturalNumbers {

	public static int recur(int n) {
		if( n == 1 ) {
			return 1;
		}
		
		return (recur(n-1) + n);
	}
	
	public static void main(String[] args) {
		
		System.out.println(recur(5));
		
	}
	
}
