package Algoriths;

public class MergeSort {
	
//	public static void merge(int arr[], int l, int mid, int r) {
//		
//		int n1 = mid - l + 1;
//		int n2 = r - mid;
//		System.out.println("n1 : " + n1 + " n2 : " + n2);
//		
//		int a[] = new int [n1];
//		int b[] = new int [n2];
//		
//		for(int i = 0;i<n1;i++) {
//			a[i] = arr[l + i];
//		}
//		for(int i = 0;i<n2;i++) {
//			b[i] = arr[mid + 1+ i]; 
//		}
//		
//		int i = 0;
//		int j = 0;
//		int k = l;
//		while(i < n1 && j < n2) {
//			if(a[i] < b[i]) {
//				arr[k] = a[i];
//				k++;
//				i++;
//			}
//			else {
//				arr[k] = b[j];
//				k++;
//				j++;
//			}
//			
//		}
//		while(i<n1) {
//			arr[k] = a[i];
//			k++;
//			i++;
//		}
//		while(j<n2) {
//			arr[k] = b[j];
//			k++;
//			j++;
//		}
//		
//	}
//	
//	
//	public static void mergeSort(int arr[], int l, int r) {
//		if(l < r) {
//			int mid = (l + r)/2;
//			mergeSort(arr, l, mid);
//			mergeSort(arr, mid+1, r);
//			
//			merge(arr, l, mid, r);
//		}
//	}
	
	public static void merge(int arr[], int l , int mid, int r) {
		System.out.println("initial");
		for(int x: arr) {
			System.out.print(x + " ");
		}System.out.println();
		
		int n1 = mid - l + 1;
		int n2 = r - mid;
		
		int a[] = new int[n1];
		int b[] = new int[n2];
		
		for(int i = 0;i<n1;i++) {
			a[i] = arr[l + i];
		}
		for(int i = 0;i<n2;i++) {
			b[i] = arr[mid + i + 1];
		}
		
		int i = 0;
		int j = 0;
		int k = l;
		
		while(i < n1 && j < n2) {
			if(a[i] < b[i]) {
				arr[k] = a[i];
				k++;
				i++;
			} else {
				arr[k] = b[j];
				k++;
				j++;
			}
		}
		while(i < n1) {
			arr[k] = a[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr[k] = b[j];
			j++;
			k++;
		}
		System.out.println("final");
		for(int x: arr) {
			System.out.print(x + " ");
		}System.out.println();
	}
	
	public static void mergeSort(int arr[], int l, int r) {
		
		if(l < r) {
			int mid = (l + r ) / 2;
			//Splitting
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			//Merging
			merge(arr, l, mid, r);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {3, 2, 5, 6, 4, 1, 8, 7};
		mergeSort(arr, 0, 7);
		merge(arr, 0, (0 + 7) / 2, 7);
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
//	 * 		1 2 3 4 5 6 7 8 
//	 * 		l
//	 * 		3 2 5 6 4 1 8 7
//	 
//	 		3 2 5 6    4 1 8 7
//	 		3 2, 5 6	4 1, 8 7
//	 					
//	 		3 , 2, 5, 6		4, 1, 8, 7
//	 		
//	 		2 3  , 5 6
//	 		2 3 5 6			1 4 7 8
//	 		i				j
}			
