package oops.inheritence;

public class Singer extends Person {
	
	

	public Singer(String name) {
		super(name);
		
	}
	public void sing() {
		System.out.println("singer is teaching");
	}
	public void eat() {
		System.out.println("singer " + name + " is eating");
	}
	
	public static void laughing() {
		System.out.println("singer is laughing");
	}
}
