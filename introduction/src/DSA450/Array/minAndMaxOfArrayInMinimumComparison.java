package DSA450.Array;

public class minAndMaxOfArrayInMinimumComparison {

	public static class minMax{
		int min;
		int max;
	}
	
	public static minMax minAndMax(int arr[], int n) {
		minMax obj = new minMax();
		obj.min = Integer.MAX_VALUE;
		obj.max = Integer.MIN_VALUE;
		for(int i = 0;i<n;i++) {
			if(arr[i] < obj.min) {
				obj.min = arr[i];
			}
			if(arr[i] > obj.max) {
				obj.max = arr[i];
			}
		}
		return obj;
		
	}
	public static minMax recursive(int arr[], int l, int r) {
		minMax obj = new minMax();
		minMax objL = new minMax();
		minMax objR = new minMax();
		
		int mid;
		
		if(l == r) {
			obj.min = arr[l];
			obj.max = arr[l];
			return obj;
		}
		if(r == l + 1) {
			if(arr[l] < arr[r]) {
				obj.min = arr[l];
				obj.max = arr[r];
			} else {
				obj.min = arr[r];
				obj.max = arr[l];
			}
			return obj;
		}
		
		mid = (l + r)/2;
		objL = recursive(arr, l, mid);
		objR = recursive(arr, mid + 1, r);
		
		if(objL.min < objR.min) {
			obj.min = objL.min;
		} else {
			obj.min = objR.min;
		}
		if(objL.max < objR.max) {
			obj.max = objR.max;
		} else {
			obj.max = objL.max;
		}
		
		return obj;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {4, 3, 5, 6, 134, 2, 10, 5, 3};
//		minMax obj = minAndMax(arr, 9);
		minMax obj = recursive(arr, 0, 8);
		System.out.println(obj.min + " " + obj.max);
		
	}

}
