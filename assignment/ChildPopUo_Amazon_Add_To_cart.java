package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUo_Amazon_Add_To_cart 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.amazon.in/");
		WebElement search = cd.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoes");
		Thread.sleep(2000);
		List<WebElement> l = cd.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		Thread.sleep(2000);
		l.get(2).click();

	}

}
