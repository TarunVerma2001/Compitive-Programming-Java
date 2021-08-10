package novemberLong;
import java.util.*;
public class IronMagnetsAndWalls {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n , k;
			n =sc.nextInt();
			k = sc.nextInt();
			String s = new String();
			s = sc.next();
			int max = 0;
			int size = s.length();
			
			int lower = 0;
			int upper = n-1;
		
			for(int i = 0;i<size;i++) {
				int tempres = 0;
				boolean foundI = false;
				int condS = 0;
				int block = 0;
				if(s.charAt(i) == 'I') {
					if(i > upper) {
						lower = upper;
						upper = n - 1;
					}
					
					for(int j = i - 1;j>=lower;j--) {
						if(s.charAt(j) == ':') {
							condS++;
						} 
						if(s.charAt(j) == 'X') {
							lower = j;
							break;
						} 
						if(s.charAt(j) == 'M') {
							if((k + 1 - Math.abs(i - j) - condS) > 0) {
								tempres++;
								
							}
						}
					}
					
					for(int j = i+1;j<=upper;j++) {
						if(s.charAt(j) == ':') {
							condS++;
						} 
						if(s.charAt(j) == 'X') {
							upper = j;
							break;
						} 
						if(s.charAt(j) == 'M') {
							if((k + 1 - Math.abs(i - j) - condS) > 0) {
								tempres++;
								condS = 0;
							}
						}
					}
					if(tempres > max) {
						max = tempres;
					}
				}
			}
			System.out.println(max);
			
		}
		
	}

}
