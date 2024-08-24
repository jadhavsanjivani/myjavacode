package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down4_Grotechminds {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://grotechminds.com/dropdown/");
		WebElement dropdown4 = cd.findElement(By.id("Choice4"));
		Select s2 = new Select(dropdown4);
		s2.selectByIndex(4);
		Thread.sleep(10000);
		cd.quit();

	}

}
