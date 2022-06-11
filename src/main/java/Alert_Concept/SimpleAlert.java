package Alert_Concept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//input[@id='searchBtn'])[1]")).click();
		
		// Switch control to Alert from the HTML page and get the text from the Alert.
		String simpleAlert = driver.switchTo().alert().getText();
		System.out.println(simpleAlert);
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		// We can also use Alert Class. I used Alert Class in Confirmation Alert and PromptAlert Class.
		
		driver.close();
		
		
	}

}
