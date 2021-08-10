package codechef2;
import java.util.*;
public class luckyTicket {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		    while(t != 0){
		        
		        String s = new String(sc.next());
		        int size = s.length();
		        char a = s.charAt(0);
		        char b = s.charAt(1);
		        boolean p = true;
		        boolean q = false;
		        if(size == 2) {
		        	if(a != b) {
		        		System.out.println("YES");
		        		continue;
		        	} else{
		        		System.out.println("NO");
		        		continue;
		        	}
		        }
		        if(a != b) {
			        if(size % 2 == 0) {
			        	for(int i =0;i<size -1;i++) {
			        		if(s.charAt(i) != a) {
			        			p = false;
			        			break;
			        		}
			        		i++;
			        	}
			        	for(int i = 1;i<size;i++) {
			        		if(s.charAt(i) != b) {
			        			q = false;
			        			break;
			        		}
			        		i++;
			        	}
			        } else {
			        	for(int i =0;i<size;i++) {
			        		if(s.charAt(i) != a) {
			        			p = false;
			        			break;
			        		}
			        		i++;
			        	}
			        	for(int i = 1;i<size-1;i++) {
			        		if(s.charAt(i) != b) {
			        			q = false;
			        			break;
			        		}
			        		i++;
			        	}
			        }
			        if(p == false || q == false) {
			        	System.out.println("NO");
			        } else {
			        	System.out.println("YES");
			        }
		        } else {
		        	System.out.println("NO");
		        }
		        t--;
		    }   

	}

}
