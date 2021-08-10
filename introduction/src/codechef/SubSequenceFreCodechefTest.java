package codechef;
import java.util.*;
import java.math.BigInteger;
public class SubSequenceFreCodechefTest {

	public static void main(String[] args) {

		
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			
			int n = sc.nextInt();
//			List<Integer> numbers = new ArrayList<Integer>();
			int arr[] = new int[n];
			for(int i =0;i<n;i++) {
				arr[i] = sc.nextInt();
//				int temp = sc.nextInt();
//				numbers.add(temp);
			}
			int opsize = (int)Math.pow(2, n); 
		    List<Integer> num2 =new ArrayList<Integer>();
		    List<Integer> result = new ArrayList<Integer>();
		    for (int i = 1; i < opsize; i++) 
		    { 
		       	num2.clear();
		       	for (int j = 0; j < n; j++) 
		        { 
		        
	               if (BigInteger.valueOf(i).testBit(j)) 
	                    num2.add(arr[j]);
		        } 
		        int count = countReccurence(num2);
		        result.add(count);
	        }  
	        for(int i=1;i<=n;i++) {
	        	System.out.print(Collections.frequency(result, i) + " ");
	        }
	        System.out.println();
			
			
			
			t--;
		}
	}
	public static int countReccurence(List<Integer> subNum) {
		int count = 0;
		int temp2 = subNum.get(0);
		int size = subNum.size();
		for(int i=0;i<size;i++) {
			int temp = subNum.get(i);
			if(Collections.frequency(subNum, temp) > count) {
				count = Collections.frequency(subNum, temp);
				temp2 = temp;
			}
			else if(Collections.frequency(subNum, temp) == count) {
				count = Collections.frequency(subNum, temp);
				if(temp2 > temp) {
					temp2 = temp;
				}
			}
		}
		return temp2;
	}
}
