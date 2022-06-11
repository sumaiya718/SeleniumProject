package Alert_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		//By using the first method from SimpleAlert Class
		/* String PrmptAlert = driver.switchTo().alert().getText();
		System.out.println(PrmptAlert);
		driver.switchTo().alert().sendKeys("I am Groot");
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept(); */
		
		// By Alert Class
	    Alert promptAlert = driver.switchTo().alert();
		promptAlert.getText();
		
		promptAlert.sendKeys("I am a Robot.");
		
		Thread.sleep(3000);
		promptAlert.accept();
		
		// We used driver.findElement(By.id()). because earlier we used WebDriver driver = new ChromeDriver();
		// If we had used ChromeDriver driver = new ChromeDriver(); we could use driver.findElementById().
		driver.findElement(By.id("result")).getText();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		// We can also do these things in one line
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
	}

}
