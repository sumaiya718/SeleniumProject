package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		
		//WebElement src = driver.findElementById("draggable");
		//WebElement dest = driver.findElementById("droppable");
		
		WebElement src = driver.findElementByXPath("//div[@id='draggable']");
		WebElement dest = driver.findElementByXPath("//div[@id='droppable']");
		
		
		Actions action = new Actions(driver);
		
		Thread.sleep(2000);
		
		action.dragAndDrop(src, dest).perform();
		
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		
		driver.findElementByLinkText("Selectable").click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
