package selenium.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test2_BS1_BM1 
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
	@BeforeSuite
	public void bs()
	{
		System.out.println("BeforeSuite");
	}
	@Test
	public void test2()
	{
		System.out.println("Test2");
	}

}
