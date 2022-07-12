package kitePOMusingTestNg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteAppUserName {
	WebDriver driver;
	Sheet mySheet;
	KiteLoginPage login;
	KitePinPage1 pin;
	KiteHomePage home;

	
			
			@BeforeClass	
		public void launchbrowser() throws EncryptedDocumentException, IOException
		{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
		 ChromeOptions opt = new ChromeOptions();
		// opt.addArguments("--headless");
		 //opt.addArguments("--disable-notifications");
		 //opt.addArguments("--incognito");
			WebDriver driver = new ChromeDriver(opt);
			
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			Reporter.log("launching browser",true);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			File myfile= new File("C:\\Users\\Dell\\eclipse-workspace\\Book1.xlsx");
			 mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
			
			login=new KiteLoginPage(driver);
			pin = new KitePinPage1(driver);
			home= new KiteHomePage(driver);
		}
			@BeforeMethod
			public void loginToKiteApp() throws InterruptedException
			{	
				String UN = mySheet.getRow(5).getCell(0).getStringCellValue();
				String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();
				String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();
				
			
			login.sendUserName(UN);
			Reporter.log("sending userName",true);
			login.sendpassword(PWD);
			Reporter.log("sending password",true);
			login.clickOnLoginButton();
			Reporter.log("click on login Button",true);
Thread.sleep(2000);
			
			pin.sendPin(PIN);
			Reporter.log("sending pin",true);
			
			pin.clickOncontinueButton();
			Reporter.log("click on continue Button",true);
Thread.sleep(2000);
			
			}
			
			@Test
			public void validateUserName()
			{
              String expectedUN=mySheet.getRow(5).getCell(0).getStringCellValue();
              String actualUN = home.getActualUserName();
              Reporter.log("validating userName",true);
              Assert.assertEquals(actualUN, expectedUN,"Actual and Expected UN are not matching TC failed");
              Reporter.log("Actual and Expected UN are matching TC PASSED",true);
              
			}
			
			@AfterMethod
			public void logoutFromKiteApp() throws InterruptedException
			{
              home.logOut();
              Reporter.log("Logging out",true);
			}
			
			@AfterClass
			public void closeBrowser() throws InterruptedException
			{
			Thread.sleep(2000);
			Reporter.log("closing Browser",true);
            
			driver.close();
				
		}

	
}
			






