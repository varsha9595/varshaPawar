package FrameWorkKiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//span[@class='user-id']")private WebElement userName;
	@FindBy(xpath="//a[@target='_self']")private WebElement logOutButton;
	

	public  HomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public void validateUserName()
	{
		String expectedUserName="ELR321";
		String actualUserName=userName.getText();
		
		if(expectedUserName.equals(actualUserName))
		{
			System.out.println("Actual and Expected User Id are matching TC is passed");
		}
		else
		{
			System.out.println("Actual and Expected User Id are not matching TC is failed");	
		}
		
		
	}
	public void logOut() throws InterruptedException
	{
		userName.click();
		Thread.sleep(1000);
		logOutButton.click();
		
		
	}
	
}
