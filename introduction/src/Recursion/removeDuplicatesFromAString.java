package Recursion;

public class removeDuplicatesFromAString {

	
	public static String removeDup(String s) {
		if(s.length() == 0) {
			return "";
		}
		
		char ch = s.charAt(0);	
		String ans = new String();
		ans = removeDup(s.substring(1));
		
		if(ans.charAt(0) == ch) {
			return ans;
		} 
		String temp = ch + ans;
		return (temp);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaaabbbeeecdddd";
		System.out.println(removeDup("aaaabbbeeecdddd"));
//		char a = 'a';
//		String b = "sklgjs";
//		System.out.println(();
	}

}
