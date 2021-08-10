package codechef2;
import java.util.*;
public class Ascii {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			if(n >= 8) {
				n = n % 7;
			} 
			if (n % 7 == 0) {
				System.out.println("83");
			}
			
			switch (n) {
			case 1 :
				System.out.println("83");
				break;
			case 2 :
				System.out.println("83 83");
				break;
			case 3 :
				System.out.println("83 83 69");
				break;
			case 4 :
				System.out.println("83 83 69 67");
				break;
//			case 7 :
//				System.out.println("83");
//				break;
			case 6 :
				System.out.println("83 83");
				break;
			case 5 :
				System.out.println("83 83 69");
				break;
			default:
				break;
			}
		}
		
		
	}

}
