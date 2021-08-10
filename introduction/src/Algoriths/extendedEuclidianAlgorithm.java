package Algoriths;

public class extendedEuclidianAlgorithm {

	public static void main(String[] args) {

		int x=1, y=1; 
        int a = 30, b = 20; 
        int g = ExtendedEuclidian(a, b, x, y); 
        System.out.print("gcd(" + a +  " , " + b+ ") = " + g);
	}
		public static int ExtendedEuclidian(int a, int b, int x, int y) {
			if(a == 0) {
				x = 0;
				y = 1;
				System.out.println("Hey");
				return b;
			}
			int x1 = 1, y1 = 1;
			System.out.println("Hii");
			int gcd = ExtendedEuclidian(b%a, a, x1, y1);
			System.out.println("Hello");
			System.out.println("gcd in fxn : " + gcd);
			System.out.println("y1 : " + y1);
			System.out.println(" b : "+ b + " a : " + a);
			x = y1 -(b/a)*x1;
			
			System.out.println("x in fxn : " + x);
			y = x1;
			System.out.println("x1 : " + x1);
			System.out.println("y in fxn : " + y);
			
			return gcd;
		}

}
