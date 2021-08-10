package FabruaryLongChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class xorSum2 {

	static int mod = 998244353 ;
	
	static int combi[] = new int[1001];
	
	public static void init() {
		for(int i = 0;i<1001;i++) {
			combi[i] = 0;
		}
	}
	public static int fact(int n) 
	{ 
	    int res = 1; 
	    for (int i = 2; i <= n; i++) 
	        res = (res % mod) * (i % mod); 
	    return (res % mod); 
	} 
	  
	public static int nCr(int n, int r) 
	{ 
	    return fact(n) / (fact(r) * fact(n - r)); 
	} 
	  
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		init();
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
			max = Math.max(max, arr[i]);
		}
		int pos = (int)Math.ceil((double)(Math.log(max) / (double)Math.log(2)));
		int q = sc.nextInt();
		HashMap<Integer, Integer> one = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> zero = new HashMap<Integer, Integer>();
		for(int i = 0;i<pos;i++) {
			one.put(i, 0);
			zero.put(i, 0);
		}
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<pos;j++) {
				if((arr[i] & (1<<j)) != 0) {
					int temp = one.get(j);
					temp++;
					one.put(j, temp);
				} else {
					int temp = zero.get(j);
					temp++;
					zero.put(j, temp);
				}
			}
		}
//		System.out.println("One : " + one);
//		System.out.println("Zero : " + zero);
		combi[1] = sum;
		for(int i = 2;i<=n;i++) {
			combi[i] += combi[i-1];
			int ans = 0;
			int jj = i;
			int t1 = 0;
			int t2 = 0;
			
			if((jj & 1) != 1) {
				while(jj > 0) {
					int tempZeroC = i - jj;
					for(int j = 0;j<pos;j++) {
						t1 += nCr(one.get(j), jj);
						t2 += nCr(zero.get(j), tempZeroC);
						ans += ((t1 % mod) * (t2 % mod) * (1 << j));
					}
					jj--;
				}
			} else {
				jj--;
				while(jj > 0) {
					int tempZeroC = i - jj;
					for(int j = 0;j<pos;j++) {
						t1 += nCr(one.get(j), jj);
						t2 += nCr(zero.get(j), tempZeroC);
						ans += ((t1 % mod) * (t2 % mod) * (1 << j));
					}
					jj--;
				}
			}
			combi[i] += ans;
		}
		for(int i = 0;i<q;i++) {
			int tempQ = sc.nextInt();
			System.out.println(combi[tempQ] % mod);
		}
		
//		System.out.println(nCr(5, 2));

	}

}
