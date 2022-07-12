package KitePOMusingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	
		// step1.Data members
	
	@FindBy(id="userid")private WebElement userName;
	@FindBy(id="password")private WebElement password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement loginButton;
	
	// step2.constructur
	
	public KiteLoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	

	// step3.Methods
	
	public void sendUserName(String UserName)
	{
		userName.sendKeys(UserName);
	}
	
	public void sendpassword(String passWord)
	{
		password.sendKeys(passWord);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}


		
	
		
	}	


