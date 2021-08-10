package interviewQuestions;
import java.util.*;
public class SlidingWindowMaximum1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int ans[] = Solution.maxSlidingWindow(a, k);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i] + " ");
		}
		
	}

	static class Solution{
		public static int[] maxSlidingWindow(int a[], int k) {
			int n = a.length;
			int ans[] = new int[n-k+1];
			Deque<Integer> dq = new LinkedList<Integer>();
			int i=0;
			for(;i<k;i++) {
				while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);
			}
			
			for(;i<n;i++) {
				ans[i-k] = a[dq.peekFirst()];
				while(!dq.isEmpty() && dq.peekFirst() <= i-k) {
					dq.removeFirst();
				}
				while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);
			}
			ans[i-k] = a[dq.peekFirst()];
			return ans;
		}
	}
}

	