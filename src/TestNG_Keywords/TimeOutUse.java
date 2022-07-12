package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {
	@Test(timeOut = 1000)
	  public void d() throws InterruptedException {
		Thread.sleep(2000);
		  Reporter.log("D is running",true);
	  }
	  @Test
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
