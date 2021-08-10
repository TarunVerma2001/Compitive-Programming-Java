package codechef;
import java.util.*;
public class PlayPiano {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t != 0) {
			
			boolean temp = true;
			String s = sc.nextLine();
			for(int i=0;i<s.length();i = i + 2) {
				if((s.charAt(i) == 'A' && s.charAt(i+1) == 'B') || (s.charAt(i) == 'B' && s.charAt(i+1) == 'A')) {
					continue;
				} else {
					temp = false;
					break;
				}
			}
			if(temp == true) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			
			t = t - 1;
		}
		

	}

}
