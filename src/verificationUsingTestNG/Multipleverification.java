package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Multipleverification {
  @Test
  public void Mobile()
  {
	  String p = "pooja1";
	  String v = "pooja";
	  
	  Assert.assertEquals(p,v, "values are equal TC is failed");
	  Assert.assertNotNull(v, "Value are null TC is faild");
  }
}
