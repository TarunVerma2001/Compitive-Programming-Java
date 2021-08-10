package DecemberLongChallenge;
import java.util.*;
public class PositivePrefix {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int arr[] = new int[n];
			for(int i = 0;i<n;i++) {
				arr[i] = (-1)*(i+1);
			}
			if(k <=2) {
				for(int i =0;i<k;i++) {
					arr[i] = arr[i]*(-1);
				}
			} else {
				arr[0] = arr[0]*(-1);
				arr[1] = arr[1]*(-1);
				
				int temp = k - 2;
//				System.out.println("temp : " + temp);
				int count1 = (n-2)/2;
//				System.out.println("count1 : " + count1);
				if(temp >= count1) {
					int count2 = temp - count1;
					
					for(int i = 3;count1>0;i+=2) {
						arr[i] = arr[i]*(-1);
						count1--;
					}
					if(n % 2 == 0) {
						int i = n - 2;
						while(count2 > 0) {
							arr[i] = arr[i]*(-1);
							i -= 2;
							count2--;
						}
					} else {
						int i = n - 1;
						while(count2 > 0) {
							arr[i] = arr[i]*(-1);
							i -= 2;
							count2--;
						}
					}
					
				} else {
					for(int i = 3;temp>0;i+=2) {
						arr[i] = arr[i]*(-1);
						temp--;
					}
				}
				
			}
			for(int i =0;i<n;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

}
