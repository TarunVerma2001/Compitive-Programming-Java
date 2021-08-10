package FabruaryLongChallenge;

import java.util.*;

public class teamNameF {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		
		for(int tt = 0;tt<t;tt++) {
			int ans = 0;
			HashSet<Character> common = new HashSet<Character>();
			HashMap<String, HashSet<Character>> map = new HashMap<String, HashSet<Character>>();
			int n = sc.nextInt();
			for(int i = 0;i<n;i++) {
				String temp = sc.next();
				char c = temp.charAt(0);
				temp = temp.substring(1);
				common.add(c);
				if(!map.containsKey(temp)) {
					HashSet<Character> tempC = new HashSet<Character>();
					tempC.add(c);
					map.put(temp, tempC);
				} else {
					HashSet<Character> tempC = map.get(temp);
					tempC.add(c);
					map.put(temp, tempC);
					
				}
				
				
			}
			ArrayList<HashSet<Character>> arr = new ArrayList<HashSet<Character>>();
			for(Map.Entry<String , HashSet<Character>> entry: map.entrySet()) {
				arr.add(entry.getValue());
			}
			for(int i = 0;i<arr.size();i++) {
				for(int j = i+1;j<arr.size();j++) {
					HashSet<Character> temp = new HashSet<Character>();
					temp.addAll(arr.get(i));
					temp.addAll(arr.get(j));
					int size = temp.size();
					ans += ((size - arr.get(i).size()) * (size - arr.get(j).size()));
				}
			}
			System.out.println( (2 *ans));
			
//			System.out.println(map);
//			System.out.println(arr);
		}
//		System.out.print("hows touy fpijdf ");
//		System.out.print("hows touy fpijdf ");
		
	}

}
