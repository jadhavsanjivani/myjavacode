package selenium.testng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Amazon_parallel_Testing 
{
	WebDriver cd;
	@Test
	@Parameters("browser")
	
	public void payment(String browser) throws InterruptedException
	{
		if(browser.equals("chrome"))
		{
		 cd = new ChromeDriver();
		}
		if(browser.equals("edge"))
		{
		 cd = new EdgeDriver();
		}
		//cd.manage().window().maximize();
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
		WebElement addcart = cd.findElement(By.id("add-to-cart-button"));
		addcart.click();
		Thread.sleep(2000);
		WebElement proceed = cd.findElement(By.name("proceedToRetailCheckout"));
		proceed.click();
		WebElement email = cd.findElement(By.name("email"));
		email.sendKeys("sanjijadhavtest@gmail.com");
		WebElement continues = cd.findElement(By.xpath("//input[@class='a-button-input']"));
		continues.click();
		Thread.sleep(2000);
		WebElement pass = cd.findElement(By.name("password"));
		pass.sendKeys("Sanjivani@v16");
		WebElement signIn = cd.findElement(By.id("signInSubmit"));
		signIn.click();
	}

}
