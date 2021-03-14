package march_6_2021_Saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_MouseHover {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver webDrop_actions= new ChromeDriver();
		
		webDrop_actions.get("https://luxire.com/");
		WebElement ele = webDrop_actions.findElement(By.linkText("Account"));
		
		Actions aa = new Actions(webDrop_actions);
		aa.moveToElement(ele).perform();
		
		
		webDrop_actions.findElement(By.linkText("Login")).click();
		webDrop_actions.close();
		
	}
}
