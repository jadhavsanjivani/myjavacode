package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Product_AddTo_WhishList 
{

	public static void main(String[] args) 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.amazon.in/");
		WebElement search = cd.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoes");
		search.sendKeys(Keys.ENTER);
		WebElement shoe = cd.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		shoe.click();
		Set<String> s1 = cd.getWindowHandles();
		Iterator<String> i = s1.iterator();
		String parentId = i.next();
		String childId = i.next();
		cd.switchTo().window(childId);
		WebElement buynow = cd.findElement(By.linkText("Add to Wish List"));
		buynow.click();

	}

}
