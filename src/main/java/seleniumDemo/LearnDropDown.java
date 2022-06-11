package seleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
	         
	      ChromeDriver driver = new ChromeDriver();
	         
	      // driver.get("http://leaftaps.com/opentaps/control/login");
	        
	      //driver.get() and driver.navigate().to() do the same thing. They open the given URL
	      driver.navigate().to("http://leaftaps.com/opentaps/control/login");
	         
	      driver.manage().window().maximize();
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
	        
	        // For Source DropDown
	        WebElement src = driver.findElementById("createLeadForm_dataSourceId");
	        
	        // Creating object of Select class
	        Select dd = new Select(src);
	        
	        // Select class has 3 methods.
	        //dd.selectByVisibleText("Employee");
	        //dd.selectByValue("LEAD_EMPLOYEE");
	        dd.selectByIndex(4);
	        
	        // select Marketing Campaign DropDown
	        WebElement mktCmp = driver.findElementById("createLeadForm_marketingCampaignId");
	        
	        Select dd1 = new Select(mktCmp);
	        //dd1.selectByVisibleText("Automobile");
	        dd1.selectByValue("CATRQ_AUTOMOBILE");
	        
	        // Click Request Catalog with PartialLinkText
	        driver.findElementByPartialLinkText("Request C").click();
	        
	        // Use TagName Selector for all div Tagname
	        List<WebElement> alldiv = driver.findElementsByTagName("div");
	        System.out.println(alldiv.size());
	        
	        driver.close();
	}

}
