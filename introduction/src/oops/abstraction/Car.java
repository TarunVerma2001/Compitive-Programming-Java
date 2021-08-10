package oops.abstraction;

public abstract class Car {

	public abstract void accelerate();
	
	public abstract void breaking();
	
	public void honk() { //concrete method
		System.out.println("car is honking");
	}
}
