package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver12 = new ChromeDriver();
	
	//driver12.get("https://www.amazon.in/");
	//driver12.get("https://www.facebook.com/");
	//driver12.get("https://www.flipkart.com");
	
	driver12.manage().window().maximize();
	System.out.println(driver12.getCurrentUrl());
	
	System.out.println(driver12.getTitle());
	
	driver12.navigate().back();
	Thread.sleep(3000);
	
	driver12.navigate().forward();
	Thread.sleep(4000);
	
	driver12.navigate().refresh();
	
	
	
	
	
	}

}
