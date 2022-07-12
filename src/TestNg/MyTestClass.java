package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void varsha() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
  }
		@Test
		public void varsha1() throws InterruptedException
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/login/");
				Thread.sleep(2000);	
		}
	
	
		
  }

