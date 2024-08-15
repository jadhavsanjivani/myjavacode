package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Medical_Delivery 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.apollopharmacy.in/");
		cd.manage().window().maximize();
		WebElement search = cd.findElement(By.xpath("//div[@class='Home_searchSelectMain__VL1lN']"));
		search.click();
		WebElement search2 = cd.findElement(By.id("searchProduct"));
		search2.sendKeys("PCM");
		search2.click();
		Thread.sleep(1000);
		WebElement tablet = cd.findElement(By.xpath("(//div[@class='gT'])[6]"));
		tablet.click();
		Thread.sleep(5000);
		cd.quit();
		

	}

}
