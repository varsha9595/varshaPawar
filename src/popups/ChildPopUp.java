package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUp {

	public static void main(String[] args) throws InterruptedException {

  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
         
		Thread.sleep(2000);
		String mainpageId = driver.getWindowHandle();
		System.out.println(mainpageId);
		System.out.println("==============================");
		
		//To open child window
		
	driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		
		Set<String> allpagesIDs = driver.getWindowHandles();
		
		Iterator<String> it = allpagesIDs.iterator();
		//while(it.hasNext())
		//{
		//	System.out.println(it.next());
		//}
		
		String Id1 = it.next();//will return child page id
		String Id2= it.next();//will return child page id
		
		driver.switchTo().window(Id2);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Hiiii");
		
		driver.switchTo().window(Id1);
		Thread.sleep(1000);
		WebElement text = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
		System.out.println(text.getText());
		
		driver.close();
		
		

		
		
		
      
		

		

		
	}

}


