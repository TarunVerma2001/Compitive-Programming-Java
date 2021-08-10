package Recursion;

public class allSubStrings {

	public static void subSeq(String s, String ans) {
		if(s.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		char ch = s.charAt(0);
		String ros = s.substring(1);
		
		subSeq(ros, ans);
		subSeq(ros, ans + ch);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subSeq("ABC", "");

	}

}
