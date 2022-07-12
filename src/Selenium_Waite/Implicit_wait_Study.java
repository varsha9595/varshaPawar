package Selenium_Waite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait_Study {

	public static void main(String[] args) throws InterruptedException {
     
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

}
