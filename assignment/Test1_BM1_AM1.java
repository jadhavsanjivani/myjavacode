package selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1_BM1_AM1
{
	@Test
	public void test1()
	{
		System.out.println("Test");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("AfterMethod");
	}
	
	

	
}
