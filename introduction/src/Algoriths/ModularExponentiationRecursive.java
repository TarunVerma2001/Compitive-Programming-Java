package Algoriths;

public class ModularExponentiationRecursive {

	public static int Modular(int A, int B, int C) {
		if(A == 0) 
			return 0;
		if(B == 0)
			return 1;
		long y;
		if((B & 1) == 0) {
			y = Modular(A, B/2, C);
			y =(y * y) % C;
			
		}
		else {
			y = A % C;
			y = (y * Modular(A, B-1, C) % C) % C;
			
		}
		return (int) ((y + C) % C);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int y = 5;
		int p = 13;
		System.out.println(Modular(x, y, p));

	}

}
