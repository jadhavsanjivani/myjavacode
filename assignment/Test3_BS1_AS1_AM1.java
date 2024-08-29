package selenium.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3_BS1_AS1_AM1 
{
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	@AfterMethod
	public void bm()
	{
		System.out.println("AfterMethod");
	}
	@BeforeSuite
	public void bs()
	{
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("AfterSuite");
	}
	@Test
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test
	public void test3()
	{
		System.out.println("Test3");
	}


}
