package GrupingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass2 {
  @Test(groups = {"sanity"})
  public void p() 
  {
	  Reporter.log("p is running sanity ",true);
  }
  @Test(groups = {"regression"})
  public void q() 
  {
	  Reporter.log("p is running regression ",true);
  }
  @Test(groups = {"sanity"})
  public void r() 
  {
	  Reporter.log("p is running sanity ",true);
  }
  @Test(groups = {"regression"})
  public void s() 
  {
	  Reporter.log("p is running regression ",true);
  }
}
