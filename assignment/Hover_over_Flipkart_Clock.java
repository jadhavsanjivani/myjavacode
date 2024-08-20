package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_over_Flipkart_Clock 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.flipkart.com/");
		WebElement fasion = cd.findElement(By.xpath("(//span[.='Home & Furniture'])[2]"));
		Thread.sleep(2000);
			Actions a = new Actions(cd);
		a.moveToElement(fasion).perform();
		WebElement home_decore = cd.findElement(By.linkText("Home Decor"));
		Thread.sleep(2000);
			//Actions a = new Actions(cd);
		a.moveToElement(home_decore).perform();
		WebElement clock = cd.findElement(By.linkText("Clocks"));
		clock.click();
		cd.quit();

	}

}
