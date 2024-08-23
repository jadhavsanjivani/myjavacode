package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Newest_Arival
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.amazon.in/");
		WebElement search = cd.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoes");
		search.sendKeys(Keys.ENTER);
		WebElement newestA = cd.findElement(By.name("s"));
		Select s = new Select(newestA);
		s.selectByIndex(4);
		WebElement newest = cd.findElement(By.linkText("Newest Arrivals"));
		newest.click();
		Thread.sleep(10000);
		cd.quit();
		
		
		

	}

}
