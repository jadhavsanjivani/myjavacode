package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube_subscribe_grotechminds 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.youtube.com/");
		WebElement search = cd.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("Grotechminds");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement subscribe = cd.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[10]"));
		subscribe.click();
		
		Thread.sleep(5000);
		cd.quit();

	}

}
