package TestNG_Keywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethod {
	@Test
	  public void d() {
		Assert.fail();
		  Reporter.log("D is running",true);
	  }
	  @Test(dependsOnMethods= {"d"},priority =-2)
	  public void f() {
		  Reporter.log("f is running",true);
	  }
	  @Test
	  public void a() {
		  Reporter.log("a is running",true);
	  }
	  @Test
	  public void c() {
		  Reporter.log("c is running",true);
	  } 
}
