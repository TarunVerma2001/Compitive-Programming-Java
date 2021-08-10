package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {

		Dog d = new Dog();
		
		Pet p = d;//upcasting
		//on runlime compiler find that
		//the pet is object of the dog 
		//as we defined
		Animal a = d;//upcasting (a dog is a animal)
		d.walk();
		p.walk();
//		greetings("hello good morning", 5);
		
		System.out.println(d.name);
		System.out.println(p.name);
		
	}
//	public static void greetings() {
//		System.out.println("hi, there");
//	}
//	public static void greetings(String s) {
//		System.out.println(s);
//	}
//	public static void greetings(String s, int count) {
//		for(int i=0;i<count;i++) {
//			System.out.println(s);
//		}
//	}

}
