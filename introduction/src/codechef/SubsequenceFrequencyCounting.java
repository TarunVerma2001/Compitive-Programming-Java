package codechef;

import java.util.*;
public class SubsequenceFrequencyCounting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t != 0) {
			long n = sc.nextLong();
			List<Integer> numbers = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				int a = sc.nextInt();
				numbers.add(a);
			}
			List<Integer> sub = new ArrayList<Integer>();
			int arrSize = numbers.size();
//	        //start point
//	        for (int startPoint = 0; startPoint <arrSize ; startPoint++) {
//	            //group sizes
//	            for (int grps = startPoint; grps <=arrSize ; grps++) {
//	                //if start point = 1 then
//	                //grp size = 1 , print 1
//	                //grp size = 2, print 1 2
//	                //grp size = 3, print 1 2 3 ans so on
//	                for (int j = startPoint ; j < grps ; j++) {
//	                	sub.add(numbers.get(j));
//	                }
//	                System.out.println(sub);
//	                sub.clear();
//	            }
//	        }
			List<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<arrSize ;i++) {
				for(int j = arrSize;j > i;j--) {
					sub.clear();
					sub.addAll(numbers.subList(i, j));
					System.out.println("sub = " + sub);
					int test;
					test = countReccurence(sub);
					list.add(test);
					System.out.println("list : " + list);
				}
			}
			
			for(int i=1;i<=n;i++) {
				System.out.print(Collections.frequency(list, i) + " ");
			}
			
			t--;
		}
	}
	public static int countReccurence(List<Integer> subNum) {
		int count = 0;
		int temp2 = subNum.get(0);
		List<Integer> sub2 =new ArrayList<Integer>();
		sub2.addAll(subNum);
		int size = sub2.size();
		for(int i=0;i<size;i++) {
			int temp = sub2.get(i);
			System.out.println("temp = " + temp);
			if(Collections.frequency(sub2, temp) > count) {
				count = Collections.frequency(sub2, temp);
				temp2 = temp;
				System.out.println("temp2 :" + temp2);
			}
			else if(Collections.frequency(sub2, temp) == count) {
				count = Collections.frequency(sub2, temp);
				if(temp2 > temp) {
					temp2 = temp;
					System.out.println("temp2 : " + temp2);
				}
			}
		}
		return temp2;
	}
}
