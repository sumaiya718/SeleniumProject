package TestNG_TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteLead {

	   public ChromeDriver driver;
	   
	  /* @BeforeMethod
	   public void login() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
			
		    driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/login");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			
			driver.findElementByLinkText("CRM/SFA").click();
			
		} */
		
	   
	   @Test
	   public void DeleteLead() throws InterruptedException {

		 
		        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
				
			    driver = new ChromeDriver();
				
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
				driver.findElementById("username").sendKeys("DemoSalesManager");
				driver.findElementById("password").sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
				
				driver.findElementByLinkText("CRM/SFA").click();
		   
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
	
				// click on phone
				driver.findElementByXPath("//span[text()='Phone']").click();
			
				// enter phone number(areaCode)
				driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("201");
				// enter phone number
				driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("1234567");
				
				// click on email
				// driver.findElementByXPath("//span[text()='Email']").click();
				// enter email address
				// driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@abc.com");
				
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				
				Thread.sleep(2000);
				driver.close();
				
	}

	/*  @AfterMethod
	  public void close() {
		
			driver.close();
			
		}*/
}
