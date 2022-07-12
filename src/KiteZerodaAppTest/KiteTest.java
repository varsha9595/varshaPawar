package KiteZerodaAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTest {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		WebElement userid = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		userid.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		loginButton.click();
		Thread.sleep(1000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
		continueButton.click();
		
		Thread.sleep(1000);
		WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String actualUserID = userName.getText();
		String expextedUserID = "ELR321";
		
		if(actualUserID.equals(expextedUserID))
		{
			System.out.println("User ID matching TC is PASSED");
		}
		else {
			System.out.println("User ID not matching TC is FAILED");
		}
		
		userName.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		
		Thread.sleep(10000);
		driver.close();
		
		
		
		
	}

}
