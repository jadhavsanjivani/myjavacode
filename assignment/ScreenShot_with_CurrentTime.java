package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShot_with_CurrentTime 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("file:///C:/Users/ratho/Downloads/learningHTML1.html");
		WebElement username = cd.findElement(By.name("username"));
		username.sendKeys("sanjivani");
		WebElement hint = cd.findElement(By.name("say hello"));
		hint.sendKeys("Hello");
		WebElement password = cd.findElement(By.name("password"));
		password.sendKeys("Password");
		WebElement fname = cd.findElement(By.name("fname"));
		fname.sendKeys("Sanji");
		WebElement lname = cd.findElement(By.name("fname"));
		lname.sendKeys("Jadhav");
		WebElement boy = cd.findElement(By.name("name1"));
		boy.click();
		WebElement girl = cd.findElement(By.name("name2"));
		girl.click();
		WebElement baby = cd.findElement(By.name("name3"));
		baby.click();
		WebElement male = cd.findElement(By.xpath("(//input)[11]"));
		male.click();
		WebElement female = cd.findElement(By.xpath("(//input)[12]"));
		female.click();
		WebElement checkbox = cd.findElement(By.xpath("(//input)[13]"));
		checkbox.click();
		WebElement link = cd.findElement(By.linkText("Click to know about us"));
		link.click();
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		String dtime = date+" "+time;
		String dtime1 = dtime.replaceAll(":", "_");
		String dtime2 = dtime1.replaceAll("-", "_");
		
		System.out.println(dtime);
		System.out.println(dtime2);
		
		TakesScreenshot screenshot = cd;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		//Thread.sleep(2000);
		File destination = new File("C:\\Users\\ratho\\eclipse-workspace\\SeleniumBasics\\src\\Screenshots\\ram"+dtime2+".png");
		FileHandler.copy(source, destination);
		
		Thread.sleep(5000);
		cd.quit();

	}

}
