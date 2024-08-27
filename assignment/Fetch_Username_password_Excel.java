package SeleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Username_password_Excel 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.amazon.in/");
		WebElement search = cd.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoes");
		search.sendKeys(Keys.ENTER);
		WebElement shoe = cd.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		shoe.click();
		Set<String> s1 = cd.getWindowHandles();
		Iterator<String> i = s1.iterator();
		String parentId = i.next();
		String childId = i.next();
		cd.switchTo().window(childId);
		WebElement addcart = cd.findElement(By.id("add-to-cart-button"));
		addcart.click();
		Thread.sleep(2000);
		WebElement proceed = cd.findElement(By.name("proceedToRetailCheckout"));
		proceed.click();
		
		FileInputStream file  = new FileInputStream("C:\\Users\\ratho\\eclipse-workspace\\SeleniumBasics\\src\\DDT\\Test.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("login");
		String username = sheet.getRow(1).getCell(0).getStringCellValue();
		String password = sheet.getRow(1).getCell(1).getStringCellValue();
		
		
Thread.sleep(2000);
		
		WebElement email = cd.findElement(By.name("email"));
		email.sendKeys(username);
		WebElement continues = cd.findElement(By.xpath("//input[@class='a-button-input']"));
		continues.click();
		Thread.sleep(2000);
		WebElement pass = cd.findElement(By.name("password"));
		pass.sendKeys(password);
		WebElement signIn = cd.findElement(By.id("signInSubmit"));
		signIn.click();
		WebElement address = cd.findElement(By.xpath("(//input[@class='a-button-input'])[2]"));
		address.click();
		Thread.sleep(20000);
		cd.quit();

	}

}
