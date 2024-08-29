package selenium.testng;

import org.testng.annotations.Test;

public class Annotations_usingTwo_Parameters 
{
	@Test(priority = 0, invocationCount = 2)
	public void test1()
	{
		System.out.println("1");
		
	}

	@Test(priority = 1, invocationCount = 3)
	public void test2()
	{
		System.out.println("2");
		
	}

	@Test(priority = -1)
	public void test3()
	{
		System.out.println("3");
		
	}

	

}
