package FabruaryLongChallenge;

import java.util.*;

public class teamName2 {
	
	
	
	public static boolean isFunny(String a, String b, HashSet<String> f) {
		char f1 = a.charAt(0);
		char f2 = b.charAt(0);
		a = a.substring(1);
		b = b.substring(1);
		a = f2 + a;
		b = f1 + b;
		return (f.contains(a) && f.contains(a));
	}
	
	public static String swap(String a, String b) {
		char temp = a.charAt(0);
		String temp2 = b.substring(1);
		return (temp + temp2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int tt = 0;tt<t;tt++) {
			int n = sc.nextInt();
			HashSet<String> nf = new HashSet<String>();
			HashSet<String> f = new HashSet<String>();
//			ArrayList<String> s = new ArrayList<String>();
			for(int i = 0;i<n;i++) {
				String temp = sc.next();
				f.add(temp);
			}	
//			System.out.println(f);
			Iterator<String> i1 = f.iterator();
			
			while(i1.hasNext()) {
				String temp = i1.next();
//				System.out.println("temp : " + temp);
				Iterator<String> i2 = f.iterator();
				while(i2.hasNext()) {
					String temp2 = i2.next();
//					System.out.println("temp2 : " + temp2);
					nf.add(swap(temp, temp2));
				}
			}
//			System.out.println(nf);
			nf.removeAll(f);
			int ans = 0;
//			System.out.println(nf);
			i1 = nf.iterator();
			while(i1.hasNext()) {
				String temp = i1.next();
				Iterator<String> i2 = nf.iterator();
				while(i2.hasNext()) {
					String temp2 = i2.next();
					if(temp != temp2) {
						if(isFunny(temp, temp2, f)) {
							ans++;
						}
					}
				}
			}
			System.out.println(ans);
		}

	}

}
