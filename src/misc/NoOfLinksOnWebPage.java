package misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebPage {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
	         
			driver.get("https://vctcpune.com/selenium/practice.html");
			Thread.sleep(2000);
			
			List<WebElement> drive = driver.findElements(By.tagName("a"));
			System.out.println(drive.size());
			
			Iterator<WebElement> rd = drive.iterator();
			
			while(rd.hasNext());
			{
				System.out.println(rd.next().getText());
			}
	}
	

}
