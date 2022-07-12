package FrameWorkKiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KIteLoginPage {

	
		// step1.Data members
	
	@FindBy(id="userid")private WebElement userName;
	@FindBy(id="password")private WebElement password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement loginButton;
	
	// step2.constructur
	
	public KIteLoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	

	// step3.Methods
	
	public void sendUserName()
	{
		userName.sendKeys("ELR321");
	}
	
	public void sendpassword()
	{
		password.sendKeys("Dhana1111");
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}


		
	
		
	}	


