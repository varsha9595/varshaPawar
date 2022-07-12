package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
  @Test(priority=1)
  public void d() {
	  Reporter.log("D is running",true);
  }
  @Test(priority=3)
  public void f() {
	  Reporter.log("f is running",true);
  }
  @Test(priority=4)
  public void a() {
	  Reporter.log("a is running",true);
  }
  @Test(priority=2)
  public void c() {
	  Reporter.log("c is running",true);
  }
  
}
