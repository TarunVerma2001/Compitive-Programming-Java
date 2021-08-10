package novemberLong;
import java.util.*;;


public class IronMa2 {

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
			
			for(;Mg < n;Mg++) {
				if(a.get(Mg) == 'X') {
					Ir = Mg+ 1;
					System.out.println("Ir and Mg : " + Ir + " "+ Mg);
					continue;
				}
				if(s.charAt(Mg) == 'M') {
					System.out.println("found M and Mg = " + Mg);
					for(;Ir < n;Ir++) {
						if(a.get(Ir) == 'X') {
							System.out.println("Ir := " + Ir);
							
							System.out.println("Found X ");
							break;
						}
						if(a.get(Ir) == 'I') {
							System.out.println("found I");
							if(temp != Ir) {
								temp = Ir;
								System.out.println("temp & Ir : " + temp  + " "+ Ir);
								if(Ir > Mg) {
									int p = k - (Ir - Mg) - Collections.frequency(a.subList(Mg,  Ir), ':');
									
									System.out.println("p : " + p);
									if(p <= 0) {
										System.out.println("continue : ");
										continue;
									} else {
										answer++;
										System.out.println("answer in : " + answer);
										System.out.println("break");
										break;
									}
								} else {
									int p = k - (Mg - Ir) - Collections.frequency(a.subList(Ir, Mg), ':');
									System.out.println("p : " + p);
									if(p <= 0) {
										System.out.println("break");
										break;
									} else {
										answer ++;
										System.out.println("answer in : " + answer);
										System.out.println("break");
										break;
									}
								}
							} else {
								System.out.println("Continue");
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
