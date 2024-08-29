package selenium.testng;

import org.testng.annotations.Test;

public class Priority_Annotation_Parameter
{
	@Test(priority = 0)
	public void test1()
	{
		System.out.println("1");
		
	}

	@Test(priority = 1)
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
