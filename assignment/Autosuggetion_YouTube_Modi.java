package SeleniumPractice;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggetion_YouTube_Modi 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.youtube.com/");
		Thread.sleep(2000);
		WebElement search = cd.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("M");
		search.sendKeys("o");
		search.sendKeys("d");
		search.sendKeys("i");
		
		Thread.sleep(5000);
		List<WebElement> le = cd.findElements(By.xpath("//div[@class='sbsb_a']/ul/li"));
		Thread.sleep(2000);
		le.get(4).click();
		Thread.sleep(5000);
		cd.quit();
	}

}
