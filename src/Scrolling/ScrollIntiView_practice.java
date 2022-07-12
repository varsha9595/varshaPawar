package Scrolling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntiView_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
         
		driver.get("https://vctcpune.com/selenium/practice.html");
	
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		//driver.findElement(By.)
		
		
		

	}

}
