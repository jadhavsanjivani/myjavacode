package basicJava;

public class Non_Static_MethodOverloading_13_06_2024 {
	
	void add() {
		System.out.println("Non-Static method 1");
	}
	void add(char c) {
		System.out.println("Non-Static method 2");
	}
	void add(boolean b) {
		System.out.println("Non-Static method 3");
	}
	void add(String s) {
		System.out.println("Non-Static method 4");
	}
	static void add(int a) {
		System.out.println("Static method 1");
	}
	public static void main(String[] args) {
		Non_Static_MethodOverloading_13_06_2024 nm = new Non_Static_MethodOverloading_13_06_2024(); 
	nm.add();
	nm.add(true);
	nm.add('S');
	nm.add("Sanjivani");
	//nm.add(12); I can call static method like this but best practice is below
	add(12);
	
	
	
	}
	
}
