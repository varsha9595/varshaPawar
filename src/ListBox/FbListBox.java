package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbListBox {

	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
	         driver.get("https://www.facebook.com/");
	         
			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();	
			
			Thread.sleep(2000);
			
			//for date
			
			WebElement dateBox = driver.findElement(By.name("birthday_day"));
			
			Select s=new Select(dateBox);
			
			s.selectByValue("31");
			Thread.sleep(2000);
			
			//for month
			
			WebElement montBox = driver.findElement(By.id("month"));
			
			Select s1 =new Select(montBox);
			
			s1.selectByVisibleText("Oct");
			
			Thread.sleep(2000);
			
			//for year
			
			WebElement yearBox = driver.findElement(By.id("year"));
			
			Select s2=new Select(yearBox);
			
			s2.selectByValue("1997");
			Thread.sleep(2000);

           //for gender			
			driver.findElement(By.xpath("//input[@value='1']")).click();
			Thread.sleep(2000);
			
			//for firstname
			
			driver.findElement(By.xpath("//input[@tabindex='0']")).sendKeys("Varsha");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pawar");
			Thread.sleep(2000);





			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

}
}