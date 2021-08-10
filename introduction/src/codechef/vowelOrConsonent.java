package codechef;

import java.util.*;
public class vowelOrConsonent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Character> vowel = new ArrayList<>();
		vowel.add('A');
		vowel.add('E');
		vowel.add('I');
		vowel.add('O');
		vowel.add('U');
		
		char a;
		a = sc.next().charAt(0);
		if(vowel.contains(a)) {
			System.out.println("Vowel");
		} else {
			System.out.println("Consonent");
		}
		
		
	}

}
