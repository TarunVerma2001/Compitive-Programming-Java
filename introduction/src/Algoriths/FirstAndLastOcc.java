package Algoriths;

public class FirstAndLastOcc {

	public static int occ(int arr[], int i, int j, int key) {
		int mid = j - i + 1;
		mid /= 2;
		while(i < j) {
			if(arr[mid] ==  key) {
				j = mid;
			} else if(arr[mid] > key) {
				j = mid - 1;
			} else {
				i = mid;
			}
		}
		return i;
	}
	public static int lOcc(int arr[], int i, int j, int key) {
		int mid = (j - i + 1)/2;
		while(i < j) {
			if(arr[mid] == key) {
				i = mid;
			} else if(arr[mid] < key) {
				i = mid+1;
			} else {
				j = mid - 1;
			}
			
		}
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {
				1, 2, 3, 4, 4, 4, 5
		};
		System.out.println(occ(arr, 0, 6, 4));
		
		
	}

}
