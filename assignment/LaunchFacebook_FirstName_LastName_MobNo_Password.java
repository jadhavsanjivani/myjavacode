package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook_FirstName_LastName_MobNo_Password
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.facebook.com/");
		cd.manage().window().maximize();
		
		WebElement create = cd.findElement(By.linkText("Create new account"));
		create.click();
		Thread.sleep(2000);
		WebElement first_name = cd.findElement(By.name("firstname"));
		first_name.sendKeys("Sanjivani");
		
		WebElement surname = cd.findElement(By.name("lastname"));
		surname.sendKeys("Jadhav");	

		WebElement email = cd.findElement(By.name("reg_email__"));
		email.sendKeys("sanjivani@gmail.com");
		
		WebElement email1 = cd.findElement(By.name("reg_email_confirmation__"));
		email1.sendKeys("sanjivani@gmail.com");

		WebElement new_pass = cd.findElement(By.name("reg_passwd__"));
		new_pass.sendKeys("Password");
		
		Thread.sleep(5000);
		cd.quit();
		
		
		
		

	}

}
