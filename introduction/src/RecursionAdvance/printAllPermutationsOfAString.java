package RecursionAdvance;

public class printAllPermutationsOfAString {

	public static void Permutation(String s, String ans) {
		if(s.length() == 0) {
			System.out.println(ans);
		}
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			String ros = s.substring(0, i) + s.substring(i+1);
			Permutation(ros, ans + ch);
		}
		
	}
	
	public static void main(String[] args) {
		
		Permutation("ABCDE", "");

	}

}
