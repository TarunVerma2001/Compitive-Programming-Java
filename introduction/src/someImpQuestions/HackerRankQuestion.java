package someImpQuestions;
import java.util.*;
public class HackerRankQuestion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		long result;
		result = candies(n, a);
		System.out.println(result);
	}
	static long candies(int n, int a[])
	{
		int c[] = new int [n];
		Arrays.fill(c, 1);//give a value of 1 to all elements of array
		for(int i=1;i<n;i++) {
			if(a[i] > a[i-1]) {
				c[i] = c[i-1] + 1;
			}
		}
		
		for(int i=n-2;i>=0;i--) {
			if(a[i] >a[i+1]) {
				c[i] = Math.max(c[i+1] + 1, c[i]);
			}
		}
		
		long sum =0;
		for(int i=0;i<n;i++) {
			sum = sum + (long)c[i];
		}
		return sum;
		
		
	}
		
	

}
