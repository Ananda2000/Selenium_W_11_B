package march_13_2021_Saturday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver0987_3 = new ChromeDriver();
		
		driver0987_3.get("https://demo.actitime.com");
		driver0987_3.manage().window().maximize();
		driver0987_3.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver0987_3.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver0987_3.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver0987_3.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
		
	}

}
