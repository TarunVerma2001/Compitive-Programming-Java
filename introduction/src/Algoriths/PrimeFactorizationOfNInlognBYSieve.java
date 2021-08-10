package Algoriths;

import java.util.ArrayList;

public class PrimeFactorizationOfNInlognBYSieve {
	
	static final int MAXN = 100001;
	static int[] spf = new int[MAXN]; 
	
	public static void SmallestPrimeFactor() {
		spf[1] = 1;
		for(int i =2;i<MAXN;i++) {
			spf[i] = i;
		}
		for(int i = 4;i<MAXN;i+=2) {
			spf[i] = 2;
		}
		
		for(int i =3;i*i<MAXN;i++) {
			if(spf[i] == i) {
				for(int j = i*i;j<MAXN;j+=i) {
					if(spf[j] == j) {
						spf[j] = i;
					}
				}
			}
		}
	}
	
	public static ArrayList<Integer> primeFactor (int x){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		while(x != 1) {
			ret.add(spf[x]);
			x = x / spf[x];
		}
		
		return ret;
	}
	

	public static void main(String[] args) {
		
		SmallestPrimeFactor();
		int x = 12246;
		System.out.println("prime factors of " + x + " : ");
		
		ArrayList<Integer> a = primeFactor(x);
		
		for(int i =0;i<a.size();i++) {
			System.out.print(a.get(i) + " ");
		}
		System.out.println();
		

	}

}
