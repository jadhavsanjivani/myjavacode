package basicJava;

public class Method_Overloading_13_06_2024 {
	
	static void add() {
		System.out.println("Method 1");
	}
	static void add(int a) {
		System.out.println("Method 2");
	}
	static void add(int a, int b) {
		System.out.println("Method 3");
	}
	static void add(double a) {
		System.out.println("Method 4");
	}
	static void add(char a) {
		System.out.println("Method 5");
	}
	static void add(boolean a) {
		System.out.println("Method 6");
	}
	static void add(String a) {
		System.out.println("Method 7");
	}
	static void add(int a, double b) {
		System.out.println("Method 8");
	}
	static void add(double a, int b) {
		System.out.println("Method 9");
	}
	static void add(int a, boolean b , char c,double d, String s ) {
		System.out.println("Method 10");
	}
	public static void main(String[] args) {
		add();
		add(10);
		
	}
}
