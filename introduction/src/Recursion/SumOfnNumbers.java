package Recursion;
import java.util.*;
public class SumOfnNumbers {
	
	public static int Sum(int n) {

		if(n == 0) {
			return 0;
		}
		int PreSum = Sum(n-1);
		return n + PreSum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Sum(4));
	}

}
