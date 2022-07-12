package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabledUse {
	 @Test
	  public void d() {
		  Reporter.log("D is running",true);
	  }
	  @Test(enabled = false)
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