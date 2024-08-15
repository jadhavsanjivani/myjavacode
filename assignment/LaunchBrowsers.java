package SeleniumPractice;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowsers
{

	public static void main(String[] args) throws InterruptedException 
	{ 
		Scanner s = new Scanner(System.in);
		int value = s.nextInt();
	
		switch(value)
		{
		case 1:
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.facebook.com");
		Thread.sleep(2000);
		cd.quit();
		break;
		case 2:
			EdgeDriver ed = new EdgeDriver();
			ed.get("https://www.facebook.com");
			Thread.sleep(2000);
			ed.quit();
			break;
			default: 
				System.out.println("Please select valid option");
						
		}
		
		
		}
}


