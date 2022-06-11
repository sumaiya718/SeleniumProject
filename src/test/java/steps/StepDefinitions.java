package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	ChromeDriver driver;
	
	@Given("Launch ChromeBrowser and Load URL")
	public void launchChromeBrowserAndLoadURL() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
	}

	@Given("Enter Username as (.*)")
	public void enterUsernameAsDemoSalesManager(String username) {
		driver.findElementById("username").sendKeys(username);
	}

	@Given("Enter Password as (.*)")
	public void enterPasswordAsCrmsfa(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}

	@When("Click the LogIn button")
	public void clickTheLogInButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("It's navigated HomePage")
	public void itSNavigatedHomePage() {
	    System.out.println(driver.getTitle());	
	    }

	@Then("Click the LogOut button")
	public void clickTheLogOutButton() {
		driver.findElementByClassName("decorativeSubmit").click();	}

	@Then("Close browser")
	public void closeBrowser() {
	    driver.close();	}

	/*@Given("Enter Username as Sumaiya")
	public void enterUsernameAsSumaiya() {
		driver.findElementById("username").sendKeys("Sumaiya");
	}*/

	@Then("It's navigated same page")
	public void itSNavigatedSamePage() {
		 System.out.println(driver.getTitle());
	}

	@Then("Verify error message")
	public void verifyErrorMessage() {
		 String text = driver.findElementById("errorDiv").getText();
		 System.out.println(text);
		 if(text.contains("following error occurred during login")) {
		 System.out.println("Error message is contains");
	}
	else {
		System.out.println("Error message not contains");
	}
	}
	@Given("click CRMSFA")
	public void clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("click leads link")
	public void clickLeadsLink() {
		driver.findElementByLinkText("Leads").click();
	}

	@When("click createLead")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@When("enter the company as (.*)")
	public void enterTheCompanyAsABC(String CName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(CName);

	}

	@When("enter the firstname as (.*)")
	public void enterTheFirstnameAsHema(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}

	@When("enter the lastname as (.*)")
	public void enterTheLastnameAsMali(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}

	@When("choose source as Website")
	public void chooseSourceAsWebsite() {
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd1 = new Select(src);
		dd1.selectByVisibleText("Website");
	}

	@When("click the create lead button")
	public void clickTheCreateLeadButton() {
		driver.findElementByName("submitButton").click();
	}

	@Then("its navigated ViewLeadPage")
	public void itsNavigatedViewLeadPage() {
		System.out.println(driver.getTitle());
	}

	@Then("verify the firstname")
	public void verifyTheFirstname() {
		String fName = driver.findElementById("viewLead_firstName_sp").getText();
		 System.out.println(fName);
		 if(fName.equals("Hema")) {
		 System.out.println("First name is matched");
	}
	else {
		System.out.println("First name is not matched");
	}
	}


}
