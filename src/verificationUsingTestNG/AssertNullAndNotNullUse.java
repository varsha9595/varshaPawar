package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullAndNotNullUse
{
	//5.Null
	
  //@Test
  //public void charger()
  //{
	//  String n = null;
	  //String p = "pooja";
	  
	  //Assert.assertNull(n,"value is not null TC is failed");
	  //Reporter.log("value is null TC is passed",true);
	  
	  
  //}
  @Test
  public void charger1()
  
  //6.NotNull
  
  {
	  String n = null;
	  String p = "pooja";
	  
	  Assert.assertNotNull(p,"value is  null TC is failed");
	  Reporter.log("value is Not null TC is passed",true);
	  
	  
	  //7.Fail
	  
	  Assert.fail();
  }
}
