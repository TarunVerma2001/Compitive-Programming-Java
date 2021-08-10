package FabruaryLongChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import lists.Pair;

class pair{
	int l, r;
	pair(int l, int r){
		this.l = l;
		this.r = r;
	}
}

public class MulGames {
	
	public static void Solve(int m, int[] input, int arr[],  HashMap<pair, Integer> map) {
		for(Map.Entry<pair, Integer> entry: map.entrySet()) {
			int k1 = entry.getKey().l;
			int p1 = entry.getKey().r;
			int l1 = entry.getValue();
			
			arr[p1 + k1] -= l1;
			arr[p1 + 2 * k1] += l1;
			int c1 = p1 + 2 * k1;
			while(c1 + p1 <= m) {
				c1 += p1;
				arr[c1] -= l1;
				arr[c1 + k1] += l1;
				c1 += k1;
			}
		}
		for(int i = 1;i<=m;i++) {
			arr[i] += arr[i-1];
		}
//		int arr1[] = solve(n, q, m, the, arr, res, map);
		int max = 0;
		for(int i = 0;i<=m;i++) {
//			System.out.print(arr1[i] + " ");
			max = Math.max(max, arr[i]);
		}
		System.out.println(max);
	}
	
	
//	public static int[] solve(int n, int q, int m, ArrayList<Integer> the, int arr[], int res[], HashMap<pair, Integer> map, int left, int right) {
//		
////			
//			
//			left--;
//			right--;
//			if(the.get(left) > m)
//				continue;
//			else if(the.get(left) <= m && the.get(right) > m) {
//				arr[the.get(left)] ++;
//				arr[m+1]--;
//			}
//			else if(the.get(right) <= m) {
//				arr[the.get(left)] ++;
//				arr[m+1]--;
//				if(!map.containsKey(new pair(the.get(left), the.get(right)))) {
//					map.put(new pair(the.get(left), the.get(right)), 1);
//				} else {
//					int temp = map.get(new pair(the.get(left), the.get(right)));
//					temp++;
//					map.put(new pair(the.get(left), the.get(right)), temp);
//				}
//			}
//		for(Map.Entry<pair, Integer> entry: map.entrySet()) {
//			int k1 = entry.getKey().l;
//			int p1 = entry.getKey().r;
//			int l1 = entry.getValue();
//			
//			arr[p1 + k1] -= l1;
//			arr[p1 + 2 * k1] += l1;
//			int c1 = p1 + 2 * k1;
//			while(c1 + p1 <= m) {
//				c1 += p1;
//				arr[c1] -= l1;
//				arr[c1 + k1] += l1;
//				c1 += k1;
//			}
//		}
//		for(int i = 1;i<=m;i++) {
//			arr[i] += arr[i-1];
//		}
//		return arr;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int tt = 0;tt<t;tt++) {
//			System.out.println("nqm");
			int n = sc.nextInt();
			int q = sc.nextInt();
			int m = sc.nextInt();
//			ArrayList<Integer> the = new ArrayList<Integer>();
			int input[] = new int[n];
//			System.out.println("array");
			for(int i = 0;i<n;i++) {
				input[i] = sc.nextInt();
			}
			int arr[] = new int [1000005];
			for(int i = 0;i<1000005;i++)
				arr[i] = 0;
//			int res[] = new int[m+1];
//			for(int i = 0;i<=m;i++) {
//				res[i] = 0;
//			}
			
			HashMap<pair, Integer> map = new HashMap<pair, Integer>();
			for(int qq = 0;qq<q;qq ++) {
//				System.out.println("lr");
//				Scanner sc = new Scanner (System.in);
				int left = sc.nextInt();
				int right = sc.nextInt();
				left--;
				right--;
				if(input[left] > m)
					continue;
				else if(input[left] <= m && input[right] > m) {
					arr[input[left]] ++;
					arr[m+1]--;
				}
				else if(input[right] <= m) {
					arr[input[left]] ++;
					arr[m+1]--;
					if(!map.containsKey(new pair(input[left], input[right]))) {
						map.put(new pair(input[left], input[right]), 1);
					} else {
						int temp = map.get(new pair(input[left], input[right]));
						temp++;
						map.put(new pair(input[left], input[right]), temp);
					}
				}
			}
			Solve(m, input, arr, map);
			
			
		}
	}

}
