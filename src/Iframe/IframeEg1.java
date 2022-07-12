package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg1 {

	public static void main(String[] args) throws InterruptedException {

		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/iframes/");
         
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//Step 2 Main page content
		String Text = driver.findElement(By.xpath("//a[text()='Pavilion']")).getText();
		
		System.out.println(Text);
		
		driver.switchTo().frame("Frame1");//Switch main page to frame 1 by frame()
		
		String Text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
		System.out.println(Text1);
		
		//frame1 to switchTo main page
		
		driver.switchTo().parentFrame();
		String Text2 = driver.findElement(By.linkText("Blogger")).getText();
		System.out.println(Text2);  
		
		//Main page to frame2
		
		driver.switchTo().frame("Frame2");
		String Text3 = driver.findElement(By.linkText("Category3")).getText();
		System.out.println(Text3);
		
		//frame2 to main page
		
		driver.switchTo().defaultContent();
		String Text4 = driver.findElement(By.xpath("//a[text()='Pavilion']")).getText();
		System.out.println(Text4);
		
		 System.out.println("this is my first commit");
		  
		
		
				
	}

}
