package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_SBI 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		WebElement continue_login = cd.findElement(By.linkText("CONTINUE TO LOGIN"));
		continue_login.click();
		
		WebElement username = cd.findElement(By.name("userName"));
		username.sendKeys("sanjivani");
		
		WebElement password = cd.findElement(By.name("password"));
		password.sendKeys("Password");
		Thread.sleep(5000);
		cd.quit();
		

	}

}
