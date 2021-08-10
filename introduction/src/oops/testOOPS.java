package oops;
import java.util.*;
class Laptop {
	Scanner sc = new Scanner(System.in);
	String laptopName;
	String laptopBrand;
	String laptopProcessor;
	float laptopPrice;
	
	public void setData() {
		this.laptopName = sc.next();
		this.laptopBrand = sc.next();
		this.laptopProcessor = sc.next();
		this.laptopPrice = sc.nextFloat();
	}
	public void getData() {
		System.out.println("name : " + laptopName);
	}
	
	
	
	
	
}

public class testOOPS {

	public static void main(String[] args) {

		Laptop laptop1 = new Laptop();
		Laptop laptop2 = new Laptop();
		laptop1.setData();
		laptop1.getData();
		System.out.println(laptop1.laptopName);
		

	}

}
