package codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ChefAndWedding3 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			List<Integer> family = new ArrayList<Integer>();
			List<Integer> family2 = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				int a = sc.nextInt();
				family.add(a);
				family2.add(a);
			}
//			System.out.println(family);
//			int count1 = 0;
//			count1 = conflict(family2);
			int count = 0;
			List<Integer> air = new ArrayList<Integer>();
			List<List<Integer>> subFamily = new ArrayList<List<Integer>>();
			for(int i = 0;family.size() != 0; i++) {
				air = make(family);
				subFamily.add(air);
				if(air.isEmpty() == false) {
					count++;
					family = removeE(family, air.size());
				}else {
					break;
				}
			}
//			int countF[] = new int[subFamily.size() + 1];
//			List<Integer> countF = new ArrayList<Integer>();
			List<Integer> result = new ArrayList<Integer>();
//			countF.add(count1);
			result.add(k * subFamily.size());
			int size = subFamily.size();
//			sub1.addAll(subFamily.get(subFamily.size() - 1));
//			subFamily.remove(subFamily.size()-1);
//			System.out.println(subFamily);
			List<Integer> sub1 = new ArrayList<Integer>();
			List<Integer> sub2 = new ArrayList<Integer>();
//			for(int i = 0;i<size;i++) {
//				sub1.addAll(subFamily.get(i));
////				sub2.addAll(subFamily.get(i));
////				System.out.println("sub1" + sub1);
//				int temp = conflict(sub1);
////				System.out.println("temp " + temp);
//				result.add((k * (size - i)) + temp);
////				System.out.println("result = " + result);
//			}
			System.out.println("result1 = " + result);
			for(int i = 1;i<=size;i++) {
//				System.out.println("i = " + i);
				for(int j=0;j < size - i + 1;j++) {
					sub2.clear();
//					System.out.println("j = " + j);
					for(int l=1;l<=i;l++) {
//						System.out.println(" l = " + l);
						sub2.addAll(subFamily.get(j + l - 1));
//						System.out.println("sub2 = " + sub2);
//						int temp = conflict(sub2);
//						System.out.println("temp2 : " + temp);
//						System.out.println("(size - i + 1) : " + (size - i + 1));
//						result.add((k * (size - i + 1)) + temp);
//						System.out.println("result2 = " + result);
					}
					int temp = conflict(sub2);
//					System.out.println("temp2 : " + temp);
//					System.out.println("(size - i + 1) : " + (size - i + 1));
					result.add((k * (size - i + 1)) + temp);
					System.out.println("result2 = " + result);
					Collections.sort(result);
					System.out.println(result);
					int small = result.get(0);
					result.clear();
					result.add(small);
					System.out.println(result);
				}
			}
			
//			List<Integer> sub2 = new ArrayList<Integer>();
			
//			for(int i=size;i>1;i--) {
//				sub1.addAll(subFamily.get(i - 1));
//				sub2.addAll(subFamily.get(i - 2));
//				System.out.println("sub1 : " + sub1);
//				System.out.println("sub2 : " + sub2);
//				sub1.addAll(sub2);
//				System.out.println("sub1 = " + sub1);
//				subFamily.remove(i -1);
//				subFamily.remove(i - 2);
//				System.out.println("subFamily : " + subFamily);
//				subFamily.add(i - 2, sub1);
//				System.out.println("subFamily : " + subFamily);
//				int temp = conflict(subFamily.get(subFamily.size() - 1));
//				result.add((k * subFamily.size()) + temp);
//				sub1.clear();
//				sub2.clear();
//			}
//			System.out.println("result = " + result);
			Collections.sort(result);
//			System.out.println("result = " + result);
			System.out.println(result.get(0));
//			System.out.println("count1 = " + countF.get(0));
//			System.out.println(family);
//			System.out.println(count);
//			System.out.println(count1);
			
//			System.out.println(Math.min(k * count, k + count1));
//			System.out.println(subFamily);
			
			
			t--;
		}
	}
	public static List<Integer> make(List<Integer> family) {
		int count = 0;
		List<Integer> air = new ArrayList<Integer>();
		for(int i=0;i<family.size();i++) {
			if(i == 0) {
				air.add(family.get(i));
//				System.out.println(air);
			}else {
				if(air.contains(family.get(i)) == false) {
					air.add(family.get(i));
//					System.out.println(air);
					continue;
				} else {
					count++;
//					System.out.println(count);
					break;
				}
			}
		}
		return air;
	}
	public static List<Integer> removeE(List<Integer> family , int a){
		for(int i=0;i<a;i++) {
			family.remove(0);
//			System.out.println(family);
		}
		return family;
	}
	public static int conflict(List<Integer> f){
		int count1 = 0;
		List<Integer> fa = new ArrayList<Integer>();
		fa.addAll(f);
		for(int i = 0;fa.size() != 0;i++) {
			List<Integer> a = new ArrayList<Integer>();
			a.add(fa.get(0));
//			System.out.println(a);
			int b = Collections.frequency(fa, a.get(0));
//			System.out.println(b);
			if(b > 1){
				count1 += b;
//				System.out.println(count1);
			}
			fa.removeAll(a);
			a.clear();
//			System.out.println(f);
		}
//		System.out.println(count1);
		return count1;
	}

}
