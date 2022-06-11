package seleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        //driver.findElementByLinkText("Try it Yourself »").click();
        
        driver.findElementByXPath("//a[text()='Try it Yourself »']").click();
        
        //For Current Window
        String firstWin = driver.getWindowHandle();
        
        //For All The Windows
        Set<String> allWin = driver.getWindowHandles();
        
        System.out.println(allWin);
        
        for(String eachWin : allWin) 
        {
        	System.out.println(eachWin);
        	
        	driver.switchTo().window(eachWin);
        	
        	System.out.println(driver.getTitle());
        }
        
        driver.switchTo().frame("iframeResult");
        
        Thread.sleep(2000);
        
        driver.findElementByXPath("//button[text()='Try it']").click();
        
        
       /* Set<String> allWin2 = driver.getWindowHandles();
        for(String eachWin2 : allWin2) 
        {
        	System.out.println(eachWin2);
        	
        	driver.switchTo().window(eachWin2);
        	
        	System.out.println(driver.getTitle());
        }
        // Works */
        
        
        
        Thread.sleep(2000);
        
        driver.switchTo().window(firstWin);
        
        System.out.println(driver.getTitle());
  
        Thread.sleep(2000);
        
        driver.quit();
	}

}
