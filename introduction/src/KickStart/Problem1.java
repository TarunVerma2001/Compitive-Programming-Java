package KickStart;
import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			List<Integer> order = new ArrayList<Integer>();
//			List<Integer> amount = new ArrayList<Integer>();
			long amount[] = new long[n];
			Queue<Integer> posi = new LinkedList<Integer>();
			for(int i =0;i<n;i++) {
				amount[i] =sc.nextLong();
			}
			for(int i = 0;i<n;i++) {
				posi.add(i+1);
			}
			for(int i = 0;!posi.isEmpty();i++) {
				if(amount[posi.peek() - 1] <= x) {
					amount[posi.peek() - 1] = 0;
					order.add(posi.peek());
					posi.remove();
				} else {
					int temp = posi.peek();
					posi.remove();
					posi.add(temp);
					amount[temp - 1] -= x ;
				}
//				System.out.println("amount : " + amount);
//				System.out.println("posi" + posi);
//				System.out.println("order" + order);
			}
			System.out.print("case #" + (o+1) + ": ");
			for(int i = 0;i<order.size();i++) {
				System.out.print(order.get(i) + " ");
			}
			System.out.println();
		}
		
	}

}
