package Screennshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEg1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
         
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
 
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		
		File destination=new File("D:\\Software Testing Data\\JAVA Class nots\\MyScreenShot\\MyScreenshot.png");
		
		FileHandler.copy(source, destination);
        
	}

}
