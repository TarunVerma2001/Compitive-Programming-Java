package novemberLong;
import java.util.*;
public class IronMag3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			k++;
			
			String s = new String(sc.next());
			List<Character> a = new ArrayList<>();
			List<List<Character>> temp = new ArrayList<List<Character>>();
			
			String[] S = s.split("X");
			int max = 0;
			int res = 0;
			for(int i = 0;i<S.length;i++) {
				if(S[i].contains("I") && S[i].contains("M")) {
					List<Character> tempa = new ArrayList<Character>();
					for(int j = 0;j<S[i].length();j++) {
//						a.add(S[i].charAt(j));
						tempa.add(S[i].charAt(j));
					}
					temp.add(tempa);
					System.out.println(temp);
					a.clear();
					System.out.println(temp);
				} else {
					continue;
				}
			}
			System.out.println(temp);
			for(int i = 0;i<temp.size();i++) {
				int I = Collections.frequency(temp.get(i), 'I');
				int M = Collections.frequency(temp.get(i), 'M');
				int Sh = Collections.frequency(temp.get(i), ':');
				//				for(int j =0;j<M;j++) {
//					int x = temp.get(i).indexOf('M');
//					
//				}
				int mag[] = new int[M];
				int iron[] = new int[I];
				int sheet[] = new int[Sh];
				int p = Math.max(I, M);
				int b = Math.max(p, Sh);
				
				for(int j = 0;j<M;j++) {
					int q = temp.get(i).indexOf('M');
					mag[j] = q;
					temp.get(i).set(q, '0');
				}
				for(int j = 0;j<I;j++) {
					int q = temp.get(i).indexOf('I');
					iron[j] = q;
					temp.get(i).set(q, '0');
				}
				for(int j = 0;j<Sh;j++) {
					int q = temp.get(i).indexOf(':');
					sheet[j] = q;
					temp.get(i).set(q, '0');
				}
				System.out.println(" mag ");
				for(int j = 0;j<M;j++) {
					System.out.print(mag[j] + " ");
				}
				System.out.println();
				System.out.println(" iron ");
				for(int j = 0;j<I;j++) {
					System.out.print(iron[j] + " ");
				}
				System.out.println();
				for(int j = 0;j<M;j++) {
					for(int u = 0;u<I;u++) {
						if((k - Math.abs(mag[j] - iron[u])) > 0) {
							max++;
						}
					}
					System.out.println("max :: " + max);
					if(res < max) {
						res = max;
						System.out.println("max : " + max);
						System.out.println("res : " + res);
						max = 0;
					} else {
						max = 0;
						System.out.println("max : " +max);
					}
				}
				
			}
			System.out.println(res);
			
	}
}

}
