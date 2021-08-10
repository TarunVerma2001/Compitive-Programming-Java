package OctoberLongChallenge;
import java.util.*;
public class AddSquare {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o = 0;o<t;o++) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arrx [] = new int[n];
			int arry [] = new int[m];
			for(int i =0;i<n;i++) {
				arrx[i] = sc.nextInt();
			}
			for(int i =0;i<m;i++) {
				arry[i] = sc.nextInt();
			}
			int arrA []= new int[n * (n-1) / 2];
			int arrB []= new int[m * (m-1) / 2];
			int temp = 0;
			for(int i = 0 ;i<n;i++) {
				for(int j = i+1;j<n;j++) {
//					System.out.println("j : " + j + " i : " + i);
//					System.out.println(arrx[j] + " "  + arrx[i]);
					arrA[temp] = arrx[j] - arrx[i];
					temp ++;
				}
			}
			temp = 0;
			for(int i = 0 ;i<m;i++) {
				for(int j = i+1;j<m;j++) {
					arrB[temp] = arry[j] - arry[i];
					temp ++;
				}
			}
			for(int i =0;i<arrA.length;i++) {
				System.out.print(arrA[i] + " ");
			}
			System.out.println();
			for(int i =0;i<arrB.length;i++) {
				System.out.print(arrB[i] + " ");
			}
			System.out.println();
			
			
		}

	}

}
