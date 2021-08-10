package OctoberLongChallenge;
import java.util.*;
public class ReplaceX {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int p = sc.nextInt();
			int k = sc.nextInt();
			int arr[] = new int[n];
			for(int i =0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			for(int i =0;i<n;i++) {
				System.out.print(arr[i] + " ");
			}System.out.println();
			if(arr[p] == x) {
				System.out.println("0");
			} else if(k >= p && arr[p-1] >= x) {
				int temp = 0;
				for(int i = p-2;i>=0;i--) {
					if(arr[i] > x) {
						temp ++;
					} else {
						break;
					}
				}
				System.out.println(temp+1);
				
			} else if(k <= p && arr[p-1] <= x) {
				int temp = 0;
				for(int i = p;i<n && i >=0;i++) {
					if(arr[i] < x) {
//						System.out.println("inside ");
						temp ++;
					} else {
						break;
					}
				}
				System.out.println(temp + 1);
				
			} else {
				System.out.println("-1");
			}
		}
		
	}

}
