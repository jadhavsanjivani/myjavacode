package SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Broken_Links 
{
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().minimize();
	Thread.sleep(2000);
		List<WebElement> l1 =  driver.findElements(By.tagName("a"));
		int count = l1.size();
		System.out.println(count);
		
		for(int i = 0; i<count; i++)
		{
			WebElement e1 = l1.get(i);
			String link = e1.getAttribute("href");
			System.out.println(link);
			String text = e1.getText();
			System.out.println(text);
			broken_links(link);
			
		
		}		

	}
	
	static void broken_links(String link) throws IOException
	{
    try
	{
		URL u1 = new URL(link);
		HttpURLConnection h1 = (HttpURLConnection) u1.openConnection();
		if (h1.getResponseCode()==200)
		{
			System.out.println("It is a valid link "+ h1.getResponseMessage());
			
		}
		else
		{
			System.out.println("It is Invalid link "+h1.getResponseMessage());
			
		}
	}
	
		
		catch(MalformedURLException a1)
		{
			System.out.println("It is invalid link - Handled");
		}
		/*catch(IOException a2)
		{
			System.out.println("It is invalid link - Handled2");
		}
		catch(ClassCastException a3)
		{
			System.out.println("It is invalid link - Handled3");
		}*/
	
	}

}
