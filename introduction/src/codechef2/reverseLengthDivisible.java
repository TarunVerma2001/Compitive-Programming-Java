package codechef2;
import java.util.*;
public class reverseLengthDivisible {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = new String();
		s = sc.next();
//		System.out.println(s);
		sc.nextLine();
		int l = s.length();
		char a[] = s.toCharArray();
		int t[] = new int[l];
		boolean res = true;
		int temp = 0;
		for(int i =1;i<=l;i++) {
//			System.out.println("t[" + (i-1) + "] : "+ a[i-1]);
			temp = (temp * 10) + Character.getNumericValue(a[i-1]);
//			System.out.println("temp : " + temp);
			if(temp % (l-i+1) != 0) {
				res = false;
				break;
			}
		}
		if(res == true) {
			System.out.println("Yes");
		} else {
			System.out.println("no");
		}

	}

}
