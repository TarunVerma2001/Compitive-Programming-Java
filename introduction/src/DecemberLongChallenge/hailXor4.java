package DecemberLongChallenge;
import java.util.*;
public class hailXor4 {
	
	public static void foundP(int arr[], int i, int j) {
		int p = (int) Math.floor(Math.log(arr[i])/Math.log(2));
//		System.out.println(temp);
		
		arr[i] = arr[i] ^ (int)(Math.pow(2, p));
		arr[j] = arr[j] ^ (int)(Math.pow(2, p));
	}

	public static void main(String[] args) {

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
			int j = n-1;
			while(x>0 && i<j) {
				if(arr[i] < 0) {
					i++;
				} else {
					foundP(arr, i, j);
					x--;
				}
			}
			for(int q = 0;q<n;q++) {
				System.out.print(arr[q] + " ");
			}
			System.out.println();
		}
		

	}

}
