package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down2_Grotechminds 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://grotechminds.com/dropdown/");
		WebElement dropdown2 = cd.findElement(By.id("Choice2"));
		Select s1 = new Select(dropdown2);
		s1.selectByIndex(2);
		Thread.sleep(10000);
		cd.quit();

	}

}
