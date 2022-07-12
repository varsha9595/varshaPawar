package SetAndPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getSize());
		//to set size, need to create object of Dimension class and pass Width and height
		
		Dimension d=new Dimension(1111,100);
		// using setSize method we can set size
		driver.manage().window().setSize(d);
	}

}
