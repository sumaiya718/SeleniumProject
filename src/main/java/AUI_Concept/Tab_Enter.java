package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab_Enter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	       
	    driver.get("https://www.facebook.com/");
	       
	    driver.manage().window().maximize();
	       
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	    driver.findElementById("email").sendKeys("abc@gmail.com");
	    
	    Thread.sleep(1000);
	    
	    Actions action = new Actions(driver);
	    
	    action.sendKeys(Keys.TAB).sendKeys("123").build().perform();
	    
	    Thread.sleep(2000);
	    action.sendKeys(Keys.ENTER).perform();
	    
	    Thread.sleep(2000);
	    action.sendKeys(Keys.TAB).perform();
	    
	    Thread.sleep(1000);
	    action.sendKeys(Keys.TAB).perform();
	    
	    Thread.sleep(2000);
	    action.sendKeys(Keys.ENTER).perform();
	    
	    Thread.sleep(2000);
	    driver.quit();
	}

}
