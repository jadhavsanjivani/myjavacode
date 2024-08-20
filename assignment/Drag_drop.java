package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://grotechminds.com/drag-and-drop/");
		WebElement drag = cd.findElement(By.id("container-6"));
		WebElement drop = cd.findElement(By.id("div2"));
		Actions a = new Actions(cd);
		Thread.sleep(2000);
		a.dragAndDrop(drag, drop).perform();
		Thread.sleep(5000);
		a.dragAndDrop(drop, drag).perform();
		cd.quit();
		

	}

}
