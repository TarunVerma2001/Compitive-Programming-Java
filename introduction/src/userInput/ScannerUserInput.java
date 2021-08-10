package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int principle = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		
		float simpleInterest = principle*rate*time/100;
		
		System.out.println("the simple interest is " + simpleInterest);
		
	}

}
