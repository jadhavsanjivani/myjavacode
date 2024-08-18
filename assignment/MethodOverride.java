package stringClass;
class parent
{
   void add()
	{
		System.out.println("1st method");
	}
	void sub(int b)
	{
		System.out.println("2nd method");
	}
	static void mul()
	{
		System.out.println("2nd method");
	}
}

public class MethodOverride extends parent
{
	void add()
	{
		super.add();
		
		System.out.println("3rd");
	}
	void sub(int a)
	{
		super.sub(a);
		System.out.println("4th");
	}


	public static void main(String[] args)
	{
		parent mo = new MethodOverride();
		mo.add();

		
	
		

	}

}
