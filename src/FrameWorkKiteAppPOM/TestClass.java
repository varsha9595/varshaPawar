package FrameWorkKiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		KIteLoginPage login=new KIteLoginPage(driver);
		login.sendUserName();
		login.sendpassword();
		login.clickOnLoginButton();
		
		Thread.sleep(2000);

		PinPage Pin=new PinPage(driver);
		Pin.sendPin();
		Pin.clickOncontinueButton();
		Thread.sleep(2000);

        HomePage hp=new HomePage(driver);
		hp.validateUserName();
		
		hp.logOut();
		
		driver.close();
		

}
}
