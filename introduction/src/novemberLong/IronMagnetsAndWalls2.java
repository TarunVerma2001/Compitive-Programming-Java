package novemberLong;
import java.util.*;
public class IronMagnetsAndWalls2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int t= sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			k++;
			String s = new String(sc.next());
			int Ir = 0;
			int Mg = 0;
			int answer = 0;
			int temp = -1;
			List<Character> a = new ArrayList<Character>();
			for(int i= 0;i<n;i++) {
				a.add(s.charAt(i));
			}
			
			for(;Ir < n;Ir++) {
				if(a.get(Ir) == 'X') {
					Mg = Ir;
				}
				if(s.charAt(Ir) == 'I') {
					for(;Mg < n;Mg++) {
						if(a.get(Mg) == 'M') {
							if(temp != Mg) {
								temp = Mg;
								if(Ir > Mg) {
									int p = k - (Ir - Mg) - Collections.frequency(a.subList(Mg,  Ir), ':');
									if(p <= 0) {
										continue;
									} else {
										answer++;
										break;
									}
								} else {
									int p = k - (Mg - Ir) - Collections.frequency(a.subList(Ir, Mg), ':');
									if(p <= 0) {
										break;
									} else {
										answer ++;
										break;
									}
								}
							} else {
								continue;
							}
						}
					}
				}
			}
			System.out.println(answer);
			
		}
		

	}

}
