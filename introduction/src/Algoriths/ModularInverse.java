package Algoriths;

public class ModularInverse {

	public static void main(String[] args) {
		int a = 3, m = 11;
		  
        System.out.println("Modular multiplicative "+ 
                           "inverse is " + modInverse(a, m)); 
    } 

	public static int modInverse(int a, int m) 
    { 
        int m0 = m; 
        int y = 0, x = 1; 
  
        if (m == 1) 
            return 0; 
  
        while (a > 1) 
        { 
            // q is quotient 
            int q = a / m; 
  
            int t = m; 
  
            // m is remainder now, process 
            // same as Euclid's algo 
            m = a % m; // basic euclid algo commands
            a = t;  // this also
            t = y; // in this t act as a temp variable tostore y
            System.out.println("t : "+ t);
            System.out.println("x : " + x);
            // Update x and y 
            y = x - q * y; 
            System.out.println("y : " + y);
            x = t; 
            System.out.println(" x : " + x);
        } 
  
        // Make x positive 
        if (x < 0) 
            x += m0; 
  
        return x; 
    } 
	

}
