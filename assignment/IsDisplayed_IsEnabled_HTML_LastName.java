package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_IsEnabled_HTML_LastName
{

	public static void main(String[] args) 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("file:///C:/Users/ratho/Downloads/learningHTML1.html");
		WebElement lname = cd.findElement(By.name("lname"));
		if(lname.isDisplayed()&& lname.isEnabled())
		{
			lname.sendKeys("sanjivani");
		}
		

	}

}
