package Algoriths.DynamicProgrammingSelf;

import java.util.*;
import java.lang.*;

public class AtCoderDPB {
	public static int Rec(int i, int n, int k, int h[]) {
		if(i == n) {
			return 0;
		}

		int temp = Integer.MAX_VALUE;

		
		for(int ind = i + 1;ind<=Math.min(n, i + k);ind++) {
			temp = Math.min(temp, Math.abs(h[i] - h[ind]) + Rec(ind, n, k, h)) ;
		}
		return temp;
	}
	public static int Dp(int dp[], int i, int k, int n, int h[]) {
		if(i == n) {
			return 0;
		}
		if(dp[i] != -1) {
			return dp[i];
		}
		int temp = Integer.MAX_VALUE;

		
		for(int ind = i + 1;ind<=Math.min(n, i + k);ind++) {
			temp = Math.min(temp, Math.abs(h[i] - h[ind]) + Rec(ind, n, k, h)) ;
		}
		return dp[i] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		int k = sc.nextInt();
//		int h[] = new int[n+1];
//		h[0] = -1;
//		int dp[] = new int[n+1];
//		for(int i = 1;i<=n;i++) {
//			h[i] = sc.nextInt();
//			dp[i] = -1;
//		}
//		
////		System.out.println(Rec(1, n,k, h));
//		System.out.println(Dp(dp, 1, k, n, h));
		int items[] = {0, 0, 1, 1, 2, 3};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0;i<items.length;i++) {
			if(!map.containsKey(items[i])) {
				map.put(items[i], 1);
			} else {
				int temp = map.get(items[i]);
				map.put(items[i], temp);
			}
		}
		int n = 2;
		List<Map.Entry<Integer, Integer> > list = 
	               new LinkedList<Map.Entry<Integer, Integer> >(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
		HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        for (Map.Entry<Integer,Integer> x : temp.entrySet())  {
        	
        }
//            System.out.println("Key = " + entry.getKey() + 
//                             ", Value = " + entry.getValue()); 
        
//        System.out.println(ans);
	}
}
