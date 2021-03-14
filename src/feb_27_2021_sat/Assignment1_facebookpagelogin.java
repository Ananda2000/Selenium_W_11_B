package feb_27_2021_sat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_facebookpagelogin {
	
	public static void main(String []args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver web288 = new ChromeDriver();
			
			web288.get("https://www.facebook.com/");
			web288.manage().window().maximize();
			web288.findElement(By.id("email")).sendKeys("kranandareddy1@gmail.com");;
			web288.findElement(By.id("pass")).sendKeys("");
			web288.findElement(By.name("login")).click();
			
			Thread.sleep(9000);
		String aa=	web288.getTitle();
		System.out.println(aa);
		
		if(aa.equals("(6) Facebook")) {
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
