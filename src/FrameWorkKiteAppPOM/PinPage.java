package FrameWorkKiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage {
	
	@FindBy(id="pin")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueButoon;
	
	public PinPage(WebDriver driver) 
	   {
		PageFactory.initElements(driver, this);
		}
	
	public void sendPin()
	{
		pin.sendKeys("982278");
		
	}
	public void clickOncontinueButton()
	{
		continueButoon.click();
	}

}
