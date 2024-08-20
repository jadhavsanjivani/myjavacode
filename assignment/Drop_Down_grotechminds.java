package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_grotechminds 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://grotechminds.com/dropdown/");
		WebElement dropdown1 = cd.findElement(By.id("Choice1"));
		Select s = new Select(dropdown1);
		s.selectByVisibleText("Demo2");
		Thread.sleep(2000);

		WebElement dropdown2 = cd.findElement(By.id("Choice2"));
		s.selectByIndex(2);
		Thread.sleep(2000);
		WebElement dropdown3 = cd.findElement(By.id("Choice3"));
		s.selectByIndex(5);
		Thread.sleep(5000);
		cd.quit();
		
		
		
		

	}

}
