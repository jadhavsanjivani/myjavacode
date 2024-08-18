package concept_inheritance;
class This1
{
	This1()
	{
		System.out.println("Non-para constructor1");
	}
	This1(int a)
	{ this();
		System.out.println("Para constructor 2");
	}
	This1(double d)
	{this(100);
		System.out.println("Para constructor 3");
	}
	This1(String s)
	{this(23.43);
		System.out.println("Para constructor 4");
	}
}

public class Statement_This extends This1
{
	Statement_This()
	{super("SAN");
		System.out.println("Home Constructor");
	}
	public static void main(String[] args) {
		new Statement_This();
	}

}
