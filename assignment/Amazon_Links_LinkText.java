package SeleniumPractice;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Links_LinkText 
{
	

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().minimize();
		List<WebElement> l1 = driver.findElements(By.tagName("a"));
		
		URL url = new URL(l1);
		
		

	}

}
