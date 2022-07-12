package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
         
		driver.get("https://vctcpune.com/selenium/practice.html");

		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("varsha");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']")).getText();
		
		
	}

}
