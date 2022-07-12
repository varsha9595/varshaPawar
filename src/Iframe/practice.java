package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
         
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		String Text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(Text);
		
		Thread.sleep(1000);
		driver.switchTo().frame("frame2");
		
		WebElement Text1 = driver.findElement(By.id("animals"));
		Select s=new Select(Text1);
	    System.out.println(s.isMultiple());
	    s.selectByIndex(3);
	    s.selectByValue("big baby cat");
	    
	    Thread.sleep(1000);
	    driver.switchTo().parentFrame();
	    driver.switchTo().frame("frame1");
	    driver.findElement(By.tagName("input")).sendKeys("hiiiii");
	    
	    Thread.sleep(1000);
	    driver.switchTo().frame("frame3");
	    driver.findElement(By.id("a")).click();
	    
		
	
	
		
		
	}

}
