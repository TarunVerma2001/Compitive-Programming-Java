package Recursion;

public class moveAllXtoLastOfTheString {

	public static String moveX(String s) {
		if(s.length() == 0) {
			return "";
		}
		char ch = s.charAt(0);
		String ans = moveX(s.substring(1));
		if(ch == 'x') {
			return (ans + ch);
		}
		return (ch + ans);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(moveX("axxbdxcefxhif"));
	}

}
