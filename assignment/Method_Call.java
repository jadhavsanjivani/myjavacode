package basicJava;

public class Method_Call {
	// Different Types of methods
	public static void example1() {
		System.out.println("Static method 1");
	}
	private static void example2() {
		System.out.println("Static method 2");
		
	}
	static void example3() {
		System.out.println("Static Method 3");
	}
	void example4() {
		System.out.println("Non-Static Method 1");
	}
	void example5() {
		System.out.println("Non-Static Method 2");
	}
	
public static void main(String[] args) {
	System.out.println("Diffrent Methods");
	example1();
	example2();
	example3();
	Method_Call mc = new Method_Call();
	mc.example4();
	mc.example5();
	
}
}
