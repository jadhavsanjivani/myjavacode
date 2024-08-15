package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy_Past_usingKey
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://grotechminds.com/registration/");
		
		WebElement fname = cd.findElement(By.name("fname"));
		fname.sendKeys("Sanjivani");
		fname.sendKeys(Keys.CONTROL+"a");
		fname.sendKeys(Keys.CONTROL+"c");
		WebElement lname = cd.findElement(By.name("lname"));
		lname.sendKeys(Keys.CONTROL+"v");
		
		Thread.sleep(5000);
		cd.quit();

	}

}
