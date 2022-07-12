package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
        
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(2000);
		
		List<WebElement> sr = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		System.out.println(sr.size());
		
		for(WebElement p:sr)
		{
			System.out.println(p.getText());
		}
    for(WebElement result:sr)
    {
         String actualText = result.getText();
         String expectedText = "honda amaze";
         
         if(actualText.equals(expectedText));
         {
        	 result.click();
        	 break;
         }
    }
        driver.findElement(By.linkText("Images")).click();
	}
	
	}


