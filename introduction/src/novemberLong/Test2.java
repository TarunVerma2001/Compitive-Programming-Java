package novemberLong;
import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner (System.in);
			int t = sc.nextInt();
			for(int o =0;o<t;o++) {
//				String st = sc.nextLine();
//				System.out.println(st);
//				String nt[] = st.split(" ");
//				System.out.println("length : " + nt.length);
//				System.out.println(nt[0]);
//				System.out.println(nt[1]);
//			    int n = Integer.parseInt(nt[0]);
//				int k = Integer.parseInt(nt[1]);
				int n = sc.nextInt();
				int k = sc.nextInt();
//				String np = sc.next();
//				System.out.println();
//				String nt[] = np.split(" ");
//				int n = Integer.parseInt(nt[0]);
//				int k = Integer.parseInt(nt[1]);
				int count = 0;
				Queue<Integer> Mg = new LinkedList<Integer>();
				Queue<Integer> Ir = new LinkedList<Integer>();
//				List<Integer> Mg = new ArrayList<Integer>();
//				List<Integer> Ir = new ArrayList<Integer>();
				k++;
				String s = sc.next();
				for(int i =0;i<n;i++) {
					if(s.charAt(i) == 'X') {
						count += solveAns(s, k, Mg, Ir);
						Mg.clear();
						Ir.clear();
					} else if(s.charAt(i) == 'I') {
						Ir.add(i);
					} else if(s.charAt(i) == 'M') {
						Mg.add(i);
					}
					
				}
				System.out.println(Mg + " 0 " + Ir);
				count += solveAns(s, k, Mg, Ir);
				System.out.println(count);
			}
		} catch(Exception e) {
			return;
		}
	}
	public static int solveAns(String s, int k, Queue<Integer> Mag, Queue<Integer> Iron) {
		
		System.out.println("Mag : " + Mag);
		System.out.println("Iron : " + Iron);
		System.out.println("Mag.peek() : " + Mag.element());
		int ans = 0;
		for(int x = 0;Mag.isEmpty() == false;x++) {
			System.out.println("in for 1");
			System.out.println(Mag);
			System.out.println("Mag.peek() : " + Mag.element());
			if(Iron.isEmpty() == true) {
				Mag.clear();
			}
			for(int y = 0;Iron.isEmpty() == false;y++) {
				System.out.println("i while 2");
				int Sh = 0;
				if(Mag.element() < Iron.element()) {
					for(int i = Mag.element();i<=Iron.element();i++) {
						if(s.charAt(i) == ':') {
							Sh++;
						}
					}
					System.out.println("Sh : " + Sh);
					int p = k - (Iron.element() - Mag.element()) - Sh;
					System.out.println("p : " + p);
					if(p > 0) {
						ans++;
						Mag.remove();
						Iron.remove();
						System.out.println("Mag : " + Mag);
						System.out.println("Iron : " + Iron);
						break;
					} else {
						Mag.remove();
						System.out.println("Mag : " + Mag);
						System.out.println("Iron : " + Iron);
						break;
					}
				} else {
					for(int i = Iron.element();i<=Mag.element();i++) {
						if(s.charAt(i) == ':') {
							Sh++;
						}
					}
					int p = k - (Mag.element() - Iron.element()) - Sh;
					if(p > 0) {
						ans++;
						Mag.remove();
						Iron.remove();
						System.out.println("Mag : " + Mag);
						System.out.println("Iron : " + Iron);
						break;
					} else {
						Iron.remove();
						System.out.println("Mag : " + Mag);
						System.out.println("Iron : " + Iron);
						continue;
					}
				}
			}
		}
//			else {
//			for(int M = 0;M < Mag.size();M++) {
//				System.out.println("M : " +M);
//				for(int I = 0;I<Iron.size();I++) {
//					System.out.println("I : " + I);
//					int Sh = 0;
//					if(Mag.get(M) < Iron.get(I)) {
//						System.out.println("In compare");
//						System.out.println("Mag.get(M) : "+Mag.get(M));
//						System.out.println("Iron.get(I) : "+Iron.get(I));
//						System.out.println(Mag.size());
//						System.out.println(Iron.size());
//						System.out.println("in if :");
//						for(int p = Mag.get(M);p<=Iron.get(I);p++) {
//							if(s.charAt(p) == ':') {
//								Sh++;
//							}
//						}
//						System.out.println("Sh : " + Sh);
//						int p = k - (Iron.get(I) - Mag.get(M)) - Sh;
//						System.out.println("p : " + p);
//						if(p > 0) {
//							ans++;
////							Mag.remove(M);
//							Iron.remove(I);
//							System.out.println("Mag : " + Mag);
//							System.out.println("Iron : " + Iron);
//							break;
//						} else {
////							Mag.remove(M);
//							System.out.println("Mag : " + Mag);
//							System.out.println("Iron : " + Iron);
//							break;
//						}
//					} else {
//						System.out.println("in else :");
//						for(int p = Iron.get(I);p<=Mag.get(M);p++) {
//							if(s.charAt(p) == ':') {
//								Sh++;
//							}
//						}
//						System.out.println("Sh : " + Sh);
//						int p = k - (Iron.get(I) - Mag.get(I)) - Sh;
//						if(p > 0) {
//							ans++;
////							Mag.remove(M);
//							Iron.remove(I);
//							System.out.println("Mag : " + Mag);
//							System.out.println("Iron : " + Iron);
//							break;
//						} else {
//							System.out.println("Mag : " + Mag);
//							System.out.println("Iron : " + Iron);
//							continue;
//						}
//						
//					}
//					
//				}
//			}
//		}
		
		return ans;
	}
}
