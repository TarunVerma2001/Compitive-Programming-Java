package RecursionPractice;

public class sortedArrayOrNot {

	public static boolean isSorted(int arr[], int i, int j) {
		
		if((j - i + 1) <= 1) {
			return true;
		}
		if(arr[i] <= arr[i+1]) {
			return (true && isSorted(arr, i+1, j));
		} else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		
		int arr[] = {5, 2, 3, 4, 5, 6};
		System.out.println(isSorted(arr, 0, 5));
		
		
	}
}
