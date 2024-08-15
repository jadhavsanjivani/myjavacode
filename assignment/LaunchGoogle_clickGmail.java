package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle_clickGmail 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.google.com");
		cd.manage().window().maximize();
		
		WebElement gmail = cd.findElement(By.linkText("Gmail"));
		gmail.click();
		Thread.sleep(5000);
		cd.quit();

	}

}
