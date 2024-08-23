package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_isEnabled_Google_India 
{

	public static void main(String[] args) 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.google.com");
		WebElement search = cd.findElement(By.name("q"));
		if(search.isDisplayed() && search.isEnabled())
		{
		search.sendKeys("India");
		}
		
		

	}

}
