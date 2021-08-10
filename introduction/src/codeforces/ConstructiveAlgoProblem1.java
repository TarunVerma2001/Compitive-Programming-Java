package codeforces;
import java.util.*;
public class ConstructiveAlgoProblem1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n , t;
		n = sc.nextInt();
		t = sc.nextInt();
		String s = new String();
		s = sc.next();
		char[] arr = new char[n];
		for(int i = 0;i<n;i++) {
			arr[i] = s.charAt(i);
		}
//		System.out.println(s);
//		for(int i =0;i<n;i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
		for(int j = 0;j<t;j++) {
			for(int i =0;i<n-1;i++) {
				if(arr[i] == 'B' && arr[i+1] != arr[i]) {
					char temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					i++;
				}
			}
////			for(int i =0;i<n;i++) {
//				System.out.print(arr[i] + " ");
//			}
//			System.out.println();
		}
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		

	}

}
