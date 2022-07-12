package KitePOMusingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		File myfile= new File("C:\\Users\\Dell\\eclipse-workspace\\Book1.xlsx");
				Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
				String UN = mySheet.getRow(5).getCell(0).getStringCellValue();
				String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();
				String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();
				
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			Thread.sleep(2000);
			
			KiteLoginPage Login = new KiteLoginPage(driver);
			Login.sendUserName(UN);
			Login.sendpassword(PWD);
			Login.clickOnLoginButton();
			
			Thread.sleep(2000);
			KitePinPage pin = new KitePinPage(driver);
			pin.sendPin(PIN);
			pin.clickOncontinueButton();
			
			Thread.sleep(2000);
			KiteHomePage home = new KiteHomePage(driver);
			home.validateUserName(UN);
			home.logOut();
			
			Thread.sleep(10000);
			driver.close();
				
		}

	}


