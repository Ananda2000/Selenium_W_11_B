/*	
 *Alert/Configuration/JS popup....
 * 1. open browser, enter activeTime.com , enter username , password and login.click on user.click on Add user.
		write some name, click on close.click on cancel ..
*/
package march_13_2021_Saturday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	
	public static void main (String [] args)
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver0987 = new ChromeDriver();
		driver0987.get("https://demo.actitime.com");
		driver0987.manage().window().maximize();
		driver0987.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver0987.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver0987.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver0987.findElement(By.xpath("//div[text()='Login ']")).click();
		
		driver0987.findElement(By.xpath("//div[@id='container_users']")).click();
		driver0987.findElement(By.xpath("//div[text()='New User']")).click();
		driver0987.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("first name");
		
		driver0987.findElement(By.xpath("//div[@class='components_button cancelBtn']")).click();
		driver0987.switchTo().alert().accept();
		
		driver0987.switchTo().alert().dismiss();
		
		System.out.println("The end of the program..");
		
		
		
	}
	

}
