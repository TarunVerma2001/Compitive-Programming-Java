package Recursion;

public class replacePiBy314 {

	public static void Replace(String s) {
		
		if(s.length() == 0) {
			return;
		}
		if(s.charAt(0) == 'p' && s.charAt(1) == 'i') {
			String temp = "3.14";
			String s1 = s.substring(2);
			System.out.print(temp);
			Replace(s1);
		} else {
			System.out.print(s.charAt(0));
			String s1 = s.substring(1);
			Replace(s1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String();
		s = "pippxxppiixipi";
		Replace(s);
		
	}

}
