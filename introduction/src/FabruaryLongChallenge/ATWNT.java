package FabruaryLongChallenge;
import java.util.*;
import java.lang.*;
public class ATWNT {
	static int ignore = 0;

	public static void Rec(HashMap<Integer, ArrayList<Integer>> tree, HashMap<Integer, Integer> map, int v, int w, int index) {
		if(map.get(index) == 0 || map.get(index) == 1) {
			return;
		} else {
			if(w % map.get(index) != 0) {
				ignore += w;
				return;
			} else {
			    int n = map.get(index);
				for(int i = 0;i<n;i++) {
					int a = tree.get(index).get(i);
					Rec(tree, map, v, w/n, a);
				}
			}

		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			int arr[] = new int[n+1];
			arr[0] = -1;
			arr[1] = 0;
			for(int i = 2;i<=n;i++) {
				arr[i] = sc.nextInt();
			}
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			HashMap<Integer, ArrayList<Integer>> tree = new HashMap<Integer, ArrayList<Integer>>();
			for(int i = 1;i<=n;i++) {
				map.put(i, 0);
				ArrayList<Integer> temp = new ArrayList<Integer>();
				tree.put(i, temp);
			}
			for(int i = 2;i<=n;i++) {
				int temp = map.get(arr[i]);
				temp++;
				map.put(arr[i], temp);
				ArrayList<Integer> temp2 = tree.get(arr[i]);
				temp2.add(i);
				tree.put(arr[i], temp2);
			}
//	 		System.out.println(map);
//	 		System.out.println(tree);
			int q = sc.nextInt();
			for(;q>0;q--) {
				ignore = 0;
				int v = sc.nextInt();
				int w = sc.nextInt();
				Rec(tree, map, v, w, v);
				System.out.println(ignore);
			}
		
		

	}

}
