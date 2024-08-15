package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Facebook
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.facebook.com/login/");
		cd.manage().window().maximize();
		cd.findElement(By.name("email")).sendKeys("Sanjivani");
		cd.findElement(By.name("pass")).sendKeys("Password");
		cd.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		cd.quit();

	}

}
