package Recursion;
import java.util.*;
public class increasingDecreasing {

	public static void Dec(int n) {
		if(n == 1) {
			System.out.println(1);
			return;
		}
		System.out.println(n);
		Dec(n-1);
	}
	public static void Inc(int n) {
		
		if(n == 1) {
			System.out.println(1);
			return;
		}
		Inc(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dec(5);
		System.out.println();
		Inc(5);

	}

}
