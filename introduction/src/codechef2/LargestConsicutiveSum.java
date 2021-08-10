package codechef2;
import java.util.*;
public class LargestConsicutiveSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int size = 0;
		int temp = n;
		for(int i =0;temp != 0;i++) {
			temp = temp / 10;
			size++;
		}
		temp = n;
		System.out.println(size);
		int a[] = new int[size];
		for(int i =size-1;i>=0;i--) {
			a[i] = temp % 10;
			temp = temp / 10;
			System.out.println(a[i]);
		}
		int max = 0;
		for(int i =0;i<size;i++) {
			if(i == 0) {
				max += a[i];
			} else {
				if(a[i-1] < a[i]) {
					max += a[i];
				}
				else {
					
				}
			}
		}
		
	}

}
