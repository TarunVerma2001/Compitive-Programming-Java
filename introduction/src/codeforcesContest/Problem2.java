package codeforcesContest;
import java.util.*;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(;t>0;t--) {
			int n = sc.nextInt();
			if(n < 2020)
				System.out.println("NO");
			else {
				int temp = n / 2000;
				int temp2 = n - (temp * 2000);
//				int temp3 = temp2 / 20;
				temp2 = temp2 - (temp * 20);
				if(temp2 >= 0 && temp2>=0 && temp2 <= temp)
					System.out.println("Yes");
				else
					System.out.println("NO");
			}
		}
	}

}
