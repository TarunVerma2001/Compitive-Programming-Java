package codeforces;
import java.util.*;
public class InsomniaCure {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		for(int i =0;i<4;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int d;
		d = sc.nextInt();
		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;
		int temp4 = 0;
//		if(arr[0] == 1 || arr[1] == 1 || arr[2] == 1 || arr[3] == 1) {
//			System.out.println(d);
//			break;
//		}
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 1;temp1 <= d  || temp2 <= d || temp3 <= d || temp4 <= d;i++) {
			temp1 = arr[0] * i;
//			System.out.println("temp 1 : " + temp1);
			temp2 = arr[1] * i;
//			System.out.println("temp 2 : " + temp2);
			temp3 = arr[2] * i;
//			System.out.println("temp 3 : " + temp3);
			temp4 = arr[3] * i;
//			System.out.println("temp 4 : " + temp4);
			if(temp1 <= d)
				set.add(temp1);
			if(temp2 <= d)
				set.add(temp2);
			if(temp3 <= d)
				set.add(temp3);
			if(temp4 <= d)
				set.add(temp4);
		}
//		System.out.println(set);
		System.out.println(set.size());
		
		
	}

}
