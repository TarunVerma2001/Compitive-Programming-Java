package OctoberLongChallenge;
import java.util.*;
public class PositiveAnd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			Random random = new Random();
//	        System.out.println("Enter the length of li/st: ");
	        int N = sc.nextInt();
	        int[] sequence = new int[N];
	        int[] arr = new int[N];
	        for (int i = 0; i < N; i++)
	            sequence[i] = i+1;
	        boolean res = false;
//	        System.out.println("\nThe permuted sequences are: ");
	        res = permute(sequence, 0, arr);
	        if(res == false) {
	        	System.out.println("-1");
//	        	System.out.println();
	        }
		}
        
		
	}
//	public static boolean finale(int[] arr) {
//		System.out.println("in finale");
//		for(int i =0;i<arr.length;i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println(); 
//		boolean res = true;
//		
//		for(int i =0;i<arr.length-1;i++) {
//			if((arr[i] & arr[i+1]) > 0) {
//				res = false;
//			}
//		}
//		if(res == true) {
//			return true;
//		}
//	}
	public static boolean permute(int[] a, int k, int[] arr) 
    {
		boolean result = false;
        if (k == a.length) 
        {
        	boolean res2 = false;
            for (int i = 0; i < a.length; i++) 
            {
//                System.out.print(" [" + a[i] + "] ");
                arr[i] = a[i];
            }
            boolean res = true;
            for(int i =0;i<arr.length-1;i++) {
    			if((arr[i] & arr[i+1]) <= 0) {
//    				System.out.println("inside");
    				res = false;
    				break;
    			}
    		}
            if(res == true) {
//            	System.out.println("inside2");
            	result = true;
            	res2 = true;
            	for(int i =0;i<arr.length;i++) {
            		System.out.print(arr[i] + " ");
            	}
            	System.out.println();
            	return true;
            }
//            finale(arr);
            
//            System.out.println();
        } 
        else 
        {
            for (int i = k; i < a.length; i++) 
            {
            	boolean res4 = false;
//            	System.out.println("HII");
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
 
                res4 = permute(a, k + 1, arr);
//                System.out.println(res4);
                if(res4 == true) {
                	return true;
                }
//                System.out.println("HII2");
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
                
            }
        }
//        System.out.println("result : " + result);
        if(result == true) {
        	return true;
        }
        return result;
    }

}
