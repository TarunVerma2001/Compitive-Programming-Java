package RecursionPractice;

public class printNumbersTillN {

	public static void Pdec(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		Pinc(n-1);
		
	}
	public static void Pinc(int n) {
		if(n == 0) {
			return;
		}
		
		Pinc(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pinc(10);
		Pdec(10);
	}

}
