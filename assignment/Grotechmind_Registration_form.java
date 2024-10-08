package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotechmind_Registration_form 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://grotechminds.com/registration/");
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
		WebElement choose_file = cd.findElement(By.id("file"));
		choose_file.sendKeys("C:\\Users\\ratho\\Downloads\\Test.pdf");
		WebElement submit = cd.findElement(By.name("Submit"));
		submit.click();
		Thread.sleep(5000);
		cd.switchTo().alert().accept();
		//cd.quit();

	}

}
