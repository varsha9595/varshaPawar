package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEg1 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement seleniumButton = driver.findElement(By.linkText("Selenium"));
		Actions act=new Actions(driver);
		
		//act.moveToElement(seleniumButton).perform();
		 //act.click().perform();
		
		//act.moveToElement(seleniumButton).click().build().perform();
		act.click(seleniumButton).perform();
		
		// How to right click(contextClick)using actions class//...........
		
		WebElement rightclickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		//act.moveToElement(rightclickButton).contextClick().build().perform();
		act.contextClick(rightclickButton).perform();
		
		// how to double click using Actions class//...................
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(doubleClickButton).perform();
        
		

	}

}
