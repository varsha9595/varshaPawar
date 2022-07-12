package kiteAppProperties;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;


public class BaseNew {
protected WebDriver driver;
	public void openBrowser() throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
	
	 ChromeOptions opt = new ChromeOptions();
	// opt.addArguments("--headless");
	 opt.addArguments("--disable-notifications");
	// opt.addArguments("--incognito");
     driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get(UtilityProp.getDataFromPropertyFile("URL"));
		Reporter.log("launching browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}
}
