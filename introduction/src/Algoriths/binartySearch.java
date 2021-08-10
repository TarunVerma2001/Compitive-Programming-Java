package Algoriths;

public class binartySearch {

	public static int Search(int arr[],int l, int r, int x) {
			
		if(l <= r) {
			int mid = l + (r - l) / 2;
//			System.out.println(mid);
			
			if(arr[mid] == x) {
//				System.out.println("yo");
				return mid;
			}
//			System.out.println("that");
			if(arr[mid] > x) {
				return Search(arr ,l, mid-1, x);
			}
//			System.out.println("this");
			return Search(arr, mid+1, r, x);
		}
		return -1;
//		 if (r >= l) { 
//	            int mid = l + (r - l) / 2; 
//	  
//	            // If the element is present at the 
//	            // middle itself 
//	            if (arr[mid] == x) 
//	                return mid; 
//	  
//	            // If element is smaller than mid, then 
//	            // it can only be present in left subarray 
//	            if (arr[mid] > x) 
//	                return Search(arr, l, mid - 1, x); 
//	  
//	            // Else the element can only be present 
//	            // in right subarray 
//	            return Search(arr, mid + 1, r, x); 
//	        } 
//	  
//	        // We reach here when element is not present 
//	        // in array 
//	        return -1;

	}
	public static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
	public static boolean simpleSearch(int num[], int x){
//		System.out.println(x);
        for(int i = 0;i<num.length;i++){
//        	System.out.println(num[i]);
            if(num[i] == x){
            	
                return true;
            }
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3, 1};
		int target = 3;
//
//		int arr[] = {4,5,6,7,0,1,2};
//		
//		System.out.println(simpleSearch(arr, 0));
		if(simpleSearch(nums, target) == false){
            System.out.println(-1);
        }
        int pivot = -1;
        int n = nums.length;
        for(int i = 0;i<n-1;i++){
            if(nums[i] > nums[i+1]){
                pivot = i+1;
            }
        }
        
        if(pivot == -1){
            System.out.println( binarySearch(nums, 0, n-1, target));
        } else{
            int size = n -  pivot;
            int size2 = n - size;
            int arr[] = new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = nums[i + pivot];
            }
            for(int i = 0;i<size2;i++){
                nums[i + size] = nums[i];
            }
            for(int i = 0;i<size;i++){
                nums[i] = arr[i];
            }
            int index  = binarySearch(nums, 0, n-1, target);
//            return (index + size2);
            System.out.println(index + size2);
                
            
        }
		
	}
	class Solution {
		public:
		    int search(vector<int>& nums, int target) {
		        int l=0,r=nums.size()-1,mid;
		        while(l<=r)
		        {
		            mid=(l+r)/2;
		            if(nums[mid]==target)
		                return mid;
		            if(nums[l]<=nums[mid])
		            {
		                if(target<=nums[mid] && target>=nums[l])
		                    r=mid-1;
		                else
		                    l=mid+1;
		            }
		            
		            else
		            {
		                if(target>=nums[mid] && target<=nums[r])
		                   l=mid+1;
		                else
		                    r=mid-1;
		            }
		            
		        }
		        return -1;
		    }
		};

}
