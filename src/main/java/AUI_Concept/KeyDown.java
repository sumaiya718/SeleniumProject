package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		WebElement Item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement Item2 = driver.findElementByXPath("//li[text()='Item 2']");
		WebElement Item5 = driver.findElementByXPath("//li[text()='Item 5']");
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).click(Item1).click(Item2).click(Item5).release().perform();
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}

}
