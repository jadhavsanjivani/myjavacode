package testcase;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase2 extends Launch_Quit
{
	@Test
	public void addtocart() throws InterruptedException
	{
	
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("soap");
	search.sendKeys(Keys.ENTER);
	WebElement soap = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[1]"));
	soap.click();
	Set<String> s1 = driver.getWindowHandles();
	Iterator <String> i = s1.iterator();
	String parentId = i.next();
	String childId = i.next();
	driver.switchTo().window(childId);
	
	Thread.sleep(5000);
	WebElement quantity = driver.findElement(By.name("quantity"));
	
	Select s = new Select(quantity);
	s.selectByValue("4");
	Thread.sleep(1000);
	WebElement addcart = driver.findElement(By.name("submit.add-to-cart"));
	addcart.click();
	}
	

}
