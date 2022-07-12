package listener;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;


public class BaseNew {
	
static WebDriver driver;
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
	public static void captureScreenShot(String TCID) throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Software Testing Data\\JAVA Class nots\\MyScreenShot\\MyScreenshot9595"+TCID+".png");
		FileHandler.copy(scr, dest);
	}
}
