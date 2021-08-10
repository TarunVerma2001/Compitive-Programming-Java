package RecursionAdvance;

public class subSetWithGivenSum {

	public static boolean GivenSum(int arr[], int n, int sum) {
		
		if(sum == 0) {
			return true;
		}
		if(n == 0) {
			return false;
		}
		if(arr[n-1] > sum) {
			return GivenSum(arr, n-1, sum);
		}
		
		return (GivenSum(arr, n-1, sum) || GivenSum(arr, n-1, sum - arr[n-1]));
		
	}
	public static void main(String[] args) {
		
		int arr[] = {3, 34, 4, 12, 5, 2};
		int n = 6;
		int sum = 9;
		
		System.out.println(GivenSum(arr, n, sum));
	}
	
	
}
