package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://demoqa.com/alerts");

		//driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("timerAlertButton")).click();
		
		//Alert alt = driver.switchTo().alert();
		
		//System.out.println(alt.getText());
	    //alt.accept();
		
		
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.id("alertBox")).click();
		//Alert alt = driver.switchTo().alert();
		//System.out.println(alt.getText());
		//Thread.sleep(2000);

		//alt.accept();
		
		//driver.findElement(By.id("confirmBox")).click();
		//Thread.sleep(2000);
		//Alert alt = driver.switchTo().alert();
		//alt.dismiss();
		
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
		

		
		
		
		
		
		
		
	
	}

}
