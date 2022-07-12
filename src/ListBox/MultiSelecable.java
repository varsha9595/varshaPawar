package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelecable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);

	  driver.get("https://demoqa.com/select-menu");

		Thread.sleep(5000);
		
		WebElement MultiselectElemet = driver.findElement(By.id("cars"));
		
        Select s = new Select(MultiselectElemet);
    
         System.out.println("Multi select staus is "+s.isMultiple());
         
      s.selectByValue("audi");
      Thread.sleep(1000);
      s.selectByVisibleText("Opel");
      Thread.sleep(1000);
      s.selectByIndex(0);
      Thread.sleep(1000);
      
     // s.deselectAll();
      s.deselectByIndex(0);
      Thread.sleep(1000);
      s.deselectByValue("audi");
		

		
		
	}

}
