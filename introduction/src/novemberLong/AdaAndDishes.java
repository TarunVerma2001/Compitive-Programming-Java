package novemberLong;
import java.util.*;
public class AdaAndDishes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			boolean similr = true;
			for(int i =0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			int temp = arr[0];
			for(int i = 1;i<n;i++) {
				if(arr[i] != temp) {
					similr = false;
					break;
				}
			}
			if(similr == true) {
				if(n % 2 == 0) {
					System.out.println((n/2) * temp);
				} else {
					System.out.println(((n/2) + 1) * temp);
				}
				continue;
			}
			Arrays.sort(arr);
			boolean tempres = true;
			int res = 0;
//			for(int i = n-1;i>=0;i--) {
//				res += arr[i-1];
//				if(arr[i-1] != arr[i]) {
//					
//				}
//			}
			int x = n-1;
			
			int a = 0;
			int b = 0;
			int i = n-1;
			int j = i-1;
			while(tempres == true ) {
				
				if(a == 0) {
					if(i > 0) {
						a = arr[i];
						System.out.println("a : " + a);
					} else {
						if(b != 0) {
							res += b;
							System.out.println("res : " + res);
							tempres = false;
							continue;
						}
					}
				}
				if(b == 0) {
					if(j > 0) {
						b = arr[j];
						System.out.println("b : " + b);
					} else {
						if(a != 0) {
							res += a;
							System.out.println("res : " + res);
							tempres = false;
							continue;
						}
					}
				}
				if(a != b) {
					if(a > b) {
						res += b;
						a = a - b;
						b = 0;
						j--;
						i = j;
						System.out.println("a : " + a);
						System.out.println("b : " + b);
						System.out.println("res : " + res);
					} else {
						res += a;
						b = b-a;
						a = 0;
						i--;
						j = i;
						System.out.println("a : " + a);
						System.out.println("b : " + b);
						System.out.println("res : " + res);
					}
				} else {
					res += a;
					a =0;
					b = 0;
					System.out.println("a : " + a);
					System.out.println("b : " + b);
					System.out.println("res : " + res);
				}
			}	
			
			System.out.println(res);
				
				
			
			
		}
		

	}

}
