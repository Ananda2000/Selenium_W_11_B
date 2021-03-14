package feb_27_2021_sat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	
	public static void main(String [] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver27_feb = new ChromeDriver();
	driver27_feb.get("https://demo.actitime.com/login.do");
	driver27_feb.manage().window().maximize();

		driver27_feb.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver27_feb.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		
		driver27_feb.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(4000);
		String title = driver27_feb.getTitle();
		System.out.print("The current url,"+title);
		System.out.println(" ---");
		//if(title.equals("actiTIME - Login")) {
		if(title.equals("actiTIME - Enter Time-Track")) {
			System.out.println("login is successfulll");
		}
		else {
			System.out.println("Login is failed.");
		}
		
		driver27_feb.close();
		
		//driver27_feb.close();
}
}
