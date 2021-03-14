//File upload popup..

package march_13_2021_Saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
		public static void main(String [] args) {
			System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
			WebDriver driver12456 = new ChromeDriver();
			driver12456.get("https://www.naukri.com/");
			driver12456.findElement(By.xpath("//label[@id='wdgt-file-upload']")).click();
			
			
			
		}

}
