package Algoriths;

public class SimpleSieve {

	public static void main(String[] args) {
		
		int n = 40;
		SimpleS(n);
		

	}
	public static void SimpleS(int n) {
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
				System.out.print(i +" ");
			}
		}
		System.out.println();
	}

}
