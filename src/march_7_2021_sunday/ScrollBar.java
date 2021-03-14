package march_7_2021_sunday;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.*;

public class ScrollBar {

	
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver1290 = new ChromeDriver();
		
		driver1290.get("https://www.amazon.com/");
		
		driver1290.manage().window().maximize();
		driver1290.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele =driver1290.findElement(By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/G/01/AmazonExports/Fuji/2019/October/BubbleShoveler/AIS_Bubble_247CS_en_US_1X._CB451228332_.jpg']"));
		Point loc = ele.getLocation();
		
		int x = loc.getX();
		int y = loc.getY();
		
		JavascriptExecutor js = (JavascriptExecutor) driver1290;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		ele.click();
		
		
		
	}
}
