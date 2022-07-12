package listener;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerTest1 extends BaseNew implements ITestListener{

	BaseNew b =new BaseNew();
	@Override
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("Take Screenshot"+result.getName(),true);

       String TCID = result.getName();
       File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File dest=new File("D:\\Software Testing Data\\JAVA Class nots\\MyScreenShot\\MyScreenshot9595"+TCID+".png");
	   try {
		FileHandler.copy(scr, dest);
	} 
	  catch (IOException e) 
	{
		
		e.printStackTrace();
	}
	   
	   
	   
}

	
	@Override
	public void onTestSuccess(ITestResult result) {
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
}
