package kitePOMusingTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage1 {
	
	@FindBy(id="pin")private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueButoon;
	
	public KitePinPage1(WebDriver driver) 
	   {
		PageFactory.initElements(driver, this);
		}
	
	public void sendPin(String pin)
	{
		PIN.sendKeys(pin);
		
	}
	public void clickOncontinueButton()
	{
		continueButoon.click();
	}

}
