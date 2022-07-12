package includeUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Pooja {
	@Test
	  public void d() {
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
