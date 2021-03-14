package march_7_2021_sunday;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActions {
		public static void main(String []args) throws InterruptedException, AWTException
		{

			System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_WINDOWS);
			r.keyPress(KeyEvent.VK_DOWN);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

}
