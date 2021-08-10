package Recursion;
import java.util.*;
public class firstAndLastOccurence {

	public static int firstOccurence(int arr[], int i, int n, int key) {
		if(i == n) {
			return -1;
		}
		
		if(arr[i] == key) {
			return i;
		} 
		int restArray = firstOccurence(arr, i+1, n, key);
		return restArray;
	}
	public static int lastOcc(int arr[], int i, int n, int key) {
		if(i == n) {
			return -1;
		}
		int restArray = lastOcc(arr, i+1, n, key);
		if(restArray != -1) {
			return restArray;
		}
		if(arr[i] == key) {
			return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {4, 2, 1, 2, 5, 2, 7};
		System.out.println(firstOccurence(arr, 0, 7, 2));
		System.out.println(lastOcc(arr, 0, 7, 2));
		
	}

}
