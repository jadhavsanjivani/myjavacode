package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Facebook_usig_RelativeXPath 
{

	public static void main(String[] args)
	{
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.facebook.com/login/");
		cd.manage().window().maximize();
		cd.findElement(By.xpath("//input[@id='email']")).sendKeys("Sanjivani");
		cd.findElement(By.xpath("//input[@name='pass']")).sendKeys("Password");
		cd.findElement(By.xpath("//button[@name='login']")).click();

	}

}
