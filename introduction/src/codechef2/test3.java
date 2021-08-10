package codechef2;

public class test3 {
	public static void Solve(int n, int k) {
		int count = 0;
		for(int i = 0;i<n;i++) {
			if(k % 2 != 0) {
				k = k/2;
				count ++;
			}
		}
		if(count == n && k == 0) {
			for(int i = 0;i<n;i++) {
				System.out.print("a");
			}
			System.out.println();
			return;
		}
		else if(count != n && count != 0 && k != 0) {
			int temp = 1 << count;
			int temp2 = k - temp;
			if(t)
		}
		
		
	}
	
	public static void main(String[] args) {
		int n = 5;
		int k = 8;
		System.out.println(recursion(k));
	}

}
