package TestNG_Keywords;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class InvocationCountUse {
  @Test(invocationCount=3)
  
  public void MyTest() {
	  Reporter.log("Hello",true);
  }
  @BeforeMethod
  public void Test() {
	  Reporter.log("Hiiiii",true);
  }
  @BeforeClass
  public void Test12()
  {
	  Reporter.log("byyyyyyyyy",true);  
  }
  @AfterMethod
  public void test()
  {
	  Reporter.log("wlcome",true);   
  }
  

}
