package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Google_CLickSearch
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.google.com");
		cd.manage().window().maximize();
		cd.findElement(By.name("q")).sendKeys("India");
		cd.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		cd.quit();
		
		

	}

}
