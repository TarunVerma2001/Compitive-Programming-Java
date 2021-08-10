package JanuaryLongChallenge;
import java.util.*;
public class WatchingCPL {
	
	public static void solve(int n, int k, int h[]) {
		long line1 = 0;
		long line2 = 0;
		int i = n - 1;
		int j = i - 2;
		int count = 0;
		while(line1 < k || line2 < k) {
			line1 += h[i];
			i--;
			count++;
			if(line1 >= k || line2 >= k) {
				break;
			}
			line2 += h[j];
			j--;
			count++;
			if(line1 >= k || line2 >= k) {
				break;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o = 0;o<t;o++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int h[] = new int[n];
			for(int i =0;i<n;i++) {
				h[i] = sc.nextInt();
			}
			solve(n, k, h);
		}
	}

}
