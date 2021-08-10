package Recursion;

//import javax.sound.sampled.ReverbType;

public class reverseAStringByRecursion {
	
	public static void Reverse(String s) {
		if(s.length() == 0) {
			return;
		}
		String ros = s.substring(1);
		Reverse(ros);
		System.out.println(s.charAt(0));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String();
		s = "binod";
		Reverse(s);
		
	}

}
