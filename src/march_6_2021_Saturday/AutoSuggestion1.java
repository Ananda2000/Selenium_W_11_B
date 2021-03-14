package march_6_2021_Saturday;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {

	public static void main(String [] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver web_6_March_satur = new ChromeDriver();
	
	web_6_March_satur.get("https://www.google.com/");
	web_6_March_satur.manage().window().maximize();
	web_6_March_satur.findElement(By.name("q")).sendKeys("selenium py");
	
	Thread.sleep(3000);
	List<WebElement> ele2 = web_6_March_satur.findElements(By.xpath("//div [@class='sbl2']"));
	System.out.println("---------------1");
	int size = ele2.size();
	System.out.println(size);
	for (WebElement webElement12 : ele2) {
		System.out.println("---------------3");
		System.out.println(webElement12.getText());
		
	}
	
	}
	
}
