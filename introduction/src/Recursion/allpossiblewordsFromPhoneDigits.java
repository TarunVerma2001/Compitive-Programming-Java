package Recursion;

public class allpossiblewordsFromPhoneDigits {

	static String keypadArr[] = {"", "./", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	public static void keypad(String s, String ans) {
		if(s.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = s.charAt(0);
		String code = keypadArr[ch-'0'];
		String ros = s.substring(1);
		
		for(int i = 0;i<code.length();i++) {
			keypad(ros, ans + code.charAt(i));
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keypad("", "");

	}

}
