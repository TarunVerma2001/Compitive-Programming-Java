package Recursion;
import java.util.*;
public class CheckIfArrayIsSortedOrNot {

	public static boolean Sorted(int arr[],int i, int n) {
	
		if(n == 1) 
			return true;
		boolean restArray = Sorted(arr,(i+1), n-1);
		return (arr[i] < arr[i+1] && restArray);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 2, 6,4, 5, 6};
		System.out.println(Sorted(arr, 0, 6));
		
	}

}
