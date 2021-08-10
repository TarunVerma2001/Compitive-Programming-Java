package Recursion;
import java.util.*;
public class nFactorial {

	public static int Factorial(int n) {
		
		if(n == 0) {
			return 1;
		}
		int PrevFact = Factorial(n-1);
		return n * PrevFact;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println(Factorial(5));
		
	}

}
