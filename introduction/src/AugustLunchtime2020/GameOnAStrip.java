package AugustLunchtime2020;
import java.util.*;
public class GameOnAStrip {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			int n = sc.nextInt();
			List<Integer> num = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				num.add(sc.nextInt());
			}
			System.out.println(num);
			int emax = 0;
			int omax = 0;
			int emax1 = 0;
			int omax1 = 0;
			for(int i=0;i<n;i++) {
				if(num.get(i) == 1) {
					continue;
				} else {
					int temp =0;
					for(int j = i;num.get(j) != 1;j++) {
						temp++;
						i++;
					}
					if(temp % 2 == 0) {
						emax1 ++;
						if(temp > emax) {
							emax = temp;
						}
					} else {
						omax1 ++;
						if(temp > omax) {
							omax = temp;
						}
					}
				}
			}
			System.out.println("emax : " + emax);

			System.out.println("omax : " + omax);
			System.out.println("emax1 : " + emax1);

			System.out.println("omax1 : " + omax1);
			if(omax != 0 && emax == 0 && emax < omax) {
				System.out.println("Yes");
			} else if(omax != 0 && emax != 0 && emax < omax) {
				System.out.println("Yes");
			}else if(omax != 0 && emax != omax && emax == omax+1) {
				System.out.println("Yes");
			}
			else if(omax != 0 && emax == 0 && omax1 >= 2) {
				
			}
			else {
				System.out.println("No");
			}
//				if(omax == 0 && emax == 0) {
//				System.out.println("No");
//			} else if(omax == 0 && emax != 0) {
//				System.out.println("No");
//			}
			
			
//			int temp = n - 2;
//			if(temp%2 != 0) {
//				System.out.println("Yes");
//			}else {
//				System.out.println("No");
//			}
//			
			t--;
		}
		
	}

}
