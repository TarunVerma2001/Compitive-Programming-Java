package arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = {2, 1, 8, -3, 6, 4, 12};
		int n = a.length;
		boolean sorted = true;
		
		for(int i=0;i<n-1;i++) {		
			for(int j=0;j<n-1-i;j++) {		// we have done optimisation here   we can use n-1 also
				if(a[j+1] < a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					sorted = false;		// it will reduce the number of times athe loop work if the array is sorted it will break th loop
				}
			}
			if (sorted) break;
		}
		for(int item: a) {
			 System.out.print(item + " ");
		}
		
	}

}
