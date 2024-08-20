package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick 
{

	public static void main(String[] args) 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.google.com");
		cd.manage().window().maximize();
		
		WebElement gmail = cd.findElement(By.linkText("Gmail"));
		Actions a = new Actions(cd);
		a.doubleClick(gmail).perform();

	}

}
