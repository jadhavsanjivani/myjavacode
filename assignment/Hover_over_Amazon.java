package SeleniumPractice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_over_Amazon 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.amazon.in/");
		WebElement account = cd.findElement(By.id("nav-link-accountList-nav-line-1"));
		Thread.sleep(2000);
		Actions a = new Actions(cd);
		a.moveToElement(account).perform();
		WebElement sign_in = cd.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		sign_in.click();
		cd.quit();
		
		
		
		

	}

}
