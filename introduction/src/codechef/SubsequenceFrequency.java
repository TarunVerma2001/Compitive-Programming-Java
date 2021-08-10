package codechef;
import java.util.*;
import java.math.BigInteger;
public class SubsequenceFrequency {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t != 0) {
//			
//			int n = sc.nextInt();
//			int arr[] = new int[n];
//			List<Integer> numbers = new ArrayList<Integer>();
//			for(int i =0;i<n;i++) {
////				arr[i] = sc.nextInt();
//				int temp = sc.nextInt();
//				numbers.add(temp);
//			}
//			int opsize = (int)Math.pow(2, n); 
//		    List<Integer> num2 =new ArrayList<Integer>();
//		    List<Integer> result = new ArrayList<Integer>();
//		    /* Run from counter 000..1 to 111..1*/
//		    for (int i = 1; i < opsize; i++) 
//		    { 
//		       	num2.clear();
//		       	for (int j = 0; j < n; j++) 
//		        { 
//		             /* Check if jth bit in the counter is set 
//		                    If set then print jth element from arr[] */
//		        
//	               if (BigInteger.valueOf(i).testBit(j)) 
//	                    num2.add(numbers.get(j));
////		                	System.out.print(arr[j]+" "); 
//		        } 
//		           System.out.println(num2);
//		           int count = countReccurence(num2);
//		           result.add(count);
//		           System.out.println(count);
////		           System.out.println(); 
//	        }  
//	        System.out.println("result : " + result);    
////			printSubsequences(numbers.size(), arr);
//	        for(int i=1;i<=n;i++) {
//	        	System.out.print(Collections.frequency(result, i) + " ");
//	        }
//	        System.out.println();
//			
//			
//			
//			t--;
//		}
		
		int t = sc.nextInt();
		while(t != 0) {
			long n = sc.nextLong();
			long arr[] = new long[(int) n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextLong();
			}
			for(int i=0;i<n;i++) {
				System.out.print(power(2, n-1, 1000000007) + " ");
			}
			t--;
		}
		
	}
//	public static int countReccurence(List<Integer> subNum) {
//		int count = 0;
//		int temp2 = subNum.get(0);
//		List<Integer> sub2 =new ArrayList<Integer>();
//		sub2.addAll(subNum);
//		System.out.println(sub2);
//		int size = sub2.size();
//		for(int i=0;i<size;i++) {
//			int temp = sub2.get(i);
//			System.out.println("temp = " + temp);
//			if(Collections.frequency(sub2, temp) > count) {
//				count = Collections.frequency(sub2, temp);
//				temp2 = temp;
//				System.out.println("temp2 :" + temp2);
//			}
//			else if(Collections.frequency(sub2, temp) == count) {
//				count = Collections.frequency(sub2, temp);
//				if(temp2 > temp) {
//					temp2 = temp;
//					System.out.println("temp2 : " + temp2);
//				}
//			}
//		}
//		return temp2;
//	}
	
	public static long  power(long  x ,  long y,  long p) {
		long result = 1;
		x = x % p;
		if(x == 0) {
			return 0;
		}
		while(y > 0) {
			if(y>1) {
				result= (result*x) % p;
				return result;
			}
		}
		return result;
	}
}
