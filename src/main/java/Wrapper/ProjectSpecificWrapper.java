package Wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificWrapper {
	
	public ChromeDriver driver;

	@BeforeMethod
	public void login() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
	
		Thread.sleep(2000);
		driver.close();
		
	}
}
