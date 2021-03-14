package feb_21_SundayClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoignPage {
	
	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver21_feb = new ChromeDriver();
		//driver21_feb.get("https://www.facebook.com/");
		driver21_feb.get("https://demo.actitime.com/login.do");
		driver21_feb.manage().window().maximize();
		
		driver21_feb.findElement(By.id("username")).sendKeys("admin");
		driver21_feb.findElement(By.name("pwd")).sendKeys("manager");
		driver21_feb.findElement(By.id("loginButton")).click();
		System.out.println("Successfully logged in.");
	}

}
