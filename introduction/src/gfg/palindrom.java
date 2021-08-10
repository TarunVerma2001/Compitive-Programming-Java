package gfg;
import java.util.*;
public class palindrom {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int temp = n/2;
	        Stack<Integer> st = new Stack<Integer>();
	        for(int i=0;i<temp;i++){
	            st.push(head.data);
	            head = head.next;
	        }
	        head = head.next;
	        for(int i=0;i<temp;i++) {
	        	int temp2 = head.data;
	        	head = head.next;
	        	if(st.pop() == temp2) {
	        		continue;
	        		
	        	}else {
	        		return 0;
	        	}
	        }
	        return 1;
		
	}

}
