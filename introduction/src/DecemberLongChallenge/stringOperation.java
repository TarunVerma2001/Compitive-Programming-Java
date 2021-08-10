package DecemberLongChallenge;
import java.util.*;
public class stringOperation {
	
	
	public static int Count(String s) {
		int count = 0;
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			String s = new String();
			s = sc.next();
			ArrayList<ArrayList<String>> Vector = new ArrayList<ArrayList<String>>();
			for(int i = 0;i<=1000;i++) {
				ArrayList<String> temp = new ArrayList<String>();
				Vector.add(temp);
			}
			for(int i =0;i<s.length();i++) {
				for(int j = 0;j<s.length()-i+1;j++) {
//					System.out.println(s.substring(j, j+i));
					Vector.get(i).add(s.substring(j, j+i));
				}
			}
			
			
			
			
			Vector.get(s.length()).add(s);
			System.out.println(Vector);
//			System.out.println(Vector);
//			Map<String, Boolean> map = new HashMap<String, Boolean>();
//			for(int i =1;i<=s.length();i++) {
//				if(!Vector.get(i).isEmpty()) {
//					String temp = new String();
//					map.put(temp, false);
//					Vector.get(i).remove(0);
//					if(Vector.get(i).contains(s)) {
//						
//					}
//				}
//			}
			ArrayList<String> res = new ArrayList<String>();
			for(int i =1;i<=s.length();i++) {
				while(!Vector.get(i).isEmpty()) {
					String st = new String();
					st = Vector.get(i).get(0);
					res.add(st);
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(st);
					if(Count(st) % 2 == 0) {
//						System.out.println(Count(st));
						StringBuilder st1 = new StringBuilder();
						st1.append(st);
						st1 = st1.reverse();
						String sTemp = new String();
						sTemp = st1.toString();
						ArrayList<String> temp2 = new ArrayList<String>();
						temp2.add(sTemp);
						Vector.get(i).removeAll(temp2);
					}
					
					
					
//					System.out.println("temp ArrayList : " + temp);
					Vector.get(i).removeAll(temp);
					temp.clear();
//					temp.add(st1.toString());
//					Vector.get(i).removeAll(temp);
				}
			}
//			System.out.println(res);
			System.out.println(res.size());
		}

	}

}
