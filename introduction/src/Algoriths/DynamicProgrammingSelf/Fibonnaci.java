package Algoriths.DynamicProgrammingSelf;

public class Fibonnaci {

	
	static int dp[] = new int[1000];
	public static void _inititialize() {
		for(int i =0;i<1000;i++) {
			dp[i] = -1;
		}
	}
	
	
	public static int Recursive(int n) {
		if(n == 1 || n == 0) {
			return n;
		}
		return Recursive(n-1) + Recursive(n-2);
		
		
	}
	public static int SolveByDP(int n) {
		if(dp[n] == -1) {
			if(n == 1 || n == 0)
				dp[n] = n;
			else {
				dp[n] = SolveByDP(n-1) + SolveByDP(n-2);
			}
		}
		return dp[n];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_inititialize();
		System.out.println(Recursive(9));
		
	}

}
