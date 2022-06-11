package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector_EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByCssSelector("#username").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("#password").sendKeys("crmsfa");
		driver.findElementByCssSelector(".decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//span[text()='Name and ID']").click();
		
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
		driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys("Mali");
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("TCS");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		//driver.findElementByXPath("//a[text()='10113']");
		
		Thread.sleep(2000);
		driver.close();
	
		
		

	}

}
