package oops;

class vehicle {
	int wheels;
	int headLights;
	String color;
	
	vehicle(int wheels) {
		this.wheels = wheels;
		headLights = 2;
		color = "white";
	}
	vehicle(int wheels, String color){
		this.wheels = wheels;
		this.color = color;
	}
}

public class MyConstructors {
	
	MyConstructors() {
		System.out.println("object is now created");
	}

	public static void main(String[] args) {

		//MyConstructors obj = new MyConstructors();
		vehicle car = new vehicle(4);
		vehicle car2 = new vehicle(2);
		vehicle eRikshaw = new vehicle(3, "Yellow");
		
		System.out.println(car.wheels + " wheels and " + car.color +" color");
		System.out.println(car2.wheels + " wheels and " + car2.color + " color");
		System.out.println(eRikshaw.wheels + " wheels and color " + eRikshaw.color);
		
		
	}

}
