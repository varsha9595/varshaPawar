package UtilityScreenshot;

import java.io.File;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Utility {
 //excel
//screenshot
//closing
	
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException 
   {

		File myfile= new File("C:\\Users\\Dell\\eclipse-workspace\\Book1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String value=mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;	
	}
	
	public static void captureScreenShot(WebDriver driver,String TCID) throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D:\\Software Testing Data\\JAVA Class nots\\MyScreenShot\\MyScreenshot9595"+TCID+".png");
		
		
		FileHandler.copy(scr, dest);
	}
	
	
	
}
