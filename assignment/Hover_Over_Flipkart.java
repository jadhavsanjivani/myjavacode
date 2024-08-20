package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Hover_Over_Flipkart {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.flipkart.com/");
		WebElement fasion = cd.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		Thread.sleep(2000);
			Actions a = new Actions(cd);
		a.moveToElement(fasion).perform();
		WebElement men_t_shirt = cd.findElement(By.linkText("Men's T-Shirts"));
		men_t_shirt.click();
		cd.quit();

	}

}
