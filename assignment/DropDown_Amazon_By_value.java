package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Amazon_By_value 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.amazon.in/");
		WebElement dropdown = cd.findElement(By.id("searchDropdownBox"));
		Select s = new Select(dropdown);
		s.selectByValue("search-alias=stripbooks");
		
		WebElement search = cd.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Minds");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		cd.quit();

	}

}
