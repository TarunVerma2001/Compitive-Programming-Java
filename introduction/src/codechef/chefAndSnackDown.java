package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class chefAndSnackDown {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			ArrayList <Integer> years = new ArrayList<>();
			years.add(2010);
			years.add(2015);
			years.add(2016);
			years.add(2017);
			years.add(2019);
			if(years.contains(n)) {
				System.out.println("HOSTED");
			}
			else {
				System.out.println("NOT HOSTED");
			}
		}
		
		
		
	}

}
