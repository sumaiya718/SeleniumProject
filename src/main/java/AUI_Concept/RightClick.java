package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement RightCl = driver.findElementByXPath("//span[text()='right click me']");
	    
	    Actions action = new Actions(driver);
	    
	    action.contextClick(RightCl).perform();
	    
	    Thread.sleep(2000);
	    
	    driver.findElementByXPath("//ul[@class='context-menu-list context-menu-root']/li[7]").click();
	    
	    Thread.sleep(2000);
	    
	    //Practicing simple alert with this without Alert class
	    /*driver.switchTo().alert().getText();
	    driver.switchTo().alert().accept();*/
	    
	    
	    ///Practicing simple alert with this with Alert class
	    Alert simpAlert = driver.switchTo().alert();
	    simpAlert.getText();
	    
	    System.out.println(simpAlert.getText());
	    simpAlert.accept();
	    
	    Thread.sleep(2000);
	    
		driver.quit();
		
	}

}
