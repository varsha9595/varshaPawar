package practiceListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBoxHandle {
	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
	         driver.get("https://www.rogers.com/");
	         driver.manage().window().maximize();
	         Thread.sleep(1000);
	         driver.findElement(By.xpath("//span[text()='ON']")).click();
	         Thread.sleep(2000);
//	         driver.findElement(By.xpath("(//a[@tabindex='0'])[1]")).click();
//	         Thread.sleep(1000);
	         driver.findElement(By.xpath("(//a[@title='Nova Scotia'])[1]")).click();
	         Thread.sleep(1000);
	         

}
}
