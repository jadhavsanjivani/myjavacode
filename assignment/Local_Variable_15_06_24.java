package basicJava;

public class Local_Variable_15_06_24 {
	static int z = 100; // global variable 
	String name = "Sanji"; // global variable
	double y; // global variable, with default value
	boolean r;  // global variable, with default value
	String g; // global variable, with default value
	
	
	
	void add()
	{
		int a = 100; // here a is local variable
		System.out.println(a*z);
		System.out.println(name);
		System.out.println(y);
		System.out.println(r);
		System.out.println(g);
		
	}
	
	static void sub()
	{
		double d = 3.87765; // local variable
		int c = 23232; // local variable
		Local_Variable_15_06_24 lv1 = new Local_Variable_15_06_24();
		System.out.println(d*z);
		System.out.println(lv1.name);
		System.out.println(lv1.y);
		System.out.println(lv1.r);
		System.out.println(lv1.g);
		
	}
	public static void main(String[] args) {
		String s = "Name"; // Local Variable
		Local_Variable_15_06_24 lv = new Local_Variable_15_06_24();
		System.out.println(lv.name);
		System.out.println(lv.y);
		System.out.println(lv.r);
		System.out.println(lv.g);
		lv.z = 500;
		System.out.println(z);
	
	}
}
