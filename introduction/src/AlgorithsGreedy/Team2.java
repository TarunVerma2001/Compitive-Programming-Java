	package AlgorithsGreedy;
	
	import java.util.Arrays;
	import java.util.Scanner;
	
	public class Team2 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner (System.in);
			int t = sc.nextInt();
			for(int o =0;o<t;o++) {
				int n = sc.nextInt();
				int arr1[] = new int[n];
				int arr2[] = new int[n];
				int a1[] = new int[n];
				int a2[] = new int[n];
				for(int i = 0;i<n;i++) {
					arr1[i] = sc.nextInt();
					a1[i] = arr1[i];
				}
				for(int i = 0;i<n;i++) {
					arr2[i] = sc.nextInt();
					a2[i] = arr2[i];
				}
				int ans = 0;
				Arrays.sort(a1);
				Arrays.sort(a2);
				for(int i =0;i<n;i++) {
					int temp1 = arr1[i] - a1[0];
					int temp2 = arr2[i] - a2[0];
					if(temp1 == temp2) {
						ans += temp1;
					} else if(temp1 > temp2) {
						ans += (temp2 + (temp1-temp2));
					} else {
						ans += (temp1 + (temp2-temp1));
					}
					
				}
				System.out.println(ans);
			}
			
		}
	
	}
