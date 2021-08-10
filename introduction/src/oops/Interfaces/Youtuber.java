package oops.Interfaces;

public abstract interface Youtuber extends VideoEditor{

	abstract void makeVideo();
	
	default void uploadVideo() { //  now it is a chance of 
		System.out.println("hii"); // occuring of the diamond problem
	}
}
