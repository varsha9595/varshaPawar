package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollintoView {

	
		public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/");
			Thread.sleep(2000);
			WebElement ref = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
			
			JavascriptExecutor js=((JavascriptExecutor)driver);
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView(true)",ref);
	}

}
