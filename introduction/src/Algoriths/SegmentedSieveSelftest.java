package Algoriths;

import java.util.ArrayList;
import java.util.List;

public class SegmentedSieveSelftest {

	public static void main(String[] args) {

		int n = 100;
		Segmented(n);
		
	}
	public static void SimpleS(int n, ArrayList<Integer> prime) {
		boolean mark[] = new boolean[n+1];
		for(int i =0;i<=n;i++) {
			mark[i] = true;
		}
		for(int p=2;p*p<=n;p++) {
			if(mark[p] == true) {
				for(int j = p*p;j<=n;j+=p) {
					mark[j] = false;
				}
			}
		}
		for(int i =2;i<=n;i++) {
			if(mark[i] == true) {
				prime.add(i);
				System.out.print(i +" ");
			}
		}
	}
	public static void Segmented(int n) {
		
		ArrayList<Integer> prime = new ArrayList<Integer>();
		int limit = (int)Math.floor(Math.sqrt(n)) + 1;
		SimpleS(limit, prime);
		
		int low = limit;
		int high = 2*limit;
		
		while(low < n) {
//			System.out.println("inside while ");
			if(high >= n ) {
				high = n;
			}
			
			
			boolean mark[] = new boolean[limit+1];
			
			
			for(int i =0;i<=limit;i++)
				mark[i] = true;
			
			for(int i =0;i<prime.size();i++) {
				
				int loLim = (int)(Math.floor(low/prime.get(i)) * prime.get(i));
//				System.out.println("loLim : " + loLim);
				if(loLim < low) {
					loLim += prime.get(i);
				}
				
				for(int j = loLim;j<high;j+=prime.get(i)) {
				
					mark[j-low] = false;
					
				}
				
				
			}
			for(int i =low;i<high;i++) {
			
				if(mark[i-low] == true) {
					System.out.print(i + " ");
				}
				
			}
			low += limit;
			high += limit;
			
				
				
		}
	}
		
		
		
		
}


