package KiteZerodaAppTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppUsingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		File myfile= new File("C:\\Users\\Dell\\eclipse-workspace\\Book1.xlsx");
				 Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
				String UN = mySheet.getRow(5).getCell(0).getStringCellValue();
				String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();
				String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();
				
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			Thread.sleep(2000);
			
			WebElement userid = driver.findElement(By.id("userid"));
			WebElement password = driver.findElement(By.id("password"));
			WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			
			userid.sendKeys(UN);
			password.sendKeys(PWD);
			loginButton.click();
			Thread.sleep(1000);
			
			WebElement pin = driver.findElement(By.id("pin"));
			WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			pin.sendKeys(PIN);
			continueButton.click();
			
			Thread.sleep(1000);
			WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
			
			String actualUserID = userName.getText();
			String expextedUserID = UN;
			
			if(actualUserID.equals(expextedUserID))
			{
				System.out.println("User ID matching TC is PASSED");
			}
			else {
				System.out.println("User ID not matching TC is FAILED");
			}
			
			userName.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@target='_self']")).click();
			
			Thread.sleep(10000);
			driver.close();
			
			
			
			
		}

	

	}


