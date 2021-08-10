package DecemberLongChallenge;
import java.util.*;

//import com.sun.tools.javac.code.Attribute.Array;

public class HaikXORTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		long k = 30;
		long t = sc.nextInt();
		for(long o =0;o<t;o++) {
			long n = sc.nextLong();
			long x = sc.nextLong();
			long arr[] = new long[(int) n];
			List<List<Integer>> List1 = new ArrayList<List<Integer>>();
			
			for(long as = 0;as<31;as++) {
				List<Integer> xyz = new ArrayList<Integer>();
				List1.add(xyz);
			}
			for(long i =0;i<n;i++) {
				arr[(int) i] = sc.nextLong();
				if(i == n-1)
					continue;
//				for(int as = 0;as<31;as++) {
//					List<Integer> xyz = new ArrayList<Integer>();
//					List1.add(xyz);
//				}
				for(long j = k;j>=0;j--) {
					if((arr[(int) i]&((int)1<<j)) != 0) {
						List1.get((int) j).add((int) i);
//						System.out.println(List1);
					}
				}
			}
			
//			System.out.println(List1);
			long arr1[] = new long[31];
			for(long i =0;i<31;i++) {
				arr1[(int) i] = 0;
			}
			boolean res = false;
			for(long i =0;i<n-1;i++) {
				if(res == true) {
					break;
				}
				res = false;
				for(long j = 30;j>=0;j--) {
					if((arr[(int) i] & ((long)1 << j)) == 0) {
						continue;
					} else {
						long temp = (int) Math.pow(2, j);
						long ans;
						arr[(int) i] ^= temp;
						arr1[(int) j] += 1;
						if(arr1[(int) j] < List1.get((int) j).size()) {
							
							ans = List1.get((int) j).get((int) arr1[(int) j]);
							arr1[(int) j] += 1;
							arr[(int) ans] ^= temp;
//							System.out.println("i : " + i);
//							System.out.println("j : " + j);
						} else {
							arr[(int) (n-1)] ^= temp;
						}
						x -= 1;
						if(x == 0) {
							res = true;
							break;
						}
					}
				}
				
			}
			if(x % 2 == 0) {
				for(int i =0;i<n;i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			} else {
				arr[(int) (n-1)] ^= 1;
				arr[(int) (n-2)] ^= 1;
				for(int i =0;i<n;i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
				
			}
			
//			System.out.println("x" + " : " + x);
			
		}
	}
}