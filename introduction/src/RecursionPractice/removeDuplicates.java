package RecursionPractice;

public class removeDuplicates {

	public static String solve(String s) {
		if(s.length() == 1) {
			return s;
		}
		if(s.charAt(0) == s.charAt(1)) {
			return solve(s.substring(1));
		} else {
			return s.charAt(0) + solve(s.substring(1));
		}
	}
	
	public static void main(String[] args) {
		String s = "abbbbbbbbbbaaaaaaaabcdeaaaa";
		String ans = solve(s);
		System.out.println(ans);
	}
	
	
}
