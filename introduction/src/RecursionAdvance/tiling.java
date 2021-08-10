package RecursionAdvance;

public class tiling {

	public static int tilingWays(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return (tilingWays(n-1) + tilingWays(n-2));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(tilingWays(4));
		
	}

}
