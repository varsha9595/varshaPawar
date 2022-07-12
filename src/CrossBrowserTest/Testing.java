package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing {
  @Parameters("browser Name")
  @Test
  public void MyMethod(String name) throws InterruptedException 
  {
	  WebDriver driver=null;
  
  if(name.equals("firefox"))
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse-workspace\\gecodriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
	   driver = new FirefoxDriver();
	  Thread.sleep(1000);
  }
  
     else if(name.equals("chrome"))
     {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
		 driver=new ChromeDriver(); 
     }
	 
			 driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			Thread.sleep(2000);
	  }
		
		
	
       
  }

