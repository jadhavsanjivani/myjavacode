package assignment;

public class Swap_twoNumbers
{

	public static void main(String[] args)
	{
		int a = 30;
		int b = 40;
		
	System.out.println("value of a: "+a+" value of b: "+ b);
	b = b+a;
	a = b-a;
	b = b-a;
	System.out.println(a);
	System.out.println(b);

	}

}
