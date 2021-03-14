package feb_21_SundayClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {

	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver21_feb = new ChromeDriver();
		driver21_feb.get("https://www.facebook.com/");
		driver21_feb.manage().window().maximize();
		Thread.sleep(3000);
		driver21_feb.findElement(By.partialLinkText("password?")).click();
		driver21_feb.findElement(By.id("identify_email")).sendKeys("THIS IS MOBILE NUMBER");
		driver21_feb.findElement(By.id("did_submit")).click();
		
		
		}
	}
	
