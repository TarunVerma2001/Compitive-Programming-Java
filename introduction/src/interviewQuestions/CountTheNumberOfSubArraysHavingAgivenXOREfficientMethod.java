package interviewQuestions;
import java.util.*;



public class CountTheNumberOfSubArraysHavingAgivenXOREfficientMethod {
	public static int solve(int[] A, int B) {
	
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int Xor = 0;
		for(int i =0;i<A.length;i++) {
			Xor ^= A[i];
			if(map.get(Xor ^ B) != null) {
				count += map.get(Xor ^ B);
			} 
			if(Xor == B) {
				count++;
			}
			if(map.get(Xor) != null) {
				map.put(Xor, map.get(Xor) + 1);
			} else {
				map.put(Xor, 1);
			}
			
		}
		
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int [n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
//		for(int i: arr) {
//			System.out.println(i);
//		}
		
		System.out.println(solve(arr, k));
		
		
	}

}
