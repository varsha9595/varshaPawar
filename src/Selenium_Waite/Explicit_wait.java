package Selenium_Waite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/");
			Thread.sleep(2000);
			
			WebElement Rs = driver.findElement(By.xpath("(//a[text()='Student Review'])[1]"));
			WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(30));
			w.until(ExpectedConditions.visibilityOf(Rs));
	}

}
