package feb_21_SundayClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
	public static void main(String [] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver21_feb = new ChromeDriver();
	driver21_feb.get("https://demoapp.skillrary.com/");
	driver21_feb.manage().window().maximize();
	Thread.sleep(3000);
	driver21_feb.findElement(By.linkText("LOGIN")).click();
	driver21_feb.findElement(By.id("email")).sendKeys("admin");
	
	driver21_feb.findElement(By.id("password")).sendKeys("admin");
	
	driver21_feb.findElement(By.id("last")).click();
	
	}
}
