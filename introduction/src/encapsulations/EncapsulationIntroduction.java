package encapsulations;

import java.util.Scanner;

public class EncapsulationIntroduction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student obj = new Student();
//		obj.name = "Tom";
//		obj.age = 56;
		
		obj.setAge(12);
		
		System.out.println(obj.getAge());
			
		
		
		
	}

}
