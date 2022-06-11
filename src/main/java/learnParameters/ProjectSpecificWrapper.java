package learnParameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrapper {

	public ChromeDriver driver;

	@Parameters({"url","uname","pwd"})
	
	
	@BeforeMethod
	public void login(String url,String uname, String pwd) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys(uname);
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
	
		Thread.sleep(2000);
		driver.close();
		
	}
	
	@DataProvider
	public String[][] getData() {
		
		//Creating object of a 2D Array
		String[][] data = new String[3][3];
		data[0][0] = "TCS";
		data[0][1] = "Sumaiya";
		data[0][2] = "Chowdhury";
		
		data[1][0] = "ABC";
		data[1][1] = "Touhid";
		data[1][2] = "Choudhury";
		
		data[2][0] = "CTS";
		data[2][1] = "Mahbuba";
		data[2][2] = "Daisy";
		
		return data;
	}
}
