package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
        
        // Creating an object of ChromeDriver class.
		ChromeDriver driver = new ChromeDriver();		
		
		// Load URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Maximize the window
	    driver.manage().window().maximize();
	    

		// Implicitly Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	   
		// Enter Username
	    driver.findElementById("username").sendKeys("DemoSalesManager");
	    
	    // Enter Password
	    driver.findElementById("password").sendKeys("crmsfa");
	    
	    // Click login
        driver.findElementByClassName("decorativeSubmit").click();
        
        // Click CRM/SFA
        driver.findElementByLinkText("CRM/SFA").click();
        
        // Click Leads
        driver.findElementByLinkText("Leads").click();
        
        //Click Create Lead
        driver.findElementByLinkText("Create Lead").click();
        
        // Enter COmpany Name
        driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
        
        // Enter FirstName
        driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
        
        // Enter LastName
        driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
        
        
        // Explicitly Wait
        Thread.sleep(200);
        
        
        // Click Create Lead
        driver.findElementByName("submitButton").click();
        
	}

}
