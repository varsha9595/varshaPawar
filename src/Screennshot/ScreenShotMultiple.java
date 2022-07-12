package Screennshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotMultiple {

	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
         
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String str =RandomString.make(4);
		
		File destination=new File("D:\\Software Testing Data\\JAVA Class nots\\MyScreenShot\\MyScreenShot"+str+".png");
		
		FileHandler.copy(source, destination);

	}

}
