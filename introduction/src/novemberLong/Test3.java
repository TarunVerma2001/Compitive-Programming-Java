package novemberLong;
import java.util.*;
public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			k++;
			String s = sc.next();
			int Answer = 0;
			String st[] = s.split("X");
			for(int i = 0;i<st.length;i++) {
//				Queue<Integer> Mag = new LinkedList<Integer>();
//				Queue<Integer> Iron = new LinkedList<Integer>();
				List<Integer> Mag = new ArrayList<Integer>();
				List<Integer> Iron = new ArrayList<Integer>();
				for(int j = 0;j<st[i].length();j++) {
					if(st[i].charAt(j) == 'M') {
						Mag.add(j);
					}
					else if(st[i].charAt(j) == 'I') {
						Iron.add(j);
					}
				}
				for(int M = 0;M<Mag.size();M++) {
					for(int I = 0;I<Iron.size();I++) {
						int Sh = 0;
						if(Mag.get(M) < Iron.get(I)) {
							for(int x = Mag.get(M);x<=Iron.get(I);x++) {
								if(st[i].charAt(x) == ':')
									Sh ++;
							}
							int p = k -(Iron.get(I) - Mag.get(M)) - Sh;
							if(p > 0) {
								Answer++;
								Mag.remove(M);
								Iron.remove(I);
								break;
							} else {
								Iron.remove(I);
								break;
							}
						} else {
							for(int x = Iron.get(I);x<=Mag.get(M);x++) {
								if(st[i].charAt(x) == ':')
									Sh ++;
							}
							int p = k -(Mag.get(M) - Iron.get(I)) - Sh;
							if(p > 0) {
								Answer ++;
								Iron.remove(I);
								Mag.remove(M);
								break;
							} else {
								continue;
							}
							
						}
					}
				}
				
				
			}
			System.out.println(Answer);
		}
	}

}
