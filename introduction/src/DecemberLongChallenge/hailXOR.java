package DecemberLongChallenge;
import java.util.*;
public class hailXOR {

	public static void foundP(int arr[], int i, int j) {
		
		int p = (int) Math.floor(Math.log(arr[i])/Math.log(2));
//		System.out.println(temp);
		
		arr[i] = arr[i] ^ (int)(Math.pow(2, p));
		arr[j] = arr[j] ^ (int)(Math.pow(2, p));
		
	}
	
	public static void Optional(int arr[], int n, int x) {
//		int p = (int) Math.floor(Math.log(arr[n-2])/Math.log(2));
//		arr[n-2] = arr[n-2] ^ (int)(Math.pow(2, p));
//		arr[n-2] = arr[n-1] ^ (int)(Math.pow(2, p));
		int i, j;
		for(int u =0;u<n;u++) {
			if(arr[u] == 0) {
				continue;
			} else {
				i = u;
				j = i+1;
				for(int xyz = x;xyz>0;xyz--) {
					if(arr[i] == 0) {
						break;
					}
					int p = (int) Math.floor(Math.log(arr[n-2])/Math.log(2));
					arr[i] = arr[i] ^ (int)(Math.pow(2, p));
					arr[j] = arr[j] ^ (int)(Math.pow(2, p));
					System.out.println(arr[i] + "::" + arr[j]);
				}
			}
		}
//		for(int i = 0;i<x;i++) {
//			int p = (int) Math.floor(Math.log(arr[n-2])/Math.log(2));
//			arr[n-2] = arr[n-2] ^ (int)(Math.pow(2, p));
//			arr[n-1] = arr[n-1] ^ (int)(Math.pow(2, p));
//			System.out.println(arr[n-2] + "::" + arr[n-1]);
//		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int arr[] = new int[n];
			for(int i =0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
//			Arrays.sort(arr);
			int i = 0;
			int j = i+1;
			while(i < j && i < n-1 && j < n && x>0) {
				if(x > 0) {
					if(arr[i] > 0) {
						if(arr[j] > 0) {
							System.out.println("i ans j are : " + i + " " + j);
							foundP(arr, i, j);
							System.out.println(arr[i] + "::::" + arr[j]);
							x--;
							System.out.println("x : " + x);
						} else {
							
							j++;
							System.out.println("j :  "+ j);
							continue;
							
						}
					} else {
						i++;
						j++;
						System.out.println("i ans j are : " + i + " " + j);
					}
				}
			}
			if(x != 0) {
				Optional(arr, n, x);
			}
			
//			System.out.println(" x : " + x);
			
			Arrays.sort(arr);
			
			for(int u = 0;u<n;u++) {
				System.out.print(arr[u] + " ");
			}
			System.out.println();
			
			
			
			
		}
		
	}

}
