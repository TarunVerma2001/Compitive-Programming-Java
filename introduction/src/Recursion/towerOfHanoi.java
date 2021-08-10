package Recursion;

public class towerOfHanoi {

	public static void toh(int n, char src, char des, char helper) {
		if(n == 0) {
			return;		//base case
		}
		
		toh(n-1, src, helper, des);
		System.out.println("moved from " + src + " to " + des);
		toh(n-1, helper, des, src);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		toh(3, 'A', 'C', 'B');
		
	}

}
