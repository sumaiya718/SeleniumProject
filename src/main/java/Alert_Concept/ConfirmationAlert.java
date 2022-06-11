package Alert_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByLinkText("Merge").click();
		
		// I did it like SimpleAlert Class but did not assign into any variable
		/*driver.switchTo().alert().getText();
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();*/
		
		//By Using Alert Class
		Alert CnfAlrt = driver.switchTo().alert();
		CnfAlrt.getText();
		System.out.println(CnfAlrt.getText());
		
		Thread.sleep(3000);
		CnfAlrt.dismiss();
		
		driver.quit();
	}

}
