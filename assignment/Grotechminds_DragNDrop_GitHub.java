package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotechminds_DragNDrop_GitHub
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://grotechminds.com/drag-and-drop/");
		WebElement drag = driver.findElement(By.id("container-4"));
		WebElement drop = driver.findElement(By.id("div2"));
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		Thread.sleep(5000);
		a.dragAndDrop(drop, drag).perform();	
		Thread.sleep(5000);
		driver.quit();

	}

}
