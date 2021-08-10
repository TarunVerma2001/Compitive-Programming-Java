package DecemberLongChallenge;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = 30;
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int arr[] = new int[n];
			List<List<Integer>> idx = new ArrayList<List<Integer>>();
			List<Integer> xyz = new ArrayList<Integer>();
			
			for(int i =0;i<n;i++) {
				arr[i] = sc.nextInt();
				if(i == n-1)
					continue;
				for(int as = 0;as<31;as++) {
					idx.add(xyz);
				}
				for(int j = k;j>=0;j--) {
					if((arr[i]&((int)1<<j)) != 0) {
						idx.get(j).add(i);
//						System.out.println(idx);
					}
				}
			}
			System.out.println(idx);
			System.out.println(idx.size());
			List<Integer> cnt = new ArrayList<Integer>();
			for(int i = 0;i<32;i++) {
				cnt.add(0);
			}
			System.out.println(cnt);
			for(int i =0;i<n-1;i++) {
				for(int j = k;j>=0;j--) {
					long mask = 1 << k;
					if((arr[i] & mask)==0) {
						continue;
					}
					arr[i] ^= mask;
					long d;
					int temp = cnt.get(j);
					temp++;
					cnt.set(j, temp);
					int a = cnt.get(j);
					if(a < idx.get(j).size()) {
						d = idx.get(j).get(++a);
					} else {
						d = n-1;
					}
					arr[(int)d] ^= mask;
					if(--x == 0)
						break;
				}
				
			}
			System.out.println("Cnt : " + cnt);
		
		}
	}
}


