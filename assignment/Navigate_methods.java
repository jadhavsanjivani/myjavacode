package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Navigate_methods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.navigate().to("https://grotechminds.com/registration/");
		Thread.sleep(5000);

		cd.navigate().back();
		Thread.sleep(5000);

		cd.navigate().forward();
		WebElement fname = cd.findElement(By.name("fname"));
		fname.sendKeys("Sanjivani");
		WebElement lname = cd.findElement(By.name("lname"));
		lname.sendKeys("Jadhav");
		WebElement email = cd.findElement(By.name("email"));
		email.sendKeys("sanjivanijadhav228@gmail.com");
		WebElement pass = cd.findElement(By.name("password"));
		pass.sendKeys("Password");
		WebElement gender = cd.findElement(By.id("Female"));
		gender.click();
		WebElement skills = cd.findElement(By.name("Skills"));
		Select s = new Select(skills);
		s.selectByValue("select1");
		WebElement country = cd.findElement(By.name("Country"));
		Select s1 = new Select(country);
		s1.selectByVisibleText("India");
		WebElement present_address = cd.findElement(By.name("Present-Address"));
		present_address.sendKeys("Pune, Maharastra");
		WebElement permenant_address = cd.findElement(By.name("Permanent-Address"));
		permenant_address.sendKeys("Yavatmal, Maharastra");
		WebElement pincode = cd.findElement(By.name("Pincode"));
		pincode.sendKeys("111223");
		WebElement relegion = cd.findElement(By.name("Relegion"));
		Select s2 = new Select(relegion);
		s2.selectByIndex(1);
		WebElement relocate = cd.findElement(By.name("relocate"));
		relocate.click();
		Thread.sleep(5000);
		cd.navigate().refresh();
		Thread.sleep(5000);
		cd.quit();

	}

}
