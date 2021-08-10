package DecemberLongChallenge;
import java.util.*;


public class hailXOR3 {

	
	public static void foundP(int arr[], int i, int j, int p) {
		
//		int p = (int) Math.floor(Math.log(arr[i])/Math.log(2));
//		System.out.println(temp);
		
		arr[i] = arr[i] ^ (int)(Math.pow(2, p));
		arr[j] = arr[j] ^ (int)(Math.pow(2, p));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int arr[] = new int[n];
			for(int i =0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			int i = 0;
			int j = i + 1;
			
			while(x > 0 && i < j) {
//				j = i + 1;
				System.out.println(" hii");
				if(arr[i] == 0) {
					System.out.println("hey");
					i++;
					if((j + 1) >= i) {
						j++;
					}
					continue;
				} else {
					System.out.println("Hello");
					int p = (int) Math.floor(Math.log(arr[i])/Math.log(2));
					if(arr[j] < Math.pow(2, p)) {
						boolean changed = false;
					
						for(int u = i+1;u<n;u++) {
							if(arr[u] < Math.pow(2, p)) {
								continue;
							} else {
								j = u;
								changed = true;
								break;
								
							}
						}
						if(changed == true) {
							foundP(arr, i, j, p);
							System.out.println("i and j :" + i + j);
							System.out.println(arr[i] + "::" + arr[j]);
							x--;
						} else {
							j = n - 1;
						}
					} else {
						foundP(arr, i, j, p);
						System.out.println("i and j :" + i + j);
						System.out.println(arr[i] + "::" + arr[j]);
						x--;
					}
				}
			}
			for(int xy =0;xy<n;xy++) {
				System.out.print(arr[xy] + " ");
			}
			System.out.println();
		}
	}

}
