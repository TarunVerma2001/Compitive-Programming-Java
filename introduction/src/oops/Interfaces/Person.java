package oops.Interfaces;

public class Person implements Student, Youtuber{

	public static void main(String[] args) {

		Person obj = new Person();
		obj.study();
		obj.makeVideo();
		
		Youtuber obj2 = obj;//upcasting can be done
		obj2.editVideo();//as person is a youtuber
		obj2.makeVideo();// but now obj2 is only youtuber
//		obj2.study();// not possible
	}

	@Override
	public void study() {
		System.out.println("person is studying");
	}

	@Override
	public void makeVideo() {
		System.out.println("person is making a good video");
	}

	@Override
	public void editVideo() {
		System.out.println("youtuber is editing");
	}
	@Override
	public void uploadVideo() {
		
	}

}
