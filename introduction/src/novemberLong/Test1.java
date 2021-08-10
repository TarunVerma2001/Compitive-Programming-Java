package novemberLong;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			k++;
			int Ir = 0;
			String s = new String(sc.next());
//			List<String> a = new ArrayList<String>();
			String[] a = s.split("X");
			for(int i = 0;i<a.length;i++) {
				if(a[i].contains("I") == true && a[i].contains("M") == true) {
					for(int Mg = 0;Mg<a[i].length();Mg++) {
						if(a[i].charAt(Mg) == 'M') {
							for(;Ir < a[i].length();Ir++) {
								if(a[i].charAt(Ir) == ':') {
									
								}
								if(a[i].charAt(Ir) == 'I') {
									if(Ir > Mg) {
										int p = k - (Ir - Mg) - ;
									}
								}
							}
						}
					}
				}
			}
			
		}
		
	}

}
