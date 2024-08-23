package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML_Grotechminds_JS_POP_UP 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("file:///C:/Users/ratho/Downloads/learningHTML1.html");
		Thread.sleep(2000);
		cd.switchTo().alert().accept();
		
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
		Thread.sleep(5000);
		cd.quit();

	}

}
