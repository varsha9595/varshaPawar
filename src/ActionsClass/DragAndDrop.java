package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//find source and destination
		
		//WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[1]"));
		
		WebElement source = driver.findElement(By.id("box6"));
		WebElement destination = driver.findElement(By.id("box106"));
		Actions act= new Actions(driver);
		act.dragAndDrop(source, destination).perform();
		
	}

}
