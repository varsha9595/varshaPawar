package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueAndFalseUse 
{
	
	//1.True
	
//  @Test
  //public void Display()
  //{
	//  boolean s = true;
	  //boolean r = false;
	  
	  //Assert.assertTrue(r, "value is false TC is faild");
	  //Reporter.log("value is true TC is passed",true);
  //}
	
	//2.false
	
  @Test
  public void Display1()
  {
	  boolean s = true;
	  boolean r = false;
	  
	  Assert.assertFalse(r, "value is true TC is faild");
	  Reporter.log("value is false TC is passed",true);
  }
  
}
