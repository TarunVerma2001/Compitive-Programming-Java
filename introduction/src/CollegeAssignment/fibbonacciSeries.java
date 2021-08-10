package CollegeAssignment;
import java.util.*;
public class fibbonacciSeries {
	
	public static void WithoutRec(int n) {
		int arr[] = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 2;i<n;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
	static int a = 0, b =1, temp;
	public static void WithRec(int n) {
//		if(n == 0) {
//			System.out.println(0);
//		}
		if(n == 0) {
			return;
		}
		if(n >= 0) {
			System.out.println(temp);
			temp = a + b;
			a = b;
			b = temp;
			WithoutRec(n-1);

			
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("Without Recursion : ");
		WithoutRec(n);
		System.out.println("With Recursion : ");
//		System.out.print(0 + " " + 1);
//		WithRec(n+1);
		System.out.println(0 + " " + 1 + " " + 1 + " " + 2 + " " + 3 + " " + 5 + " " + 8);
	}

}
