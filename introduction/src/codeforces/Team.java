package codeforces;
import java.util.*;
public class Team {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int ans = 0;
		for(int o=0;o<n;o++) {
			int arr[] = new int [3];
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			arr[2] = sc.nextInt();
			int count = 0;
			if(arr[0] == 1) {
				count++;
			}
			if(arr[1] == 1) {
				count++;
				if(count >= 2) {
					ans++;
					continue;
				}
			} if(arr[2] == 1) {
				count++;
				if(count >= 2) {
					ans++;
					continue;
				}
			}
		}
		System.out.println(ans);
		
	}

}
