package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Addcart_4
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.amazon.in/");
		WebElement search = cd.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("soap");
		search.sendKeys(Keys.ENTER);
		WebElement soap = cd.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[1]"));
		soap.click();
		Set<String> s1 = cd.getWindowHandles();
		Iterator <String> i = s1.iterator();
		String parentId = i.next();
		String childId = i.next();
		cd.switchTo().window(childId);
		//WebElement addcart = cd.findElement(By.id("add-to-cart-button"));
		//addcart.click();
		Thread.sleep(5000);
		WebElement quantity = cd.findElement(By.name("quantity"));
		
		Select s = new Select(quantity);
		s.selectByValue("4");
		Thread.sleep(1000);
		WebElement addcart = cd.findElement(By.name("submit.add-to-cart"));
		addcart.click();
		Thread.sleep(10000);
		cd.quit();
		

	}

}
