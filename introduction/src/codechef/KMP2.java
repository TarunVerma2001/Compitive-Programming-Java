package codechef;
import java.util.*;
public class KMP2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if(t > 10) {
			t = 10;
		}
		while(t != 0) {
			String s = new String();
			String p = new String();
			s = sc.next();
			p = sc.next();
			System.out.println(s);
			System.out.println(p);
			for(int i=0;i<p.length();i++) {
				int temp = s.indexOf(p.charAt(i));
				s = charRemoveAt(s, temp);
			}
//			System.out.println(s);
			String n = new String();
			n = inPlaceReverse(sortString(s.concat(Character.toString(p.charAt(0)))));
			System.out.println(s);
			s = sortString(s);
//			System.out.println(s);
//			System.out.println(n);
//			System.out.println(s.substring(0, n.length() - n.indexOf(p.charAt(0)) -1));
//			System.out.println(s.substring(n.length() - n.indexOf(p.charAt(0)) - 1));
			if(s.contains(Character.toString(p.charAt(0))) == false) {
				System.out.println(s.substring(0, n.length() - n.indexOf(p.charAt(0)) -1) + p + s.substring(n.length() - n.indexOf(p.charAt(0)) - 1) );
			}else {
				String air = new String();
				air = s.substring(0, s.indexOf(p.charAt(0))) + p +  s.substring(s.indexOf(p.charAt(0)) ) ;
				String air2 = new String();
				air2 = s.substring(0, n.length() - n.indexOf(p.charAt(0)) -1) + p + s.substring(n.length() - n.indexOf(p.charAt(0)) - 1);
				if(air.compareTo(air2) > 0) {
					System.out.println(air2);
				} else {
					System.out.println(air);
				}
				
			}
			t--;
		} 
		
	}
	public static String charRemoveAt(String str, int p) {  
        return str.substring(0, p) + str.substring(p + 1);  
     } 
	public static String sortString(String inputString) 
    { 
        // convert input string to char array 
        char tempArray[] = inputString.toCharArray(); 
          
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string 
        return new String(tempArray); 
    } 
	public static class StringFormatter {  
		public static String reverseString(String str){  
		    StringBuilder sb=new StringBuilder(str);  
		    sb.reverse();  
		    return sb.toString();  
		}  
	}
	
	public static String inPlaceReverse(final String input) {
		StringBuilder builder = new StringBuilder(input);
        int length = builder.length();
        for (int i = 0; i < length / 2; i++) { 
        	char current = builder.charAt(i); 
        	int otherEnd = length - i - 1; 
        	builder.setCharAt(i, builder.charAt(otherEnd)); 
        	builder.setCharAt(otherEnd, current);
        }
        return builder.toString();

	}

	
}
