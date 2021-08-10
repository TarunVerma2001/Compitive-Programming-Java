package AugustLunchtime2020;

import java.util.*;

import someImpQuestions.interval;

public class ModeOfFrequencies {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			
			int n = sc.nextInt();
			List<Integer> numbers = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				numbers.add(sc.nextInt());
			}
			System.out.println(numbers);
			Collections.sort(numbers);
			System.out.println(numbers);
			int max1 = 0;
			
//			for(int i=0;i<n;i++) {
//				int k = numbers.get(i);
//				int v = Collections.frequency(numbers, k);
//				
//			}
			Map<Integer, Integer> fre = new HashMap<Integer, Integer>();
			for(int i=0;i<numbers.size();i++) {
				int k = numbers.get(i);
				int v = Collections.frequency(numbers, k);
				fre.put(k, v);
				i = i + v - 1;
			}
			System.out.println(fre);
			Collection<Integer> values = fre.values(); 
			System.out.println(values);
			List<Integer> values2 = new ArrayList<Integer>();
			for(int val : values) {
				values2.add(val);
			}
			Collections.sort(values2);
			System.out.println(values2);
			int max = 0;
			int max2 = 11;
			for(int i=0;i<values2.size();i++) {
				int temp = values2.get(i);
				System.out.println("temp " + temp);
				if(Collections.frequency(values2, temp) > max) {
					max = Collections.frequency(values2, temp);
					max2 = temp;
					System.out.println(max);
				}
//					if(max2 > temp) {
//						max = Collections.frequency(values2, temp);
//						max2 = temp;
//					}
//				}
				i = i + Collections.frequency(values2, temp) - 1;
			}
			for(int i=0;i<values2.size();i++) {
				int temp = values2.get(i);
				System.out.println("temp " + temp);
				if(Collections.frequency(values2, temp) > max) {
					
					if(max2 > temp) {
						max = Collections.frequency(values2, temp);
						max2 = temp;
					}
				}
				i = i + Collections.frequency(values2, temp) - 1;
			}
			
			System.out.println(max);
			System.out.println(max2);
			System.out.println(max2);
			
			t--;
		}

	}

}
