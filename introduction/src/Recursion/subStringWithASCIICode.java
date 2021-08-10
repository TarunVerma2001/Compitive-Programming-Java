package Recursion;

public class subStringWithASCIICode {

	public static void SubSeq(String s, String ans) {
		if(s.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		char ch = s.charAt(0);
		int code = ch;
		String ros = s.substring(1);
		SubSeq(ros, ans);
		SubSeq(ros, ans + ch);
		SubSeq(ros, ans + code);
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubSeq("AB", "");

	}

}
