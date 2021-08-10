package RecursionPractice;

public class towerOfHanoi {

	public static void Solve(int n, char source, char des, char helper) {
		
		if(n == 0) {
			return;
		}
		Solve(n-1, source, helper, des);
		System.out.println("moved from : " + source + " to " + des);
		Solve(n-1, helper, des, source);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solve(3, 'A', 'C', 'B');
		
	}
}
