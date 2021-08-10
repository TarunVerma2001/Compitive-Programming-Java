package codeforces;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       int sum = n * (n+1) / 2;
	       int temp = 1;
	       for(int i = 1;i<=n;i++){
	            if(i % 2 == 0){
	                for(int j = 1;j<=i;j++){
	                        System.out.print(temp + " ");
	                        temp ++;
	                }
	                System.out.println();
	            } else {
	                int temp2 = temp + i - 1;
	                for(int j = 1;j<=i;j++){
	                    System.out.print(temp2 + " ");
	                    temp2--;
	                    temp ++;
	                }
	                System.out.println();
	            }
	       }

	}

}
