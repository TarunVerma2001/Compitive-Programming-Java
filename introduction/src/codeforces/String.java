package codeforces;
import java.util.*;
public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			char[] arr = new char[n];
			for(int i =0;i<k;i++) {
				arr[i] = 'a';
			}
			for(int i = 0;i<n-k;i++) {
				if(((i+1) + 2) % 3 == 0) {
					arr[i+k] = 'b';
				} else if(((i+1)+1) % 3 == 0) {
					arr[i+k] = 'c';
				} else if(((i+1)+0) % 3 == 0) {
					arr[i+k] = 'a';
				}
				
			}
			for(int i =0;i<n;i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}

}
