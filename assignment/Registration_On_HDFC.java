package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_On_HDFC
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.hsbc.co.in/security/");
		WebElement register = cd.findElement(By.linkText("Register"));
		register.click();
		WebElement phone = cd.findElement(By.xpath("(//span)[97]"));
		phone.click();
		WebElement number = cd.findElement(By.xpath("(//input)[5]"));
		number.sendKeys("9123456780");
		WebElement pin = cd.findElement(By.xpath("(//input)[6]"));
		pin.sendKeys("123456");
		Thread.sleep(2000);
		WebElement continues = cd.findElement(By.xpath("(//button)[10]"));
		continues.click();
		Thread.sleep(5000);
		cd.quit();
		
		

	}

}
