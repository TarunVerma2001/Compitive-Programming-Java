package interviewQuestions;

import java.util.*;

public class GroupAnagrams {

	public static void main(String[] args) {

		/* there are various string
		 * group similar anagrams together
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String strs[] = new String[n];
		for(int i=0;i<n ;i++) {
			strs[i] = sc.next();
		}
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for(String s : strs) {
			char charArray[] = s.toCharArray();
			Arrays.sort(charArray);
			String sorted = new String(charArray);
			
			if(!map.containsKey(sorted)) {
				map.put(sorted, new LinkedList<String>());
			}
			map.get(sorted).add(s);
		}
		System.out.println(new LinkedList<>(map.values()));
		
		
		
	}

}
