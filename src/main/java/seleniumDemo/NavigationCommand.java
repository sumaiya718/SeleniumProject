package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
         
         ChromeDriver driver = new ChromeDriver();
         
        // driver.get("http://google.com");
        
         //driver.get() and driver.navigate().to() do the same thing. They open the given URL
         driver.navigate().to("http://google.com");
         
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
         // To get back from the page
         driver.navigate().back();
         
         // without .navigate.back() we can not use .navigate().forward()
         driver.navigate().forward();
         
         // To refresh the page
         driver.navigate().refresh();
         
         // Close Browser(current page/webpage)
         //driver.close();
         
         // Close all windows
         driver.quit();
        
         
	}

}
