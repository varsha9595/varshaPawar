package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationsStudy {
  @Test
  public void ValidateUserID() {
	  Reporter.log("User ID validate",true);
  }
  @Test
  public void Validate_Dashboard() {
	  Reporter.log("Validate Dashboard",true);
  }
  
  @BeforeMethod
  public void LogintoKiteApp() {
	 Reporter.log("Login Success",true);
  }

  @AfterMethod
  public void lonchBrowser() {
	  Reporter.log("lonchBrowser",true);
  }

  @BeforeClass
  public void LogOut() {
	  Reporter.log("Log OutBrowser",true);
  }

  @AfterClass
  public void Closebrowser() {
	  Reporter.log("close Browser",true);
  }

}
