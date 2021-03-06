package priorityQueue;
import java.util.*;
public class KlargestElementsofAnArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			for(int i=0;i<n;i++) {
				if(i<k) {
					pq.add(arr[i]);
				} else {
					if(pq.peek() < arr[i]) {
						pq.poll();
						pq.add(arr[i]);
					}
				}
				
			}
			ArrayList<Integer> ans = new ArrayList<Integer>(pq);
			Collections.sort(ans, Collections.reverseOrder());
			
			for(int i=0;i<ans.size();i++) {
				System.out.print(ans.get(i) + " ");
			}
			System.out.println();
			
			t--;
		}
	}

}
