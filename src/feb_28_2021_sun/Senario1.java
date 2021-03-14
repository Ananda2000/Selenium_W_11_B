package feb_28_2021_sun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Senario1 {

	
		public static void main(String [] args) {
			System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
			WebDriver web_28_Feb_sun = new ChromeDriver();
			
			web_28_Feb_sun.get("https://www.selenium.dev/downloads/");
			web_28_Feb_sun.manage().window().maximize();
			String aa = web_28_Feb_sun.findElement(By.xpath("//td[text()=\"Ruby\"]/../td[6]")).getText();
			web_28_Feb_sun.findElement(By.xpath("//td[text()=\"Ruby\"]/../td[6]")).click();
			
			System.out.println(aa);
		}
}
