package RecursionAdvance;

public class boardgame {

	public static int countPath(int s, int e) {
		if(s == e) {
			return 1;
		}
		if(s > e) {
			return 0;
		}
		int count = 0;
		for(int i =1;i<=6;i++) {
			count += countPath(s + i, e);
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countPath(0, 3));
		
	}

}
