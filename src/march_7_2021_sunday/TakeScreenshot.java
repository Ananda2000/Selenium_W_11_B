package march_7_2021_sunday;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		
//		// taking screenshots.
//		TakeScreenshot ts = (TakeScreenshot) driver;
//		//access themethod.
//		ts.
//		
//		File src = ts.getScreenshotAs(OutputType.FILE);
		
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		// specify the required location..
		
		File dest = new File("./Software/ebay.png");
		
		// move from source to destination.
		Fileutils.copyfile(src.dest);
}
}