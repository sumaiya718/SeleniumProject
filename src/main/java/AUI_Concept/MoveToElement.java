package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	       
	    driver.get("http://mrbool.com/");
	       
	    driver.manage().window().maximize();
	       
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	    //WebElement MTE = driver.findElementByClassName("menulink");
	    //By using XPath for practicing
	    WebElement MTE = driver.findElementByXPath("//a[@class='menulink']");
	    
	    Actions action = new Actions(driver);
	    
	    action.moveToElement(MTE).perform();
	    
	    Thread.sleep(2000);
	    
	    driver.findElementByXPath("(//a[text()='Courses'])[2]").click();
	    
	    Thread.sleep(2000);
	    
	    driver.close();
	    
	    
	       
	}

}
