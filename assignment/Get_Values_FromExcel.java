package selenium.testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Get_Values_FromExcel 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file  = new FileInputStream("C:\\Users\\ratho\\eclipse-workspace\\SeleniumBasics\\src\\DDT\\Test.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("login");
		
		for (int i = 1; i<7;i++)
		{
		try
		{
		String username = sheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(username);
		
		}
		catch(IllegalStateException a)
		{
			long username = (long) sheet.getRow(i).getCell(0).getNumericCellValue();
			System.out.println(username);
		}
		
		}

	}

}
