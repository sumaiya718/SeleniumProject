package TC_ConnectInheritanceConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Wrapper.ProjectSpecificWrapper;

public class EditLead extends ProjectSpecificWrapper {

	

	
	
	@Test
	public  void EditLead()  {
		// TODO Auto-generated method stub

		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//span[text()='Name and ID']").click();
		
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
		driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys("Mali");
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("TCS");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		
		
	}


}
