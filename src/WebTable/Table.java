package WebTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
         
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		// how to find no of rows in table

		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
	     int tnor = rows.size(); 
	     System.out.println("Total number of rows in table "+tnor);
	     
	   //how to find no of columns in table
	   List<WebElement> columns = driver.findElements(By.xpath("//table//tr//th"));
	   int tnoc = columns.size();
	   System.out.println("Total number of columns in table "+tnoc);
	   
	// how to read header
	   
	   
	   for(WebElement header:columns)
	   {
		   System.out.print(header.getText()+" ");
	   }
	   
	// how to read all rows from table//..............
	List<WebElement> allRowsDtata = driver.findElements(By.xpath("//table//tr"));
	
	Iterator<WebElement> it = allRowsDtata.iterator();
	while(it.hasNext())
	{
		System.out.print(it.next().getText()+" ");
		System.out.println();
	}
	 
		
	}

}
