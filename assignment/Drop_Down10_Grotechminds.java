package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down10_Grotechminds
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://grotechminds.com/dropdown/");
		WebElement dropdown10 = cd.findElement(By.id("Choice10"));
		Select s2 = new Select(dropdown10);
		s2.selectByIndex(10);
		Thread.sleep(10000);
		cd.quit();

	}

}
