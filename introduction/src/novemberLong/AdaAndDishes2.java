package novemberLong;
import java.util.*;
public class AdaAndDishes2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o = 0;o<t;o++) {
			int n = sc.nextInt();
			int[] arr = new int [n];
			for(int i =0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			int temp = arr[0];
			boolean similar = true;
			for(int i = 1;i<n;i++) {
				if(arr[i] != temp) {
					similar = false;
					break;
				}
			}
			if(similar == true) {
				if(n % 2 == 0) {
					System.out.println((n / 2) * temp);
					continue;
				} else {
					System.out.println(((n / 2) + 1) * temp);
					continue;
				}
			}
			Arrays.sort(arr);
			int a = 0;
			int b = 0;
			int res = 0;
			int i = n - 1;
			while (i >= 0) {
				if(a == 0) {
					if(i < 0) {
						break;
					}
					a = arr[i];
					i--;
					System.out.println("a : " + a);
					System.out.println("i : " + i);
					System.out.println("res : " + res);
				}
				if(b == 0) {
					if(i < 0) {
						break;
					}
					b = arr[i];
					i--;
					System.out.println("b : " + b);
					System.out.println("i : " + i);
					System.out.println("res : " + res);
				}
				if(a != b) {
					if(a > b) {
						a = a-b;
						res += b;
						b = 0;
						System.out.println("a : " + a);
						System.out.println("b : " + b);
						System.out.println("res : " + res);
						System.out.println("i : " + i);
					} else {
						b = b - a;
						res += a;
						a = 0;
						System.out.println("a : " + a);
						System.out.println("b : " + b);
						System.out.println("res : " + res);
						System.out.println("i : " + i);
					}
				} else {
					res += a;
					a = 0;
					b = 0;
					System.out.println("a : " + a);
					System.out.println("b : " + b);
					System.out.println("res : " + res);
					System.out.println("i : " + i);
					
				}
			}
			if(b != 0) {
				res += b;
				System.out.println("res : " + res);
			} if(a != 0) {
				res += a;
				System.out.println("res : " + res);
			}
			System.out.println(res);
		}
		
		
	}

}
