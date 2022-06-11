package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
        
        // Creating an object of ChromeDriver class.
		ChromeDriver driver = new ChromeDriver();		
		
		// Load URL
		driver.get("https://jqueryui.com/selectable/");
		
		// Maximize the window
	    driver.manage().window().maximize();
	    

		// Implicitly Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//ol[@id='selectable']/li[5]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//ol[@id='selectable']/li[7]").click();
		
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		
		Thread.sleep(3000);
		
		driver.findElementByLinkText("Demos").click();
		
		Thread.sleep(3000);
		
		driver.close();		
	}

}
