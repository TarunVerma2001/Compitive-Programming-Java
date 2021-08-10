package stackUsingArray;
import java.util.*;
public class PalindromOrNot {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();
		int temp = s.length();
		MyStack palindrom = new MyStack(temp);
		for(int i=0;i<temp;i++) {
			palindrom.push(s.charAt(i));
		}
		String res = new String();
		for(int i=0;i<temp;i++) {
			res = res + palindrom.pop();
		}
		palindrom.printStack();
		
		System.out.println(s);
		System.out.println(res);
		if(res == s) {
			System.out.println("string is palindrom");
		} else {
			System.out.println("string is not palindrom");
		}
		
	}

}
