package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down1_grotechminds 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://grotechminds.com/dropdown/");
		WebElement dropdown1 = cd.findElement(By.id("Choice1"));
		Select s = new Select(dropdown1);
		s.selectByVisibleText("Demo1");
		Thread.sleep(2000);

		
		Thread.sleep(10000);
		cd.quit();
		
		
		
		

	}

}
