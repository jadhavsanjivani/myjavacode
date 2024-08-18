package practice;
public class SIB_IIB
{
	static
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	SIB_IIB()
	{
		System.out.println("Constructor");
	}

	public static void main(String[] args) 
	{
		new SIB_IIB();
		System.out.println("Main Method");
		new SIB_IIB();

	}

}
