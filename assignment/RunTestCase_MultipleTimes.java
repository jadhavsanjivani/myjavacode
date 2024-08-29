package selenium.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RunTestCase_MultipleTimes
{
	@Test(invocationCount = 5)
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
