package basicJava;

public class Constructor_13_06_2024 {
	
	/* Constructor is special type of method, 
	1.it does not have return type,
	2. It is always non-static in nature
	3. Constructor can be parameterize or non-parameterize
	4. It will always have same name as class name
	5. It can have Different access Specifiers*/
 
	Constructor_13_06_2024() {
		System.out.println("This is Constructor");
		
	}

	public static void main(String[] args) {
		// 2 different ways to call Constructor
		Constructor_13_06_2024 c = new Constructor_13_06_2024();// by creating an object
		new Constructor_13_06_2024();// or just like this
	}
	

}
