package oops.inheritence;

public class Teacher extends Person{
	
	public Teacher(String name) {
		super(name);
		System.out.println("inside teacher constructer");
	}

	public void teach() {
		System.out.println(name +" is teaching");
	}
	public void eat() {
		super.eat();
		System.out.println("teacher " + name + " is eating");
	}
	
	public static void laughing() {
		System.out.println("teacher is laughing");
	}
}
