package basicJava;

public class Final_Variable_18_06_2024 {
	
	final int a =100;
	final static boolean b = true;
	
	static void method1()
	{
		//System.out.println(a);
		//b = false;  you can not update the value.
		Final_Variable_18_06_2024 fv = new Final_Variable_18_06_2024();
		System.out.println(fv.a);
		//fv.a = 200; you can not update the value.
	}
	public static void main(String[] args) {
		System.out.println(b);
		Final_Variable_18_06_2024 fv1 = new Final_Variable_18_06_2024();
		System.out.println(fv1.a);
		
		
	}

}
