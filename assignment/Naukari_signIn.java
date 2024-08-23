package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari_signIn 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMI_rfz_tmIiAMV46hmAh1dXDrTEAAYASAAEgKlj_D_BwE&gclsrc=aw.ds");
        WebElement google = driver.findElement(By.xpath("//span[.='Google']"));
        google.click();
        Set<String> s= driver.getWindowHandles();
        System.out.println(s);
        Iterator<String> i = s.iterator();
        String parentId = i.next();
        String childId = i.next();
        driver.switchTo().window(childId);
        Thread.sleep(2000);
        WebElement email= driver.findElement(By.id("identifierId"));
        email.sendKeys("sanjijadhavtest@gmail.com");
        WebElement next = driver.findElement(By.xpath("//span[.='Next']"));
        next.click();
        Thread.sleep(2000);
        WebElement pass = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
        pass.sendKeys("Sanjivani@v16");
        Thread.sleep(2000);
        WebElement next2 = driver.findElement(By.xpath("//span[.='Next']"));
        next2.click();
        Thread.sleep(2000);
       // driver.quit();
        
        
        
        
        
        
	}

}
