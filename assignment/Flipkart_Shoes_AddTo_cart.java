package SeleniumPractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Shoes_AddTo_cart 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.flipkart.com/");
		WebElement search = cd.findElement(By.name("q"));
		search.sendKeys("Shoes");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement shoe =cd.findElement(By.xpath("(//div[@class='gqcSqV YGE0gZ'])[1]"));
		shoe.click();
		Set<String> s = cd.getWindowHandles();
		Iterator <String> i = s.iterator();
		String parentId = i.next();
		String childId = i.next();
		cd.switchTo().window(childId);
		Thread.sleep(2000);
		WebElement addtocart = cd.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
		addtocart.click();
		
		

	}

}
