package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_CustomerSevice_Major 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.amazon.in/");
		cd.manage().window().maximize();
		
		WebElement customer_service = cd.findElement(By.linkText("Customer Service"));
		customer_service.click();
		Thread.sleep(2000);
		cd.quit();

	}

}
