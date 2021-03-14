/*5. open browser, enter url facebook.com.., open the new tab, enter amazon.com url.. search for phone in amazon search box.
		come back to facebook application... click on forgot password. close both the tabs.
		*/

package march_13_2021_Saturday;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String [] args) throws AWTException, InterruptedException
	{
		// setting up the driver path....
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver12456 = new ChromeDriver();
		driver12456.get("https://www.facebook.com/");
		driver12456.manage().window().maximize();
		
		
		Robot r = new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		r.keyRelease(KeyEvent.VK_TAB);
		
		System.out.println("Reached end of the file..");
		
		
	}
}
