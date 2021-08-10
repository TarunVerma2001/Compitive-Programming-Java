package OctoberLongChallenge;
import java.util.*;
public class PositiveAnd3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
//		ArrayList<Integer> seq = new ArrayList<Integer>();
//		seq.add(1);
//		seq.add(3);
//		seq.add(2);
//		seq.add(6);
//		seq.add(5);
//		seq.add(4);
		int t = sc.nextInt();
		for(int o =0;o<t;o++) {
			int n = sc.nextInt();
			
			ArrayList<Integer> seq = new ArrayList<Integer>();
			seq.add(1);
			seq.add(3);
			seq.add(2);
			seq.add(6);
			seq.add(5);
			seq.add(4);
			int arr2[] = {1, 3, 2, 6, 5, 4};
			
			if(n == 1) {
				System.out.println(1);
				continue;
			}
			if(n == 3) {
				System.out.println("1 3 2");
				continue;
			}
			if(n == 5) {
				System.out.println("2 3 1 5 4");
				continue;
			}
			if(n == 6) {
				System.out.println("1 3 2 6 5 4");
				continue;
			}
			double a = Math.log(n)/Math.log(2);
			int a1 = (int)a;
			double b = a - a1;
			if(b == 0) {
				System.out.println("-1");
				continue;
			}
			int arr[] = new int[n];
//			if(n > seq.size()) {
//				for(int i =0;i<n;i++) {
//					arr[i] = i+1;
//				}
//				int index = 0;
//				for(int i = seq.size();i<n;i++) {
//					int temp = arr[i];
//					double aa1 = Math.log(temp)/Math.log(2);
//					int a2 = (int)aa1;
//					double b1 = aa1 - a2;
//					if(b1 == 0) {
//						index = temp;
//						continue;
//					} else {
//						seq.add(temp);
//						if(index != 0) {
//							seq.add(index);
//							index = 0;
//						}
//					}
//				}
//				
//				for(int i =0;i<seq.size();i++) {
//					System.out.print(seq.get(i) + " ");
//				}
//				System.out.println();
//				
//			} 
//		}
			if(n > 6) {
				System.out.print("1 3 2 6 5 4 ");
				for(int i =0;i<n;i++) {
					arr[i] = i+1;
				}
				int index = 0;
				for(int i = 6;i<n;i++) {
					int temp = arr[i];
					double aa1 = Math.log(temp)/Math.log(2);
					int a2 = (int)aa1;
					double b1 = aa1 - a2;
					if(b1 == 0) {
						index = temp;
						continue;
					} else {
//						seq.add(temp);
						System.out.print(temp + " ");
						if(index != 0) {
//							seq.add(index);
							System.out.print(index + " ");
							index = 0;
						}
					}
				}
				System.out.println();
			}
				
//				for(int i =0;i<seq.size();i++) {
//					System.out.print(seq.get(i) + " ");
//				}
//				System.out.println();
				
//			} 
			
//		}
//			else {
//				for(int i =0;i<n;i++) {
//					arr[i] = i+1;
//				}
//				int index = 0;
//				for(int i = seq2.size();i<n;i++) {
//					int temp = arr[i];
//					double aa1 = Math.log(temp)/Math.log(2);
//					int a2 = (int)aa1;
//					double b1 = aa1 - a2;
//					if(b1 == 0) {
//						index = temp;
//						continue;
//					} else {
//						seq2.add(temp);
//						if(index != 0) {
//							seq2.add(index);
//							index = 0;
//						}
//					}
//				}
//				
//				for(int i =0;i<seq.size();i++) {
//					System.out.print(seq.get(i) + " ");
//				}
//				System.out.println();
//			}
//		}

	}

}
}
