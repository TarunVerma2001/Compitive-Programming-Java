package DSA450.Array;
import java.util.*;
public class ReverseArray {

	public static void swap(int arr[], int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void reverseArray(int arr[], int n) {
		int i = 0;
		int j = n-1;
		while(i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	
	public static void reverseArrayRec(int arr[], int i, int j) {
		if(i >= j) {
			return;
		}
		swap(arr, i, j);
		i++;
		j--;
		reverseArrayRec(arr, i, j);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int arr[] = {3, 2, 5, 1, 2};
//		reverseArray(arr, 6);
		reverseArrayRec(arr, 0, 4);
		for(int x: arr) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
	}

}
