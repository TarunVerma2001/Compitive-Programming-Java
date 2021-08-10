
import java.util.Scanner;

public class E{
	static Scanner sc = new Scanner(System.in);
	public static void solve() {
		String a = sc.next();
		String b = sc.next();
		int nn = a.length() - 1;
		String tmp = "";
		while(nn >= 0) {
			tmp += a.charAt(nn);
			nn--;
		}
		boolean ok = false;
		int n = a.length();
		outer: for(int i =0;i<n;i++) {
			String res = a.substring(0, i+1) + tmp.substring(n - i);
			if(b.length() > res.length()) {
				continue;
			}
			for(int j =0;j<= res.length() - b.length();j++) {
				if(res.substring(j, j + b.length()).compareTo(b) == 0) {
					ok = true;
					break outer;
				}
			}
			
		}
		if(ok) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static void main(String[] args) {
		int t = 1;
		t = sc.nextInt();
		outer: for (int tt = 0; tt < t; tt++) {
			solve();
		}
	}
	
}