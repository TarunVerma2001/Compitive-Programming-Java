package Algoriths;

public class modularExponentiation {

	public static int Modular(int x, int y, int p) {
		int res = 1;
		x = x%p;
		if(x == 0) {
			return 0;
		}
		while(y > 0) {
			if((y & 1 )== 1) {
				res = (res*x) % p;
			}
			
			y = y >> 1;
			x = (x*x) % p;
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 2;
		int y = 5;
		int p = 13;
		System.out.println(Modular(x, y, p));
		
	}

}
