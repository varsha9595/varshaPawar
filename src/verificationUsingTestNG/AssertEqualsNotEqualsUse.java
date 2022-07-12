package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsNotEqualsUse 
{
  //@Test
  //public void myMethod()
	
	//3.EQUALS
	
  //{
	//  String v= "varsha";
	  //String p= "varsha";
	  
	  //Assert.assertEquals(v, p,"v and p value are not matching Tc is faild");
	  //Reporter.log(" v and p values are matching TC is Passed",true);
  //}
  @Test
  public void myMethod1() 
  
  //4.NOT EQUALS
  
  {
	  String v= "varsha";
	  String p= "varsha1";
	  
	  Assert.assertNotEquals(v, p,"v and p value are  matching Tc is faild");
	  Reporter.log(" v and p values are Not matching TC is Passed",true);
  }
}
