package testcase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit
{   ChromeDriver driver;
	@BeforeMethod
	public void login()
	{
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	

}
