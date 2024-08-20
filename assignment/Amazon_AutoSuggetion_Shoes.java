package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_AutoSuggetion_Shoes
{

	public static void main(String[] args) throws InterruptedException
	{
//X-path  amazon -autoSuggetion //div[@class='left-pane-results-container']/div/div
		//X-path FlipKart autosugettion //form[@class='_2rslOn header-form-search']/ul/li
	
	ChromeDriver cd = new ChromeDriver();
	cd.manage().window().maximize();
	cd.get("https://www.amazon.in/");
	WebElement search = cd.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("Shoes");
	Thread.sleep(2000);
	List<WebElement> l = cd.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	Thread.sleep(2000);
	l.get(2).click();
	Thread.sleep(10000);
	cd.quit();

	
	

	
	
	
	
	}

}
