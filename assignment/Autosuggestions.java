package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.google.com");
		WebElement search = cd.findElement(By.name("q"));
		search.sendKeys("India");
		Thread.sleep(5000);
		List<WebElement> autosuggetion = cd.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = autosuggetion.size();
		System.out.println(count);
		autosuggetion.get(count-10).click();
		

	}

}
