package DecemberLongChallenge;
import java.util.*;
public class hailXOR2 {

	public static void foundP(int arr[], int i, int j, int p) {
		
//		int p = (int) Math.floor(Math.log(arr[i])/Math.log(2));
//		System.out.println(temp);
		
		arr[i] = arr[i] ^ (int)(Math.pow(2, p));
		arr[j] = arr[j] ^ (int)(Math.pow(2, p));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int arr[] = new int[n];
			for(int i =0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			int i = 0;
			int j = i+1;
			while(x > 0 && i < j) {
				if(arr[i] > 0) {
					int p = (int) Math.floor(Math.log(arr[i])/Math.log(2));
					j = i+1;
					for(int u = j;u<n;u++) {
						if(arr[u] < Math.pow(2, p)) {
							continue;
						} else {
							j = u;
							break;
						}
					}
					foundP(arr, i, j, p);
					x--;
					System.out.println("HII");
					
				} else {
					i++;
					j++;
				}
			}
			for(int xy = 0;xy < n;xy++) {
				System.out.println(arr[xy] + " ");
			}
			System.out.println();
		}

	}

}
