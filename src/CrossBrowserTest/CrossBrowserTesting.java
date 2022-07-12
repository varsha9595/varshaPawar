package CrossBrowserTest;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
  @Test
  public void varsha()
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse-workspace\\gecodriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
	  WebDriver driver = new FirefoxDriver();
		
		 driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
       
  }
}
