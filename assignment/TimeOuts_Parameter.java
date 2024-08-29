package selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOuts_Parameter 
{
	@Test(timeOut = 9000)
	public void login() throws InterruptedException
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.flipkart.com/");
		WebElement search = cd.findElement(By.name("q"));
		search.sendKeys("Shoes");
		search.sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
		cd.quit();
		
	}

	

}
