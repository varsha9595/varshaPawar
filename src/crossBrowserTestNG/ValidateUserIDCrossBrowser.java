package crossBrowserTestNG;

import java.io.IOException;
import java.time.Duration;
import java.util.jar.Attributes.Name;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import KitePOMusingExcel.KiteHomePage;
import KitePOMusingExcel.KiteLoginPage;
import KitePOMusingExcel.KitePinPage;
import kiteAppProperties.UtilityProp;
import kiteBaseeee.Base;
import kiteUtilityeeeeeee.Utility;

@Listeners(crossBrowserTestNG.ListenerTest1.class)

public class ValidateUserIDCrossBrowser extends BaseNewCrossBrowser {
 KiteHomePage home;
 KiteLoginPage login;
 KitePinPage pin;
 String TCID="5555";
 @Parameters("browserName")
 
 @BeforeClass
  public void launchBrowser( @Optional String name) throws IOException 
 {
	 if(name.equals("firefox"))
	 {
		 openBrowserfirefox();
	 }
	 else if(name.equals("chrome"))
	 {
	 openBrowserchrome();
	 }
	 login = new KiteLoginPage(driver);
	 pin = new KitePinPage(driver);
	 home = new KiteHomePage(driver);
  }
 @BeforeMethod
 public void loginToKiteApp() throws EncryptedDocumentException, IOException
 {
	 login.sendUserName(UtilityProp.getDataFromPropertyFile("UN"));
	 login.sendpassword(UtilityProp.getDataFromPropertyFile("PWD"));
	 login.clickOnLoginButton();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 
	 pin.sendPin(UtilityProp.getDataFromPropertyFile("PIN"));
	 pin.clickOncontinueButton();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
 }
 
 @Test
 public void validateUserID() throws EncryptedDocumentException, IOException
 {
	 Assert.assertEquals(home.getActualUserName(), UtilityProp.getDataFromPropertyFile("UN"));
	 BaseNewCrossBrowser.captureScreenShot(TCID);
 }

 
 @AfterMethod
 public void logOutFromKite() throws InterruptedException
 {
	 
	home.logOut(); 
 
 }

@AfterClass
public void closeBrowser()
{
	driver.close();
}

}


