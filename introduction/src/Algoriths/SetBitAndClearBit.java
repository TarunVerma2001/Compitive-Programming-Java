package Algoriths;

import java.util.*;

public class SetBitAndClearBit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x1, y1, x2, y2;
		System.out.println("Enter the number and the the digit you want to set :");
		y1 = sc.nextInt();
		x1 = sc.nextInt();
		System.out.println("Answer is : " + SetBit(x1, y1));
		
		System.out.println("Enter the number and the the digit you want to clear :");
		y2 = sc.nextInt();
		x2 = sc.nextInt();
		System.out.println("Answer is : " + ClearBit(x1, y1));
		
		
		

	}
	public static int SetBit(int x, int y) {
		int result = 0;
		result = (1<<x)|y;
		return result;
	}
	public static int ClearBit(int x, int y) {
		int result = 0;
		result = (1>>x)|y;
		return result;
	}
	

}
