package RecursionPractice;

public class ForstAndLAstOccurenceOfANumber {

	public static int firstOcc(int arr[], int i, int n, int key) {
		if(i == n) {
			return -1;
		}
		if(arr[i] == key) {
			return i;
		} else {
			return firstOcc(arr, i+1, n, key);
		}
	}
	public static int lastOcc(int arr[], int i, int n, int key) {
		if(i == n) {
			return -1;
		}
		int roa = lastOcc(arr, i+1, n, key);
		if(roa != -1) {
			return roa;
		}
		if(arr[i] == key) {
			return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1 , 2,  3,  4, 5, 3, 4, 5, 6, 10, 2, 32,4};
		System.out.println(lastOcc(arr, 0, 13, 2));
		
	}
}
