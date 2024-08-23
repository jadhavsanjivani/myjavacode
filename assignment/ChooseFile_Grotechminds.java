package SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChooseFile_Grotechminds {

	public static void main(String[] args) 
	{
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://grotechminds.com/registration/");
		

	}

}
