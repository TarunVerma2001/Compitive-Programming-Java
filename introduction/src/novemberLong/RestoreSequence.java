package novemberLong;
import java.util.*;
public class RestoreSequence {
	static int MAXN = 4000001;
	
	static ArrayList<Integer> Prime= new ArrayList<>();
	
	static boolean[] prime = new boolean[MAXN];
	public static void main(String[] args) {
		primeGenerator();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int o = 0;o<t;o++) {
			int n = sc.nextInt();
			int b [] = new int[n];
			for(int i =0;i<n;i++) {
				b[i] = sc.nextInt();
			}
			ArrayList<Integer> a = new ArrayList<Integer>();
			Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
			for(int i =0;i<n;i++) {
				temp.put(b[i], temp.getOrDefault(b[i], 0) + 1);
				
			}
			for(int i =0;i<n;i++) {
				a.add(Prime.get(b[i]));
			}
			for(int i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
			}
		
		

	}
	public static void primeGenerator() {
		for(int i =0;i<MAXN;i++) {
			prime[i] = true;
		}
		for(int i = 2;i*i<MAXN;i++) {
			if(prime[i] == true) {
				for(int j = i*i;j<MAXN;j+=i) {
					prime[j] = false;
				}
			}
		}
		for(int i =2;i<MAXN;i++) {
			if(prime[i]) {
				Prime.add(i);
			}
		}
		
	}

}
