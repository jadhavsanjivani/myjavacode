package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML_ClickOnMale_Confirm
{

	public static void main(String[] args)
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("file:///C:/Users/ratho/Downloads/learningHTML1.html");
		WebElement male = cd.findElement(By.xpath("(//input)[11]"));
		male.click();
		boolean confirm = male.isSelected();
		System.out.println(confirm);

	}

}
