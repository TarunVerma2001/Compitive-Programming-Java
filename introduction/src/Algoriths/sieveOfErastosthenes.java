package Algoriths;
import java.util.*;
public class sieveOfErastosthenes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		boolean [] mark = new boolean[n+1];
		for(int i =0;i<=n;i++) {
			mark[i] = true;
		}

		for(int p = 2;p*p <= n;p++) {
			if(mark[p] == true) {
				for(int i = p*p;i<=n;i+=p) {
					mark[i] = false;
				}
			}
		}
		System.out.println("Following numbers are Prime numbers less then " + n + " : ");
		for(int i =2;i<=n;i++) {
			if(mark[i] == true) {
				System.out.print(i + " ");
			}
		}
		
		

	}

}
