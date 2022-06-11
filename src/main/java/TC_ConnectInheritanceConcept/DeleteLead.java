package TC_ConnectInheritanceConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Wrapper.ProjectSpecificWrapper;

public class DeleteLead extends ProjectSpecificWrapper{

	   
	   
	   
	   @Test
	   public void DeleteLead()  {

		 
		
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
				
				
				
	}

}
