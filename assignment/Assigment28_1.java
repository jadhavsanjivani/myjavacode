package assignment;
 class Assignment28
{
	public static void sub()
	{
		System.out.println("sub is public");
	}
	
	 static void sum()
	{
		System.out.println("sum is default");
	}
	 
	 protected static void mul()
		{
			System.out.println("mul is protected");
		}
}

public class Assigment28_1 extends Assignment28
{
	public static void main(String[] args)
	{
		sub();
		sum();
		mul();
	}

}
