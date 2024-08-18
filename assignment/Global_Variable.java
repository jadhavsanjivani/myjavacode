package basicJava;

public class Global_Variable {
	int a = 100;
	static int b = 200;
	static double pi = 3.14;
	
	static void radius() 
	{
		int rd = 10;
		double area = pi*rd*rd;
		System.out.println(area);
		Global_Variable gv = new Global_Variable();
		System.out.println(gv.a);
		
	}
	public static void main(String[] args) {
		int r = 5;
		double area_of_circel = pi*r*r;
		System.out.println(area_of_circel);
		
		radius();
		Global_Variable gv = new Global_Variable();
       gv.a = 300;
		System.out.println(gv.a);
		
	}

}
