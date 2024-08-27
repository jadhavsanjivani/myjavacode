package SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_ValidLinks_InvalidLinks
{
	static int validlinks;
	static int invalidlinks;
	static int handledlinks;

	public static void main(String[] args) throws IOException
	{
		ChromeDriver driver= new ChromeDriver();						
		driver.get("https://www.amazon.in");						
		driver.manage().window().minimize();						
		List<WebElement> l1= driver.findElements(By.tagName("a"));						
		int count= l1.size();						
		System.out.println(count);						
		for(int i=0;i<count;i++)						
		{						
		WebElement e1= l1.get(i);						
		String url= e1.getAttribute("href");						
		System.out.println(url );						
		verify_each_links(url);	
		
		}	
		System.out.println("count of valid links: "+validlinks);
		System.out.println("count of invalid links: "+invalidlinks);
		System.out.println("count of handled links: "+handledlinks);
		}						
				
		static void verify_each_links(String url) throws IOException						
		{
			try {
		URL u1=new URL(url);						
		HttpURLConnection h1 = (HttpURLConnection)u1.openConnection();	

		if(h1.getResponseCode() == 200)
		{
			System.out.println("It is valid link "+ h1.getResponseMessage());
			validlinks++;
		}
		else
		{
			System.out.println("Link is not valid "+h1.getResponseMessage());
			invalidlinks++;
		}
			}
			catch(MalformedURLException a1)
			{
				System.out.println("Link is not valid - Handled");
				handledlinks++;
			}
			

		}

	}


