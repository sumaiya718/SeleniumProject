package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
	
       ChromeDriver driver = new ChromeDriver();
       
       driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
       
       driver.manage().window().maximize();
       
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       
       // Way-1 ->
       //driver.switchTo().frame("iframeResult");
       
       // Way-2 ->
       //driver.switchTo().frame(0);
       
       // Way-3 ->
       /*WebElement iFrame = driver.findElementByXPath("//iframe[@id='iframeResult']");
       driver.switchTo().frame(iFrame); */
       
       // or we can do Way-3 like this 
       driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));
       
       driver.findElementByXPath("//input[@id='fname']").clear();
       driver.findElementByXPath("//input[@id='fname']").sendKeys("Sumaiya");
       driver.findElementByXPath("//input[@id='lname']").clear();
       driver.findElementByXPath("//input[@id='lname']").sendKeys("Chowdhury");
       
       Thread.sleep(2000);
       driver.findElementByXPath("//input[@type='submit']").click();
       
       //driver.switchTo().defaultContent();
       driver.switchTo().parentFrame();
	   
	   Thread.sleep(3000);
	   
	   driver.close();
	
	
	}

}
