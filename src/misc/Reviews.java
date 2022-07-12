package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reviews {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://WWW.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("oneplus mobile");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).getText();
		System.out.println(text);
	}

}
