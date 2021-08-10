package Methods;

public class introduction {

	public static void main(String[] args) {

	    int firstNumber = 34;
		int secondNumber = 23;
		int result = maxOf(firstNumber, secondNumber);
		System.out.println(result);
		maxOf(100, 200);
		sayHi(); 
	}
	static int maxOf(int a, int b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
	}
	static void sayHi() {
		System.out.println("Hii Good Morning");
	}

}
