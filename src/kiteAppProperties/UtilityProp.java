package kiteAppProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UtilityProp {
 //excel
//screenshot
//closing
	
	public static void captureScreenShot(WebDriver driver,String TCID) throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D:\\Software Testing Data\\JAVA Class nots\\MyScreenShot\\MyScreenshot9595"+TCID+".png");
		
		
		FileHandler.copy(scr, dest);
	}
	public static String getDataFromPropertyFile(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream myfile=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Selenium26March\\src\\myPropertiesFile");
		
		prop.load(myfile);
		String value = prop.getProperty(key);
		return value;
		
		
	}
}
