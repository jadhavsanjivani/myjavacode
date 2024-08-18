package basicJava;

public class Non_StaticMethod_12_06_2024 {
	
	void add() {
		System.out.println("Call not-static non-parameterized method");
	}
	//static void add() { // you can't have same name for static and non-static method
	static void sub(int a, double b) {
		System.out.println(a-b);
	}
	
	void mul(double a, int b) {// non-static parameterize method
	System.out.println(a*b);
	}
	
	
public static void main(String[] args) {
	
	Non_StaticMethod_12_06_2024 ns = new Non_StaticMethod_12_06_2024 ();
	ns.add();
	sub(7, 4.456); // static parameterize method
	ns.mul(23.23432, 2342);
	
	
}
}
