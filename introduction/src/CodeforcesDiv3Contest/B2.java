package CodeforcesDiv3Contest;
import java.util.*;

public class asdfgh {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int tt =0;tt<t;tt++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			int c0 = 0, c1 = 0, c2 = 0;
			int res = n/3;
			for(int x: arr) {
				if(x % 3 ==0) {
					c0++;
				} else if(x % 3 ==1){
					c1++;
				} else{
					c2++;
				}
			}
			if(c1 == c2 && c0 == c1) {
				System.out.println(0);
				continue;
			}
			SolvingMain(c0, c1, c2, res);
			
			
		}

	}
	
	public static void SolvingMain(int c0, int c1, int c2, int res) {
		int ans = 0;
		if(c0 < res) {
			int temp1 = res - c0;
			if(c1 > res) {
				int temp = c1 - res;
				if(temp1 > temp) {
					ans += (2 * (temp));
					ans += (temp1 - temp);
					System.out.println(ans);
					return;
				} else if(temp1 < temp){
					ans += (2 * temp1);
					ans += (temp - temp1);
					System.out.println(ans);
					return;
				} else {
					ans += (2 * temp);
					System.out.println(ans);
					return;
				}
			}
			if(c2 > res) {
				int temp = c2 - res;
				if(temp1 > temp) {
					ans += temp;
					ans += (2 * (temp1 - temp));
					System.out.println(ans);
					return;
				} else if(temp1 < temp) {
					ans += temp1;
					ans += (2 * (temp - temp1));
					System.out.println(ans);
					return;
				} else {
					ans += temp;
					System.out.println(ans);
					return;
				}
			}
		}
		if(c1 < res) {
			int temp1 = res - c1;
			if(c0 > res) {
				int temp = c0 - res;
				if(temp1 > temp) {
					ans += (temp);
					ans += (2 * (temp1 - temp));
					System.out.println(ans);
					return;
				} else if(temp1 < temp) {
					ans += (temp1);
					ans += (2 * (temp - temp1));
					System.out.println(ans);
					return;
				} else {
					ans += temp;
					System.out.println(ans);
					return;
				}
			}
			if(c2 > res) {
				int temp = c2 - res;
				if(temp1 > temp) {
					ans += (2 * temp);
					ans += ((temp1 - temp));
					System.out.println(ans);
					return;
				} else if(temp1 < temp) {
					ans += (2 * temp1);
					ans += ((temp - temp1));
					System.out.println(ans);
					return;
				} else {
					ans += (2 * temp);
					System.out.println(ans);
					return;
				}
			}
		}
		if(c2 < res) {
			int temp1 = res - c2;
			if(c0 > res) {
				int temp = c0 - res;
				if(temp > temp1) {
					ans += (2 * temp1);
					ans += (temp - temp1);
					System.out.println(ans);
					return;
				} else if(temp < temp1){
					ans += (2 * temp);
					ans += (temp1 - temp);
					System.out.println(ans);
					return;
				} else {
					ans += (2 * temp);
					System.out.println(ans);
					return;
				}
			}
			if(c1 > res) {
				int temp = c1 - res;
				if(temp > temp1) {
					ans += temp1;
					ans += (2 * temp - temp1);
					System.out.println(ans);
					return;
				} else if(temp1 > temp) {
					ans += temp;
					ans += (2 * temp1 - temp);
					System.out.println(ans);
					return;
				} else {
					ans += temp;
					System.out.println(ans);
					return;
				}
			}
		}
	}

}
