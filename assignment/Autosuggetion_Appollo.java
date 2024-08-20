package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggetion_Appollo
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.apollopharmacy.in/");
		cd.manage().window().maximize();
		WebElement search = cd.findElement(By.xpath("//div[@class='Home_searchSelectMain__VL1lN']"));
		search.click();
		WebElement search2 = cd.findElement(By.id("searchProduct"));
		search2.sendKeys("Cholestrol");
		List<WebElement> l = cd.findElements(By.xpath("//div[@class='MedicineAutoSearch_searchList___m_g7 null']/ul/li"));
  		Thread.sleep(3000);
  		int count = l.size();
  		System.out.println(count);
  		
		//l.get(2).click();
  		Thread.sleep(10000);
  		cd.quit();


	}

}
