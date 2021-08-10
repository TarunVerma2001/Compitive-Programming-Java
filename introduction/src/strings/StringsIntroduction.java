package strings;

public class StringsIntroduction {

	public static void main(String[] args) {
		
		String name = "Tarun verma";    //initialisation by literals
		
		String anotherName = new String("Aman");
		
		System.out.println(name.charAt(2));
		System.out.println(name.length());
		System.out.println(name.substring(6));
		System.out.println(name.substring(6, 9));
		System.out.println(name.contains("Tarun"));
		
		String surname = "verma";
		String surname1 = new String("verma");
		
		System.out.println(surname == surname1);
		System.out.println(surname.equals(surname1));
		String a = "";
		System.out.println(a.isEmpty());
		
		String p = "john";
		String q = "scott";
		String r = p + q;
		System.out.println();
		System.out.println(r);
		System.out.println(p.concat(q));
		
		System.out.println(r.replace('j','t'));
		
		String cars = "lamborghini,ferrari,swift,buggati,mustank";
		String allCars[] = cars.split(",");
		for(String car: allCars) {
			System.out.println(car);
		}
		
		System.out.println(cars.indexOf('m'));
		String test = "TarunVerma";
		System.out.println(test.toLowerCase());
		System.out.println(test.toUpperCase());
		
		
		String test2 = "   Tarun    ";
		System.out.println(test2 + "__" + name.trim());
		
		
	}

}
