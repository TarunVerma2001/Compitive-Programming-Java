package FabruaryLongChallenge;

import java.util.*;


public class MultipleGames {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(;t>0;t--) {
			int n = sc.nextInt();
			int q = sc.nextInt();
			int m = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for(int tt = 0;tt<q;tt++) {
				
				int l = sc.nextInt();
				l--;
				int r = sc.nextInt();
				r--;
				int tempArr[] = new int[r - l + 1];
				for(int i = l;i<=r;i++) {
					if(arr[i] > m) {
						break;
					}
					if(!map.containsKey(arr[i])) {
						map.put(arr[i], 1);
					} else {
						int temp = map.get(arr[i]);
						map.put(arr[i], temp+1);
					}
				}
			}
			List<Map.Entry<Integer, Integer> > list = 
		               new LinkedList<Map.Entry<Integer, Integer> >(map.entrySet()); 
		  
		    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
		        public int compare(Map.Entry<Integer, Integer> o1,  
		                               Map.Entry<Integer, Integer> o2) 
		        { 
		            return (o2.getValue()).compareTo(o1.getValue()); 
		        } 
		    }); 
		          
		        
		    HashMap<Integer, Integer> tempMap = new LinkedHashMap<Integer, Integer>(); 
		    for (Map.Entry<Integer, Integer> aa : list) { 
		        tempMap.put(aa.getKey(), aa.getValue()); 
		    }   
//		    System.out.println(tempMap);
		    Map.Entry<Integer,Integer> entry = tempMap.entrySet().iterator().next();
		    int key= entry.getKey();
		    System.out.println(key);
		        
		        
		        
		}

	}

}
