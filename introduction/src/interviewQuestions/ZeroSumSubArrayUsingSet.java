package interviewQuestions;

import java.util.*;
/*
 * Given an Array ,  find if there exist a subarray
 *  with sum equals to zero
 *  n < 10^5
 *  this means your Solution should be of O(n) or
 *  O(nlogn)
 */

public class ZeroSumSubArrayUsingSet {

	public static void main(String[] args) {

		int a[] = {2, 1, -3, 4, 2};
		boolean found = false;
		
//		for(int i=0;i<a.length;i++) {
//			for(int j=i;j<a.length;j++) {
//				sum += a[j];
//				if(sum == 0) {
//					found = true;
//					break;
//				}
//			}
//			if(found) break;
//		}
		int k = -3;
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int element : a) {
			set.add(sum);
			sum += element;
			if(set.contains(sum - k)) {
				found = true;
				break;
			}
		}
		System.out.println("found : " + found);
		
	}

}
