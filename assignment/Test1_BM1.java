package selenium.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1_BM1
{
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("BeforeMethod");
	}

}
