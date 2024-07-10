package assignment;
public class Assignment_27_Method_Access_Specifier 
{
	public static void method1()
	{
		System.out.println("Method1 is public");
	}
	
	protected static void method2()
	{
		System.out.println("Method2 is protected");
	}
	
	 static void method3()
	{
		 System.out.println("Method3 is default");
	}
	
	private static void method4()
	{
		System.out.println("Method4 is private");
	}
	public static void main(String[] args) {
		method1();
		method2();
		method3();
		method4();
	}

}
