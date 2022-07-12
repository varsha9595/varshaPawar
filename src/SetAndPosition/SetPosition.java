package SetAndPosition;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getPosition());
		// to set position we need to create object of Point Class and pass X and Y coordinate

		Point p= new Point(200, 10);
		// using SetPosition method we can set the browser position
		driver.manage().window().setPosition(p);
		
	}

}
