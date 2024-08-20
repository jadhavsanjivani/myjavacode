package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggetion_Flipkart 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.flipkart.com/");
		WebElement search = cd.findElement(By.name("q"));
		search.sendKeys("Shoes");
		Thread.sleep(2000);
		List<WebElement> le = cd.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		Thread.sleep(2000);
		le.get(3).click();
		Thread.sleep(5000);
		cd.quit();

	}

}
