package codeforces;
import java.util.*;
public class patternZ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n - 2;
		for(int i = 1;i<= n;i++) {
			System.out.print("*");
		}
		System.out.println();
//		System.out.println();
		for(int i = 1;i<=temp;i++) {
			System.out.print(" ");
//			for(int j = 1;j<=temp;j++) {
			for(int o = 1;o<=temp-i;o++) {
				System.out.print(" ");
			}
			for(int o = temp - i + 1;o <= temp - i + 1;o++) {
				System.out.print("*");
			}
			for(int j = temp - i + 2;j<=temp;j++) {
				System.out.print(" ");
			}
			System.out.print(" ");
			System.out.println();
//			System.out.println();
			
		}
		for(int i = 1;i<= n;i++) {
			System.out.print("*");
		}

	}

}
